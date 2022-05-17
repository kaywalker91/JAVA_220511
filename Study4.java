package Study0511;

import java.util.*;

public class Study4 
{	
	public static void main(String[] args) 
	{		
		Aircon1 a = new Aircon1();
		Thread th = new Thread(a);
		th.start();
		
		a.AriConStart();	
	}
}
class Aircon1 implements Runnable
{
	 Scanner sc = new Scanner(System.in );
	 int nowTempo = 28; //현재온도
	 boolean check = false; 
	 int setTempo = 20; //설정온도	

	void AriConStart()
	{		
		int select;		
		while(true)
		{
			System.out.println("----------------");
			System.out.println("현재온도: " + nowTempo +"도");
			System.out.println("설정온도: " + setTempo +"도");
			System.out.println("----------------");
			System.out.println("1.온도설정");
			System.out.println("2.에어컨가동");
			System.out.println("3.에어컨중단");
			System.out.println("4.종료");
			System.out.print("선택:"); 
			select = sc.nextInt();
			
			if(select == 1) 
			{
				System.out.print("\n설정온도:"); int temp = sc.nextInt();
				setTempo = temp;
			}
			else if(select == 2) 
			{
				System.out.println("\n에어컨이 동작합니다!\n");
				check = true;			
			}
			else if(select == 3) 
			{
				System.out.println("\n강제로 에어컨 중단!\n");
				check = false;	
			}
			else if(select == 4) 
			{break;}
		}	
		System.out.println("프로그램 종료.");	
	}
	
	public void run() 
	{				
		while(true)
		{
			if(check == true)
			{
				int tempT = (int)(Math.random()*2);
				nowTempo = nowTempo - tempT; 
				try 
				{
					Thread.sleep(1000);				
					System.out.println("현재온도:" + nowTempo + "도");					
				} catch (InterruptedException e) 
				{}	
				
				if(nowTempo==setTempo)
				{
					System.out.println("\n설정온도에 맞춰졌습니다. 에어컨동작스톱!\n");
					check = false;
				}
			}			
		}
	}	
}

package Study0511;

import java.util.Scanner;

public class Study107_aircon2 
{
	static int curTempo = 28; //현재온도
	static boolean chec = true;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in );
		
		int setTem = 20; //설정온도
		int select;
		
		while(true)
		{
			System.out.println("----------------");
			System.out.println("현재온도: " + curTempo +"도");
			System.out.println("설정온도: " + setTem +"도");
			System.out.println("----------------");
			System.out.println("1.온도설정");
			System.out.println("2.에어컨가동");
			System.out.println("3.에어컨중단");
			System.out.println("4.종료");
			System.out.print("선택:"); 
			select = sc.nextInt();
			
			if(select == 1) 
			{
				System.out.print("설정온도:"); 
				int temp = sc.nextInt();
				setTem = temp;
			}
			else if(select == 2) 
			{
				Temp t = new Temp();
				Thread th = new Thread(t);
				th.start();	
			}
			else if(select == 3) 
			{}
			else if(select == 4) 
			{break;}
		}	
		System.out.println("프로그램 종료.");	
	}
}
class Tem implements Runnable
{
	public void run() 
	{		
		while(true)
		{
			if(Study107_aircon2.chec == true)
			{
				int tempT = (int)(Math.random()*2);
				Study107_aircon2.curTempo = Study107_aircon2.curTempo - tempT; 
		
				try 
				{
					Thread.sleep(1000);				
					System.out.println("현재온도:" + Study107_aircon2.curTempo + "도");								
				} catch (InterruptedException e) 
				{}
				if(Study107_aircon2.curTempo==18)
				{
					Study107_aircon2.chec = false;
				}
			}	
		}
	}	
}

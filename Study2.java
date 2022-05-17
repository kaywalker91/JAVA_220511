package Study0511;

import java.util.*;

public class Study2 
{
	static int nowTempo = 28; //현재온도
	static boolean check = true; 
	
	public static void main(String[] args) 
	{
		
		int setTempo = 20; //설정온도
		
		Scanner sc = new Scanner(System.in);
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
			System.out.print("선택:"); select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("\n설정온도:"); int temp = sc.nextInt();
				setTempo = temp;
			}
			else if(select == 2) {
				
				Temp t = new Temp();
				Thread th = new Thread(t);
				th.start();
				
			}
			else if(select == 3) {}
			else if(select == 4) {break;}
		}	
		System.out.println("프로그램 종료.");	
	}

}
class Temp implements Runnable{
	public void run() {		
		
		while(true)
		{
			if(Study2.check == true)
			{
				int tempT = (int)(Math.random()*2);
				Study2.nowTempo = Study2.nowTempo - tempT; 
			

				try 
				{
					Thread.sleep(1000);				
					System.out.println("현재온도:" + Study2.nowTempo + "도");								
				} catch (InterruptedException e) {	
					
				}
				
				if(Study2.nowTempo==18)
				{
					Study2.check = false;
				}
			}	
		}
	}	
}

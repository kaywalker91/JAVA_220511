package Study0511;

import java.util.*;

public class Study2 
{
	static int nowTempo = 28; //����µ�
	static boolean check = true; 
	
	public static void main(String[] args) 
	{
		
		int setTempo = 20; //�����µ�
		
		Scanner sc = new Scanner(System.in);
		int select;
		
		while(true)
		{
			System.out.println("----------------");
			System.out.println("����µ�: " + nowTempo +"��");
			System.out.println("�����µ�: " + setTempo +"��");
			System.out.println("----------------");
			System.out.println("1.�µ�����");
			System.out.println("2.����������");
			System.out.println("3.�������ߴ�");
			System.out.println("4.����");
			System.out.print("����:"); select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("\n�����µ�:"); int temp = sc.nextInt();
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
		System.out.println("���α׷� ����.");	
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
					System.out.println("����µ�:" + Study2.nowTempo + "��");								
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

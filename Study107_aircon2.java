package Study0511;

import java.util.Scanner;

public class Study107_aircon2 
{
	static int curTempo = 28; //����µ�
	static boolean chec = true;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in );
		
		int setTem = 20; //�����µ�
		int select;
		
		while(true)
		{
			System.out.println("----------------");
			System.out.println("����µ�: " + curTempo +"��");
			System.out.println("�����µ�: " + setTem +"��");
			System.out.println("----------------");
			System.out.println("1.�µ�����");
			System.out.println("2.����������");
			System.out.println("3.�������ߴ�");
			System.out.println("4.����");
			System.out.print("����:"); 
			select = sc.nextInt();
			
			if(select == 1) 
			{
				System.out.print("�����µ�:"); 
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
		System.out.println("���α׷� ����.");	
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
					System.out.println("����µ�:" + Study107_aircon2.curTempo + "��");								
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

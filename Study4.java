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
	 int nowTempo = 28; //����µ�
	 boolean check = false; 
	 int setTempo = 20; //�����µ�	

	void AriConStart()
	{		
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
			System.out.print("����:"); 
			select = sc.nextInt();
			
			if(select == 1) 
			{
				System.out.print("\n�����µ�:"); int temp = sc.nextInt();
				setTempo = temp;
			}
			else if(select == 2) 
			{
				System.out.println("\n�������� �����մϴ�!\n");
				check = true;			
			}
			else if(select == 3) 
			{
				System.out.println("\n������ ������ �ߴ�!\n");
				check = false;	
			}
			else if(select == 4) 
			{break;}
		}	
		System.out.println("���α׷� ����.");	
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
					System.out.println("����µ�:" + nowTempo + "��");					
				} catch (InterruptedException e) 
				{}	
				
				if(nowTempo==setTempo)
				{
					System.out.println("\n�����µ��� ���������ϴ�. ���������۽���!\n");
					check = false;
				}
			}			
		}
	}	
}

package Study0511;

import java.util.*;
import java.util.Scanner;

public class Study105_aircon 
{
	static int nowTempo1 = 28; //����µ�
	static boolean check1 = true;
	
	Scanner sc = new Scanner(System.in);
	
	public static int currenttem=28,inputtem=20;
	int sel;
	
	public static void main(String[] args) 
	{
		Aircon aircon = new Aircon();
	}
}

class Aircon
{
	Scanner sc = new Scanner(System.in);
	
	int currenttem=28,inputtem=20;
	int sel;
	
	Aircon()
	{
		while(true)
		{
			mainmenu();
			
			if(sel == 1)
			{
				settem();
			}
			else if(sel == 2)
			{
				Temran temran = new Temran();
				Thread th1 = new Thread(temran);
				th1.start();
			}
			else if(sel == 3)
			{
				airast();
			}
			else if(sel == 4)
			{
				System.out.println("����.");
				break;	
			}
		}
	}
	
	void mainmenu()
	{
		System.out.println("[------------]");
		System.out.println("  ����µ�: "+currenttem+"��");
		System.out.println("  �����µ�: "+inputtem+"��");
		System.out.println("[------------]");
		System.out.println("1.�µ�����");
		System.out.println("2.����������");
		System.out.println("3.�������ߴ�");
		System.out.println("4.����");
		System.out.print("����:");
		sel = sc.nextInt();
		System.out.println();	
	}
	
	void settem()
	{
		System.out.print("�����µ�: ");
		inputtem = sc.nextInt();
		
		System.out.println();
	}
	
	void airast()
	{
		
	}
}

class Temran implements Runnable 
{
	public void run() 
	{
		while(true)
		{
			if(Study105_aircon.check1 == true)
			{
				int tempT = (int)(Math.random()*2);
				Study105_aircon.nowTempo1 = Study105_aircon.nowTempo1 - tempT; 
			
				try 
				{
					Thread.sleep(1000);				
					System.out.println("����µ�:" + Study105_aircon.nowTempo1 + "��");								
				} catch (InterruptedException e) 
				{}
				
				if(Study105_aircon.nowTempo1 == Study105_aircon.inputtem)
				{
					Study105_aircon.check1 = false;
				}
			}
		}
	}
}

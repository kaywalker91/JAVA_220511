package Study0511;

import java.util.*;

public class Study104_thread 
{

	public static void main(String[] args) 
	{
		Test test = new Test();
		Thread th = new Thread(test);
		th.start();
	}

}

class Test implements Runnable
{
	public void run() 
	{
		for(int i=0; i<50; i++) 
		{
			try 
			{
				Thread.sleep(1000);
				Date date = new Date();
				System.out.println("현재시간:"+date.toString()+"i값:" + i);
			} 
			catch (InterruptedException e) 
			{}
		}
	}
}
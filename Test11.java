package Study0511;

public class Test11 {

	public static void main(String[] args) 
	{
		int currenttem=28,inputtem=20;
		int sel;
		
		while(true)
		{
			currenttem = currenttem - (int)(Math.random()*2);
			System.out.println("현재온도: "+ currenttem);
		}
	}

}

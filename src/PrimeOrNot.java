import java.util.Scanner;

public class PrimeOrNot{

	public void FindPrimeOrNot ()
	{
		Scanner ScnObj = new Scanner (System.in);
		
		System.out.println("Pls enter any number");
		int number = ScnObj.nextInt();
		
		Boolean ifPrimevalue = true;
		for (int i=2; i<number; i++)
		{
			if (number % i == 0)
			{
				ifPrimevalue = false;
				System.out.println("It is not a prime number");
				break;
			}
			if ((i+1) == number)	
			{
				if (ifPrimevalue==true)
			{
				System.out.println("It is a prime number");
			}
		}
		
	}
	}
}

import java.util.Scanner;

public class OddOrEven 
	{
	public void FindOddorEven()
	{
		Scanner Scnobj= new Scanner(System.in);
	
		System.out.println("Please enter a number");
		int number = Scnobj.nextInt();
		
		int Moduls = number%2;
		if (Moduls == 0)
		{
			System.out.println("Number is even");
			
		}
		else
		{
			System.out.println ("Number is odd");
		}
	}
}

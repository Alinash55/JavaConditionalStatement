import java.util.Scanner; 

public class Calculator {

	Scanner ScnObj = new Scanner (System.in);
	String OperationType;
	
	public void DoCalc ()
	{
		System.out.println("Hey user, pls input your choice of any one type of operation from +,-,*,/");
		OperationType = ScnObj.next ();
		Calculator Objcalc = new Calculator ();
		
	
		if (OperationType== "+")
		{
			Objcalc.Add ();
		}
		
		else if (OperationType== "-")
		{
			Objcalc.Sub();
		}
		else if (OperationType== "*")
		{
			Objcalc.Multiply ();
		}
		else if (OperationType== "/")
		{
			Objcalc.Division ();
		}
		else
		{
			System.out.println ("Error!! Pls select your choice from either +, -, *, /");
		}
	}
	public void Add ()
	{
		System.out.println("Pls input two numbers");
		int FirstNum = ScnObj.nextInt();
		int SecNum = ScnObj.nextInt();
		
		int total = FirstNum + SecNum;
		System.out.println(" Result of Addition is" + total);
		
		
	}
	public void Sub(){
		System.out.println("Pls input two numbers, your first number should be greter than first number");
		
		int FirstNum = ScnObj.nextInt();
		int SecNum = ScnObj.nextInt();
		
		if (FirstNum > SecNum)
		{
			int total = FirstNum - SecNum;
			System.out.println(" Result of Subtraction is" + total);
		}
			
			else {
			System.out.println("Error!!! Pls input first number greater than the second number");
			}
		
		}
		
		public void Multiply() {
			System.out.println("Pls input two numbers, and make sure none of the numbers is zero");
			
			int FirstNum = ScnObj.nextInt();
			int SecNum = ScnObj.nextInt();
			
			if (FirstNum != 0)
			{
				if (SecNum !=0)
				{
					int total = FirstNum * SecNum;
					System.out.println(" Result of Multiplication is" + total);
				}
				else {
				System.out.println("Error!!! Pls input none zero number");
				}
			}
		}
		
		public void Division() {
			System.out.println("Pls input two numbers, and make sure none of the numbers is zero");
			
			int FirstNum = ScnObj.nextInt();
			int SecNum = ScnObj.nextInt();
			
			if (FirstNum != 0)
			{
				if (SecNum !=0)
				{
					int total = FirstNum / SecNum;
					System.out.println(" Result of Division is" + total);
				}
				else {
				System.out.println("Error!!! Pls input none zero number");
				}
			}
		}
}

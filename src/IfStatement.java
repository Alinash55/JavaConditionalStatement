import java.util.Scanner;

public class IfStatement {

	public void NumberCompare ()
	{
		Scanner ScnObj = new Scanner (System.in);
		
		System.out.println ("Input First Number..");
		int FirstNum = ScnObj.nextInt ();
		
		System.out.println ("Input Sec Number..") ;
		int SecNum = ScnObj.nextInt ();
		
		if (FirstNum > SecNum) 
		{ 
			int Result = FirstNum - SecNum; 
			System.out.println ("First Number is Greater than Second Number and result is: " + Result);	
			
		}
		else if (FirstNum < SecNum) 
		{ 
			int Result = SecNum - FirstNum;
			System.out.println ("Second Number is Greater than First Number and result is: " + Result);	
		}
		else if (FirstNum == SecNum) 
		{ 
			int Result = FirstNum + SecNum; 
			System.out.println ("First Number is equal to Second Number and addition result is: " + Result );	
			
			}
		}

}

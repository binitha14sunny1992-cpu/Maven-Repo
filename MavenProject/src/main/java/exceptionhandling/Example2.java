package exceptionhandling;

public class Example2 {

	public static void main(String[] args) throws InvalidException {
	//	Example2 obj=new Example2();
		eligibility(15);

	}
	public static void eligibility(int age)throws InvalidException  //to declare the exception
	{
		if(age<=18)
		{
			//System.out.println("Eligible for Driving License");
		//	throw new ArithmeticException("Access Denied"); //to intentionally interrupt the flow of normal pgm
			throw new InvalidException("Access Denied"); 
		}
		else
		{
			System.out.println("Not Eligible for Driving License");
		}
	}

}

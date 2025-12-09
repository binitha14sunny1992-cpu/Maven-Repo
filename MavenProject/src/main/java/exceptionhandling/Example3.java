package exceptionhandling;

public class Example3 {

	public static void main(String[] args) {
		Example3 obj=new Example3();
		try //specify
		{
			obj.eligibility(16);
		}
		catch ( ArithmeticException e) //handle
		{
			System.out.println("enter valid age");
		}

	}
	public void eligibility(int age)throws ArithmeticException
	{
		if(age<=18)
		{			
		    throw new ArithmeticException("Access Denied"); //to intentionally interrupt the flow of normal pgm
			
		}
		else
		{
			System.out.println("Not Eligible for Driving License");
		}
	}

}

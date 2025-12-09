package exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		
		
	try {	
		int a=100;
		int b=0;
		int c=a/b;
		System.out.println("Division Result = "+c);	
	
	}
	catch(ArithmeticException e) //variable e is store error message
	{
		System.out.println("error message");
	}
	finally
	{
		String name="Binitha";
		System.out.println("Name is "+name);
	}
	
	
	}
}

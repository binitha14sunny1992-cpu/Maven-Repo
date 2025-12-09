package superkeyword;

public class AdditionDivisibleC extends AdditionDivisibleP{

	public static void main(String[] args) {
		AdditionDivisibleC obj=new AdditionDivisibleC();
		obj.divisible();

	}
	
	public void divisible()
	{	
		
		int x=super.add();
		if(x%10==0)
		{
			System.out.println(x+" is divisible by 10");
		}
		else
		{
			System.out.println(x+" is not divisible by 10");
		}
		
	}
	
}

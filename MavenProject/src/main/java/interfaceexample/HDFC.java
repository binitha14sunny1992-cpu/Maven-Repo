package interfaceexample;

public class HDFC implements RBI{

	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.recurringDeposit(10000.00, 3);

	}
	public void recurringDeposit(double amt,int n)
	{
		double depamt;		
		depamt=(amt*n*RBI.interest)/100;
		System.out.println("Interest Amount = "+depamt);
		System.out.println("Total Amount = "+(depamt+amt));
	}

}

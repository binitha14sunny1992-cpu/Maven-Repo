package inheritance;

public class EmployeeC extends EmployeeP{
	public static void main(String[] args) {
		EmployeeC obj=new EmployeeC();
		obj.totsalaray();
	}	
	public void totsalaray()
	{
		super.calculate();
		double totsal;
		double totsalhand;
		double totded;
		totded=super.hra+super.pf+super.deduction;
		totsal=super.basicpay+super.bonus+totded;
		totsalhand=totsal-totded;
		System.out.println(" ----SALARY SLIP----");
		System.out.println();
		System.out.println("Basic Pay        : "+super.basicpay);
		System.out.println("Bonus            : "+super.bonus);
		System.out.println("HRA              : "+super.hra);
		System.out.println("Pf               : "+super.pf);
		System.out.println("Deductions       : "+super.deduction);
		System.out.println("Total Salary     : "+totsal);
		System.out.println("Total Deductions : "+totded);
		System.out.println("Salary In hand   : "+totsalhand);		
	}	
}

package abstraction;

public abstract class Employee {
	public abstract void calculateSalary(double salperhr,int hr);
	public void calculateSalary(double paymnt)
	{
		double sal=paymnt*8;
		System.out.println("Full Time Employee Salary  = "+sal);
	}

}

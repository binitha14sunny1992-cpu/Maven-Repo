package inheritance;

public class EmployeeP extends EmployeeGP{
	double hra;
	double pf;

	
	public void calculate()
	{
		super.saldetails(18000.00, 1358.25, 3250.00);
		this.hra=(5*super.basicpay)/100;
		this.pf=(20*super.basicpay)/100;
		
	
	}

}

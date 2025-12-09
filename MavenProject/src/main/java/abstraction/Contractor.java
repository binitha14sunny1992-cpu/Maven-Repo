package abstraction;

public class Contractor extends Employee{

	public static void main(String[] args) {
		Contractor obj=new Contractor();
		
		obj.calculateSalary(500, 9); //calls contract method
		obj.calculateSalary(700); //calls full timre employee

	}
	
	public void calculateSalary(double salperhr,int hr)
	{
		double sal=salperhr*hr;
		System.out.println("Contractor Salary ="+sal);
	}

}

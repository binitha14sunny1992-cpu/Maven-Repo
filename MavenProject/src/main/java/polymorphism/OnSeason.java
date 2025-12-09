package polymorphism;

public class OnSeason extends OffSeason {

	public static void main(String[] args) {
		OnSeason obj=new OnSeason();
		obj.discount(4500.50);

	}
	

	public void discount(double mrp)
	{
		super.discount(5230.50);
		double disprice;
		double discount;
		discount=(mrp*40)/100;
		disprice=mrp-discount;
		System.out.println("OnSeason Discount = "+disprice);
	}

}

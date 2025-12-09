package polymorphism;

public class OffSeason {
	
	public void discount(double mrp)
	{		
		double disprice;
		double discount;
		discount=(mrp*15)/100;
		disprice=mrp-discount;
		System.out.println("OffSeason Discount = "+disprice);
	}

}

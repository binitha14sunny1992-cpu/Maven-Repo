package aggregation;

public class Author {
	String name;
	String place;
	Author(String name,String place)
	{
		this.name=name;
		this.place=place;
		System.out.println(name);
		System.out.println(place);
	}
	public void display()
	{
		System.out.println(name);
		System.out.println(place);
	}

}

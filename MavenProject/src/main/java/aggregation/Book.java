package aggregation;

public class Book {

	public static void main(String[] args) {
		Author obj=new Author("Binitha","Kochi");
		Book obj1=new Book("OMG",101,obj);
		obj1.print();

	}
	String n;
	int num;
	Author a; //reference variable
	Book(String name, int number, Author a)
	{
		this.n=name;
		this.num=number;
		this.a=a;
	}
	public void print()
	{
		System.out.println(n);
		System.out.println(num);
		a.display();
	}
}

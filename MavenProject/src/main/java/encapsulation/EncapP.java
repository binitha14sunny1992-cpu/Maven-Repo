package encapsulation;

public class EncapP {
	private int num;
	private String name;
	public void set(int num, String name)
	{
		this.num=num;
		this.name=name;
	}
	public void get()
	{
		System.out.println("Number = "+num);
		System.out.println("Name = "+name);
	}

}

package aggregation;

public class Address {
	String addr1;
	String addr2;
	String addr3;
	int pin;

	public static void main(String[] args) {
		Student std=new Student("Binitha",25);
		Address obj1=new Address("HOUSE 456","LINK ROAD","BANGALORE",258963);
		obj1.print(std);
	}

	public Address(String addr1,String addr2,String addr3,int pin)
	{
		this.addr1=addr1;		
		this.addr2=addr2;
		this.addr3=addr3;		
		this.pin=pin;
		
	}
	public void print(Student std)
	{
		std.details();
		System.out.println("Address: "+addr1+", "+addr2+", "+addr3+", "+pin+".");		
		
	}
}

package inheritance;

public class MultiLevelC extends MultiLevelP{

	public static void main(String[] args) {
		MultiLevelC obj=new MultiLevelC();
		obj.dance();
		obj.write();
		obj.sing();
		obj.draw();

	}
	public void dance()
	{
		System.out.println("Method to dance");		
		
	}
	public void write()
	{
		System.out.println("Method to write");		
		
	}

}

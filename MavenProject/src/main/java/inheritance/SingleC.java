package inheritance;

public class SingleC extends SingleP{

	public static void main(String[] args) {
		
		SingleC obj=new SingleC();
		obj.dance();
		obj.draw();
		obj.write(); //No need to call all the parent methods in inheritance
	}
	public void dance()
	{
		System.out.println("Method to dance");
	}

}

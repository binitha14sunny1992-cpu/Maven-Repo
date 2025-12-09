package superkeyword;

public class SuperMethodC extends SuperMethodP{

	public static void main(String[] args) {
		SuperMethodC obj=new SuperMethodC();
		obj.play();

	}
	public void play()
	{
		System.out.println("Method to play");
		super.draw();
		super.sing();
	}
}

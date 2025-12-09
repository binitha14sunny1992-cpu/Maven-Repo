package inheritance;

public class HierarchyC1 extends HierarchyP{

	public static void main(String[] args) {
		
		HierarchyC1 obj=new HierarchyC1();
		obj.write();
		obj.draw();
		obj.sing();
	}
	public void write()
	{
		System.out.println("Method to write");		
		
	}
	public void draw()
	{
		System.out.println("Method to draw");		
		
	}

}

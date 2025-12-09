package accessmodifier2;

import accessmodifier1.AccessOne;

public class Access3 extends AccessOne{

	public static void main(String[] args) {
		AccessOne obj=new AccessOne();
		obj.display();
		//obj.display1();
		//obj.display2();
		//obj.display3();
		Access3 obj1=new Access3();
		obj1.display();
		obj1.display1();//Protected can be accessed only by using objects of subclass.
		//obj1.display2(); Private
		//obj1.display3(); Default
	}

}

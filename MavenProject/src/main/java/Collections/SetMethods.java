package Collections;

import java.util.*;

public class SetMethods {

	public static void main(String[] args) {
		Set<String> color=new HashSet<String>();
		color.add("Black");
		color.add("Blue");
		color.add("red");
		
		Set<String> fruit=new HashSet<String>();
		fruit.add("apple");
		fruit.add("orange");
		fruit.add("plum");
		
		System.out.println(color);
		System.out.println(fruit);
		
		color.addAll(fruit);		
		System.out.println(color);
		System.out.println(fruit);
		
		System.out.println(color.containsAll(fruit));
		System.out.println(fruit.containsAll(color));
		
		color.removeAll(fruit);
		System.out.println(color);
		System.out.println(fruit);
	}

}

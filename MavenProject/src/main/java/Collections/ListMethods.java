package Collections;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {
		List<String> fruit=new ArrayList<String>();
		
		fruit.add("Orange");  //Method 1
		fruit.add("Strawberry"); 
		fruit.add("Plum"); 
		fruit.add("Apple"); 
		fruit.add("Pineapple"); 
		System.out.println(fruit);
		
		System.out.println(fruit.get(2));			//method 2
		
		fruit.set(1, "Apple");					//method 3
		System.out.println(fruit);
		
		System.out.println(fruit.indexOf("Apple"));   //method 4
		
		System.out.println(fruit.lastIndexOf("Apple"));  //method 5
		
		fruit.remove(3);						//method 6
		System.out.println(fruit);
		
		System.out.println(fruit.contains("Plum"));    //method 7
		System.out.println(fruit.contains("Papaya"));
		
		System.out.println(fruit.isEmpty());   //method 8
		
		System.out.println(fruit.size());    //method 9
	}

}

package Collections;

import java.util.ArrayList;
import java.util.*;

public class Generic {

	public static void main(String[] args) {
		List<String> name=new ArrayList<String>();
		name.add("Binitha");
		name.add("Welcome");
		name.add("hello");
		name.add("bye");
		System.out.println(name);
		
		List<String> fruit=new LinkedList<String>();
		fruit.add("apple");
		fruit.add("orange");
		fruit.add("plum");
		System.out.println(fruit);
		
	}

}

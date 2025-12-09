package Collections;

import java.util.HashSet;
import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		Set<String> color=new HashSet<String>();
		color.add("Black");
		color.add("Blue");
		color.add("red");
		System.out.println(color);
	/*	Iterator<String> i=color.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove(); 
		System.out.println(color); //removes last element*/
		
		for(String colornew:color)
		{
			System.out.println(colornew);
		}
		

	}

}

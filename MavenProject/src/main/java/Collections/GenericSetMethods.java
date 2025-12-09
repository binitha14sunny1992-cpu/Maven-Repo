package Collections;

import java.util.*;

public class GenericSetMethods {

	public static void main(String[] args) {
		Set<String> veggies=new TreeSet<String>();
		veggies.add("Tomato");
		veggies.add("Cucumber");
		veggies.add("Carrot");
		veggies.add("Cabbage");
		veggies.add("Radish");
		System.out.println(veggies);
		
		System.out.println(veggies.contains("Radish"));
		System.out.println(veggies.isEmpty());
		System.out.println(veggies.size());
		System.out.println(veggies);

	}

}

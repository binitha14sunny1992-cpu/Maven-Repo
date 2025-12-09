package Collections;

import java.util.HashSet;
import java.util.*;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set number=new HashSet();
		number.add(100);
		number.add('h');
		number.add("welcome");
		number.add(200);
		number.add('d');
		number.add("bye");
		System.out.println(number);//unordered
		
		System.out.println(number.isEmpty());
		System.out.println(number.contains('d'));
		System.out.println(number.size());
		System.out.println(number);

		
	}

}

package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class NonGeneric {

	public static void main(String[] args) {
		List data=new ArrayList();
		data.add("hai");
		data.add('c');
		data.add("welcome");
		data.add(100);
		System.out.println(data);
		
		Set number=new HashSet(); //doesnot support TreeSet
		number.add(100);
		number.add('h');
		number.add("welcome");
		number.add(200);
		number.add('d');
		number.add("bye");
		System.out.println(number);//unordered
	}

}

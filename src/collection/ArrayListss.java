package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListss {

	public static void main(String[] args) {
	
		ArrayList s=new ArrayList();
		
		s.add("Saurabh");
		s.add("Velocity");
		s.add(150);
		s.add(11.18);
		s.add(true);
		s.add(false);
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains('S'));
		
	Iterator it = s.iterator();
		
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	for(Object o:s) {
	
		System.out.println(o);
	}
	for(int i=0;i<=s.size()-1;i++)// using for loop
	{
		System.out.println(s.get(i));
	}
 ListIterator list = s.listIterator();
	
	while(list.hasNext()) {
		System.out.println(list.next());
	}
		
		
		
	}

}

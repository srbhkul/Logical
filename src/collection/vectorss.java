package collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorss {

	public static void main(String[] args) {
		
		Vector s=new Vector();
		s.add("Saurabh");
		s.add("Velocity");
		s.add(150);
		s.add(11.18);
		s.add(true);
		s.add(false);
		s.add("Saurabh");
		s.add("Velocity");
		s.add(150);
		s.add(11.18);
		s.add(true);
		s.add(false);
		System.out.println(s.capacity());
		
		
		Iterator it = s.iterator();
		System.out.println("-------------------");
		while(it.hasNext()) {
			System.out.println(it.next());
		}	System.out.println("-------------------");
		
		ListIterator list = s.listIterator();
		while (list.hasNext()) {
			System.out.println(list.next());
		}	
		System.out.println("-------------------");
		for (int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		System.out.println("-------------------");
		for(Object o :s) {
			System.out.println(o);
		}
		
		
	}

}

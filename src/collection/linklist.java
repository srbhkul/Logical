package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linklist {

	public static void main(String[] args) {
		
		LinkedList l =new LinkedList();
		
		l.add("Saurabh");
		l.add(11);
		l.add(true);
		l.add(11.05);
		l.add(false);
		l.add("Velocity");
		l.add("SUNNY");
		l.add(null);
		l.add(1565.0000);
		l.add(11.05);
		l.add(false);
		l.add("Velocity Classes");
		
		System.out.println(l.size());
		l.contains("abh");
		
		Iterator s = l.iterator();
		System.out.println("-------------------");
		while(s.hasNext()) {
			System.out.println(s.next());
		}	System.out.println("-------------------");
		ListIterator list = l.listIterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}
		System.out.println("-------------------");
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("-------------------");
		for(Object o :l) {
			System.out.println(o);
		}
		

	}

}

package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		TreeSet <String>l = new TreeSet();
		l.add("Saurabh");
		l.add("sunny");
		l.add("sapna");
		l.add("Velocity");
		l.add("SUNNY");
		l.add("sk");
		l.add("Velocity Classes");
		System.out.println(l);
	System.out.println(l.pollFirst());
	System.out.println(l.pollLast());
	System.out.println("---------------------");
	//System.out.println(l);	
		for(Object o:l) {
			System.out.println(o);
		}
	System.out.println("---------------------");
		Iterator it = l.iterator();
		while(it.hasNext())	{
			System.out.println(it.next());
		}
		
	}
String Buffer ,builder
}

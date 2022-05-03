package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hasset {

	public static void main(String[] args) {

		HashSet s = new HashSet();
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
		s.add(null);
		s.add(null);
		System.out.println(s);
       
		for(Object o:s) {
			System.out.println(o);
		}
	System.out.println("---------------------");
		Iterator it = s.iterator();
		while(it.hasNext())	{
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}

package collection;

import java.util.PriorityQueue;

public class que {
public static void main(String[] args) {
	
	PriorityQueue l = new PriorityQueue<>();
	
	l.add("Saurabh");
	l.add("sunny");
	l.add("sapna");
	l.add("Velocity");
	l.add("SUNNY");
	l.add("sk");
	l.add("Velocity Classes");
	System.out.println(l);
	System.out.println(l.poll());
	System.out.println(l.peek());
	System.out.println(l.parallelStream());
}
}

package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTabledCollection {
	public static void main(String[] args) {
		
		//Hashtable t=new Hashtable();  // capacity is 11, load factor 0.75
		//Hashtable t=new(initial capacity);  // create hashtable object with some capacity
		//Hashtable t=new Hashtable(initial capacity, fill ratio/load factor);
		
		Hashtable<Integer, String> t=new Hashtable<Integer, String>();
		
		t.put(101,"Saurabh");
		t.put(102,"Kulkarni");
		t.put(103,"Sapna");
//		t.put(null,"X"); //NullPointerException
//		t.put(104, null); //NullPointerException
		
//		System.out.println(t); 
//			
//		System.out.println(t.get(103)); //Smith
//		
//		t.remove(103);
//		System.out.println(t); 
//		
//		System.out.println(t.containsKey(102)); //true
//		System.out.println(t.containsKey(105)); //false
//		
//		System.out.println(t.containsValue("David")); //true
//		System.out.println(t.containsValue("Y")); //False
//		
//		System.out.println(t.isEmpty());//false
//		
//		System.out.println(t.keySet()); 
		System.out.println(t.values()); 
		
		for(int k:t.keySet())
		{
			System.out.println(k+"   "+t.get(k));
		}
		System.out.println();
		//Entry specific methods...
		
		for(Map.Entry entry:t.entrySet())    // (key, value)
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		System.out.println();
		//iterator()
		
		Set s=t.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();   //(101,x)
			System.out.println(entry.getKey()+"     "+entry.getValue());
		}
		
		
	}
}

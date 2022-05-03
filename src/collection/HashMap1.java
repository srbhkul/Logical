package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1{
	
	public static void main(String[] args) {
			
//			HashMap m=new HashMap();
          HashMap<Integer,String> m=new HashMap<Integer,String>();
		
			m.put(101,"Saurabh");
			m.put(102,"Kulkarni");
			m.put(103,"Sapna");
			m.put(104,"Shinde");
			m.put(105,"Deepali");
			m.put(103,"Gawade");
			m.put(106,"Saurabh");
			m.put(111,"Saurabh");
			m.put(112,"Kulkarni");
			m.put(113,"Sapna");
			m.put(114,"Shinde");
			m.put(115,"Deepali");
			m.put(117,"Gawade");
			m.put(117,"Saurabh");

		//	System.out.println(m); 
			System.out.println(m.get(114)); 
//			
//			m.remove(106); 
//			System.out.println(m); 
//			
			System.out.println(m.containsKey(101)); 
//			System.out.println(m.containsKey(106)); 
//			
		System.out.println(m.containsValue("Saurabh")); 
//			System.out.println(m.containsValue("n"));  
//			
		System.out.println(m.isEmpty()); //false
//			
		System.out.println(m.keySet()); 
		Set<Integer> ke = m.keySet();
//		
//			for(Integer i:m.keySet())
//			{
//				System.out.println(i);
//			}
		Collection<String> s = m.values();
//			
//			for(String i:m.values())
//			{
//				System.out.println(i);
//			}
//				
//			for(Object i:m.keySet())
//			{
//				System.out.println(i+"     "+m.get(i));
//			}
//			
//			// Entry methods
//			//*****************
//			for(Map.Entry entry:m.entrySet()) // 101  x
//			{
//				System.out.println(entry.getKey()+"    "+entry.getValue());
//			}
//			
//			//iterator()
//			
//			Set s=m.entrySet();
//			
//			Iterator itr=s.iterator();
//		
//				while(itr.hasNext())
//				{
//				Map.Entry entry=(Entry) itr.next();   // 101 x  entry
//				System.out.println(entry.getKey()+"      "+entry.getValue());
//				
//				}
			
		}
		
		

	}


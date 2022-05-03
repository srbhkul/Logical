package LOgic;

import java.util.HashMap;
import java.util.Set;

public class multiple {
public static void main(String[] args) {
	
	   String str="my name is slim shady";
			String sk=str.replace(" ","");
			 
			 HashMap<Character, Integer> mp= new HashMap<Character, Integer>();
			 			for(int i=0; i<=sk.length()-1;i++)
			 			{
			 				char s=sk.charAt(i);
			 				
			 				if(mp.containsKey(s)){	
			 				mp.put(s, mp.get(s)+1);
			 				}
			 				else {mp.put(s, 1);
							}
			 			}
			 				Set <Character > key= mp.keySet();
			 			
			 			for(Character k:key)
			 			{
			 				System.out.println(k+" : "+mp.get(k));
			 			}	
	
}
}

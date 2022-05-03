package LOgic;

import java.util.HashMap;
import java.util.Set;

import org.checkerframework.checker.units.qual.m;

public class mul {

	public static void main(String[] args) {
		String sk="Saurabh Kulkarni";
		String ss=sk.replace(" ", "");
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<ss.length();i++) {
			char s=ss.charAt(i);
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}else {
				map.put(s, 1);
			}
		}	
		Set <Character>key=map.keySet();
		for(Character c:key) {
			System.out.println(c+" : "+map.get(c)  );
		}
		
		System.out.println();
		
		
		
		
		
	}

}

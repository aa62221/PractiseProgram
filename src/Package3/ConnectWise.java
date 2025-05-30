package Package3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConnectWise {

	public static void main(String[] args) {
		
		String s= "akshay";
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			
			char c = s.charAt(i);			
			Integer val = hmap.get(c);			
			if(val==null) {
				hmap.put(c, 1);				
			}			
			else {
				hmap.put(c, val+1);
			}			
		}
		System.out.println(hmap);
		
		
		Iterator<Map.Entry<Character,Integer>> itr = hmap.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Character,Integer> it= itr.next();
			if(it.getValue()>1) {
				System.out.println(it.getKey()+ "-" + it.getValue());
			}
			
		}
		
		
		
		
		
	
		

	}

}
 
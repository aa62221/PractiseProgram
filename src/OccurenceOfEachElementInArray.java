import java.util.*;
import java.util.Map;
import java.util.Map.Entry;


 class OccurenceOfEachElementInArray  {
	 
	public static void main(String[]args) {
		int array[]= {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++)
	   {

			int a = array[i];
		    Integer val = hmap.get(a);
		    
		    if(val== null) {
		    	hmap.put(a, 1);
		    }
		    else {
		    	hmap.put(a, val+1);
		    }
		 				}
		
//		for(Map.Entry<Integer,Integer> me2: hmap.entrySet())
//		{
//			me2.getKey();
//		}
		
		 System.out.println(hmap);
		 
		 
//------------------Count the occurence of each words in the string----------------------------------------------
		
		 String s = "This is a large large large String";
		 String str[] = s.split(" ");
		 HashMap<String,Integer> hmap2 = new HashMap<String,Integer>();
		 for(int i=0;i<str.length;i++) {
			 
			    String s1= str[i];     
			    Integer val = hmap2.get(s1);
			    
			    if(val== null) {
			    	hmap2.put(s1, 1);
			    }
			    else {
			    	hmap2.put(s1, val+1);
			    }
			 				}
			 
			 
		 System.out.println(hmap2);
		 
	
	}
	
    	
    }



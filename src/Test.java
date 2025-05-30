import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Properties;
import java.util.Set;


public class Test {
	
	public static void main(String[] args) throws IOException {
		
		int [] ar1= {1,2,3};
     	int [] ar2= {1,2,3,4,5};
     	ar1=ar2;    	
     	for(int a:ar1) {
     		System.out.print(a);
     	} 

		
	  
	String s = "##$$%$%#%$4ss";
	char[] c=s.toCharArray();
	
	HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
	
	for(char c1: c) {		
		if(c1=='#' ||c1=='$' ||c1=='%') {						
		Integer	val =hmap.get(c1);		
		if(val==null) {
			hmap.put(c1, 1);	
		}
		else {
			hmap.put(c1, val+1);
		}		
		}
	}	
	System.out.println(hmap);
		
//		  String s1 ="akshay";
//		    char[] c1 = s1.toCharArray();
//		    HashMap<Character,Integer> hmap1= new LinkedHashMap<Character,Integer>();
//		    
//		    for(int i =0; i<c1.length ;i++){
//		        
//		        char c2= c1[i];
//		        Integer val = hmap1.get(c2);
//		        if(val==null){
//		            
//		            hmap1.put(c2,1);
//		        }
//		        else{
//		            hmap1.put(c2,val+1);
//		        }
//		        
//		    }
//		    
//		    System.out.println(hmap1);

	}
	
	
}

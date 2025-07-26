    import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		
		String s = "aaaaabbbbbbcbcccccddddddeeeeffffggg";
		char ch []= s.toCharArray();

	// since set does not allow duplicate value we are converting string into set	
	    Set<Character> set = new LinkedHashSet<Character>();
	   
	    for(char c :ch) {
	    	set.add(c);
	    }
//This will print set 		
	    System.out.println(set);
	    
	  
//To print in string format	    
	    StringBuilder sb = new StringBuilder();
	    for(char c1: set) {
	    	sb.append(c1);
	    }
	   
	    System.out.println(sb);
	    
	    
//-------------------Printing Duplicate Characters in String--------------------------------
	    
	    String str = new String("Sakketate");
       // char[] chars = str.toCharArray();
        System.out.println("Duplicate characters are:");
        for (int i=0; i<str.length();i++) {
                    for(int j=i+1; j<str.length();j++) {
                    	      if(str.charAt(i)==str.charAt(j)) {
                               //if (chars[i] == chars[j]) {
                                         // System.out.println(chars[j]);
                    	    	            System.out.println(str.charAt(j));
                                          break;
                                }
                     }
                   
         }

	}

}

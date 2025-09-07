
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
    	 String abc ="today is tuesday";
    	 String[]str  = abc.split(" ");
    	 
    	List<String> al = new ArrayList<String>(Arrays.asList(str));
    	Collections.reverse(al);
    	
		for (String s : al) {
			char c =s.charAt(0);
			System.out.print(Character.toUpperCase(c)+s.substring(1)+" ");
			
		}
    	
    		 
    	 
    	
    	
    	
    }
}

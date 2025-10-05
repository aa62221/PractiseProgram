import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		
		String str = "My name is Rohit";
        String[] s = str.split(" ");
        String[] arr = new String[s.length];
        String name="";
        for( int i=s.length-1;i>=0;i--){
            name= name+s[i]+" ";
        }
        String[] newS= name.split(" ");
        System.out.println(Arrays.toString(newS));
        
	
	    
	  
	    
		
	    
	
	
	
	
	}
	
	
	
	

}

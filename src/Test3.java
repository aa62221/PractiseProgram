
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Test3 {
        public static void main(String[] args) {
        
        	
        	String str ="25234";
        	
        	
        	
        	while(str.length()>1) {
        		int sum = 0;
			for (int i = 0; i < str.length(); i++) {
				sum= sum + Character.getNumericValue(str.charAt(i));			
				}
        	str= String.valueOf(sum);
        	}
			System.out.println("Sum of digits in string is: " + str);

			}
        	
        	
        	
        	
        	
        	

        
        
}
        
  

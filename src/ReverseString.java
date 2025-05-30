import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[]args) {

		//String a = "madams";
		//int b = a.length();
		//System.out.println(b);
		String c = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String a =scan.nextLine();
		System.out.println("Entered String is "+a);
		int b = a.length();
		
		for( int i =b-1; i>=0;i--) {
		 c= c+ a.charAt(i);
		}
		System.out.println("Reverse of string "+ a + " is "+c);
		
		if(c.equalsIgnoreCase(a)) {
			System.out.println("This string is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		scan.close();
		
//----------Using String Buider reverse method-----------------------------------------------------------
		
		String str = "Akshay";
		StringBuilder sb  = new StringBuilder(str);
		//sb.append(str);
		sb.reverse();
		
		System.out.println(sb);
		
//----------Reverse string at its own place using reverse method of String builder--------------------------------------------------------------		
	
		String 	str1 ="Reverse this string at its own place";
		String words[]=str1.split(" ");  
	    String reverseWord="";  
	     
	    for(String w:words){  
	        StringBuilder sb1=new StringBuilder(w);  	    
	        sb1.reverse();  
	        reverseWord+=sb1+" ";  
	    }  
	    System.out.println(reverseWord); 
	
//----------Reverse string at its own place without reverse method--------------------------------
	    
	    String 	str2 ="Reverse this string at its own place";
	    String words1[]=str2.split(" ");  
	    String reverseWord1=""; 
	    
	    for(int i=0; i<words1.length;i++){  
	    
	    	String s =words[i];	    	
	        for(int j =s.length()-1; j>=0;j--) {
	        	reverseWord1 = reverseWord1 +s.charAt(j);   
		        
	        }
	     reverseWord1+= " ";
	    }  
	    
	    System.out.println(reverseWord1); 
	    
 //----------Reverse string with First letter Capital------------------------------------
	    
	    String abc ="today is tuesday";
	    String[]s1= abc.split(" ");
	    
	    for( int i=s1.length-1; i>=0;i--) {
	    	String a1 =s1[i];
	    	String b1="";
	    	  for( int j=0;j<a1.length();j++) {
	    		    if(j==0) {
	    		    b1= b1+a1.charAt(j);
	    		    b1= b1.toUpperCase();	 
	    		    }
	    		    else if(j>0) {
	    		    b1 =b1+a1.charAt(j);	    		    	
	    		    }	     
	    	  }
	  		System.out.print(b1+" ");
	    }
	    System.out.println();
	    
	  
//----------Reverse string without using loop------------------------------------	 
	    
	    String e =" I am Akshay";
	    String e1[] = e.split(" ");
	    List<String> lst = new ArrayList<String>(Arrays.asList(e1));
		Collections.reverse(lst);		
		for(String s2: lst) {
			System.out.print(s2+ " ");
		}
	    
//--------------------------------------------------------------------
		
		System.out.println();
		reverseUsingRecursion("Reverse the string using recursion");
        
		
	}
	
	//----------Reverse the string with recursion---------------------------------
	
		public  static void reverseUsingRecursion(String str) {
		
			if(str==null|| str.length()<=1) {
               System.out.println(str);
             
			}
			else {
				System.out.print(str.charAt(str.length()-1));
			    reverseUsingRecursion(str.substring(0,str.length()-1));
				
			}

		}	
	
}


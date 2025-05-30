import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test2 {
	
	

	public static void main(String[] args) {
		
		
//		String s ="Welcome";
//		
//		for(int i=0; i<=s.length()-3; i++) {
//			System.out.println(s.substring(i,i+3));
//		}
		
		Scanner scan  = new Scanner(System.in);
		int n=scan.nextInt();		
		int m= factorial(n);
		System.out.println(m);
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.name"));
	}	
	   public static int factorial(int n) {
		   		
		  if(n>1) {
			  return n*factorial(n-1);	
	        }
		  else if(n==1) {
			  return 1;
		  }
		  else {
			  return 0; 
		  }
		 
	   }
	
	  

}
	


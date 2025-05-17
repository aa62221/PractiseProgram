import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact =1;
		int fact1=1;
		for(int i=num; i>1;i--) {
			
			fact = fact*i;
			
		}
		System.out.println(fact);

//OR----------------------------------------------------------------
	
	for(int i=1; i<=num;i++) {
		
		fact1 = fact1*i;
		
	}
	System.out.println(fact);
	scan.close();
	
	
//using Recursion	
	System.out.println(factorial1(num));
	
	}	

	//OR----------------------------------------------------------------
	
	

 
	public static int factorial1(int n) {
   		
		  if(n>1) {
			  return n*factorial1(n-1);	
	        }
		  else if(n==1) {
			  return 1;
		  }
		  else {
			  return 0; 
		  }

	}

}

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean prime =true;
		
		for( int i=2; i<num;i++) {
			if(num % i==0) {
				prime=false;
				break;
			}
			
		}	
		if(prime){
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
       scan.close();
		
		m1();
	}
//---------------Prime numbers from 1 to 100-----------------------------------------------
	
	
	public static void m1() {
	       //Empty String
	       String  primeNumbers = "";
	       for (int i = 1; i <= 100; i++){          		  	  	
	          boolean prime =true;
	          for(int j =2; j<i; j++) {		 
	           if(i%j==0)
		       {
	 		   prime= false;
	 		   break;
		      }
		    }
		  if (prime)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
			
			
		}
		
		
	
	
	
}

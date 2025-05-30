import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	   
		//0 1 1 2 3 5 8 13 21 34 
		//Print Fibannoci through user input
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many number of Fibonacci series you want to print? ");
		int count = scan.nextInt();
		
		int n1 =0;
		int n2 =1;
		int n3;
		
		for (int i=0; i<count;i++) {
			System.out.print(n1 + " ");
			n3= n1+n2;
			n1=n2;
			n2=n3;
		}
		
		scan.close();
		
System.out.println();		
System.out.println("------------------------------------");

   // Using recursion
           Fibo(count);
	}

	static int n1 =0;
	static int n2 =1;
	static int n3;
	public static void Fibo(int n) {
		
		if(n>0) {
			System.out.print(n1 + " ");
			n3= n1+n2;
			n1=n2;
			n2=n3;
			Fibo(n-1);
		}
		  
		 
		
		
	}

}

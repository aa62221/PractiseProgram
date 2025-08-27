import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int sum=0, rem;
	    int quo = num;
		while(quo>0) {
		rem= quo % 10;
		sum = (sum * 10) + rem;
		quo = quo/10;
		}
		
		if(sum==num) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
		
	    scan.close();
	    
	    System.out.println("---------------------------------");
	    
	    String str = "madam";
		if (new StringBuilder(str).reverse().toString().equals(str)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	    
	}

}
import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		
		//This program is specific for find armstrong number of 3 digits only
		//In case of 4 digits you have to do rem*rem*rem*rem
		//Similarly for creating generic program we have to find the number of digits in the number
		// and then power function to do the multiplication of rem.
	
		int sum=0, rem;
	    int quo = num;
	    
		while(quo>0) {
		rem= quo % 10;
		sum = sum + (rem*rem*rem);
		quo = quo/10;
		}
		
		if(sum==num) {
			System.out.println("Number is Armstrong");
		}
		else {
			System.out.println("Number is not Armstrong");
		}
		
	    scan.close();
		
	}

}

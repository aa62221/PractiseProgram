import java.util.Scanner;

public class Scanner1 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
	
        int i = scan.nextInt();
        double d =scan.nextDouble();
         
        //we need to add the below line before printing next line because nextInt/nextDouble will print the number like this "23\n"
        //So \n i.e blank line will be passed to nextLine method and it will not ask us for input and will print empty String
        scan.nextLine();
    	String s = scan.nextLine();
       
        scan.close();
  
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

	}

}

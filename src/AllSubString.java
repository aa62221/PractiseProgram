import java.util.Scanner;



public class AllSubString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s =scan.nextLine();
		int n=  s.length();
		
//		for( int i=0; i<n; i++) {			
//			for( int j =1; j<=n-i; j++) {				
//				System.out.println(s.substring(i,i+j));
//			}		
//		}			
		
		//You can iterate like this as well
		for( int i=0; i<n; i++) {			
			for( int j =i+1; j<=n; j++) {				
				System.out.println(s.substring(i,j));
			}		
		}	
		
//------------------Substring of length 3 only-----------------------------------------
	System.out.println("Substring of length 3 only");
    for( int i=0; i<n-2;i++) {			
		System.out.println(s.substring(i,i+3));
	  }

		scan.close();
		

		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("user.name"));
		
	}

	
	
	
}

  
 public class Pattern{
	 

	 public static void main(String[]args) {
		 
 		 
		sandGlassPattern();
		starPattern();
		rightAngleTrianlge();
		numberPattern(); 
		pattern();
		pyramid();
		A1();
 
	 }
	 
//	* * * * 
//	 * * * 
//	  * * 
//	   * 
//	  * * 
//	 * * * 
//	* * * * 
	 
	 public static void sandGlassPattern() {
			for(int i=1;i<5;i++) {
				for(int j=1;j<i;j++) {
				System.out.print(" ");
				     }			
				for(int k=i;k<5;k++) {
					System.out.print("* ");
				   }
				 System.out.println();	
				
			   }
			
			for(int i=3;i>0;i--) {
				for(int j=1;j<i;j++) {
					System.out.print(" ");
					     }		
				for(int k=i;k<5;k++) {
					System.out.print("* ");
				}
				 System.out.println();
			}
			System.out.println();
	 } 
	 
	 
//	 * 
//	 * * 
//	 * * * 
//	 * * * * 
	public static void starPattern() {
		for(int i=1;i<5;i++) {
			 
			   for(int j=1;j<=i;j++) {
				 
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}
	 
//    *
//   **
//  ***
// ****
//*****
	
	public static void rightAngleTrianlge() {
	for( int x=0;x<5;x++) {
		
		for( int i=x;i<4;i++) {				
			System.out.print(" ");
		}			
		for( int y=0;y<=x;y++) {				
			System.out.print("*");			
		}
		System.out.println();			
	}
			
}
	
	
//	    1
//	   121
//	  12321
//	 1234321

	public static void numberPattern() {
		
		int odd =1;
		int space =3;
		
		for(int i =1;i<=4;i++) {
			
			for(int j=1;j<=space;j++) {
				//Do not print "ln" as we need to give space in line
			System.out.print(" ");
			}
			int k=0;		
			for(int j=1;j<=odd;j++) {
				
				if(j<=i) {
					k=k+1;
				}
				else {
					k=k-1;
				}
				//Do not print "ln"
				System.out.print(k);
				
			}
			
			System.out.println();
			odd=odd+2;
			space = space-1;	
			
		}

	}
//Floyds's Triangle	
//	1
//	2 3
//	4 5 6
//	7 8 9 10
	
  public static void pattern() {
		
	  int k=0;
	  for(int i=1;i<5;i++) {	
		for(int j=1;j<=i;j++) {	
				   k=k+1;
				   System.out.print(k+" ");	 
			   }			   
			 System.out.println();		
		}
		
	}
//     * 
//    * * 
//   * * * 
//  * * * * 
  
  public static void pyramid() {
	  
	  for(int i=1;i<5;i++) {		
		for(int j=i;j<=5;j++) {
			//Do not print "ln" as we need to give space in line
		System.out.print(" ");
		}
		
	    for(int j=1;j<=i;j++) { 
			 System.out.print("* ");
		 } 
		 System.out.println();
  }
	 
  }
  
  //A1B2C3..........Z26
  public static void A1() {
	
		int x=1;		
			for(char k='A';k<='Z';k++) {
				System.out.print(k);
				System.out.print(x);
			    x++;
		}
		
		System.out.println();
			
		char c='A';
		for(int k=1;k<=26;k++) {
			System.out.print(k);
			System.out.print(c);
		    c++;
	}

		 
	}
 
		 
 }
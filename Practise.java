 import java.util.*;
import java.util.Map.Entry;

public class Practise {


	public static void main(String[] args)
	{
	
//		*****
//		 ***
//		  *
//		 ***
//		*****
		
		
//		 int num=5;
//		 int space=0;
//		 for(int i=1;i<6;i++){
//			 
//			 if(i<4) {
//
//			  for(int j=0;j<space;j++) {
//					System.out.print(" ");
//					     }	
//		 // System.out.println("1st Loop");
//		   for( int j=1;j<=num;j++){
//		   
//			   System.out.print("*");			    
//		   }
//		   num =num-2;
//		   space= space+1;
//		   System.out.println();
//		 // i++;
//		 }  
//
//		 if(i>3) {
//			num = num+4;			
//			space= space-2;
//			//we have added above code because value of  num = -1 and space =3 at the end of third loop
//			for(int j=0;j<space;j++) {
//				System.out.print(" ");
//				     }	
//			for( int j=1;j<=num;j++){   
//				   System.out.print("*");			    
//			   }
//			   System.out.println();
//			   num=num-2;//this needs to be added else next time again it will add 4 in num and the output will be different.
//			   
//		}
//		
//	}
		
//	_________________________________________________
		
//		 int num=5;
//		 int space=0;
//		 int num1=3;
//		 int space1=2;
//		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<space;j++) {
//			System.out.print(" ");
//			     }			
//			for(int k=1;k<=num;k++) {
//				System.out.print("*");
//			   }
//			 System.out.println();	
//			
//			space=space+1;
//			num=num-2;
//		   }
//		
//		for(int i=0;i<2;i++) {
//			for(int j=1;j<space1;j++) {
//				System.out.print(" ");
//				     }		
//			for(int k=1;k<=num1;k++) {
//				System.out.print("*");
//			}
//			 System.out.println();
//			 space1=space1-1;
//			 num1=num1+2;
//		}
		
		
// 		Both ways above are working
		
		 int num=5;
		 int num1=3;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<i;j++) {
			System.out.print(" ");
			     }			
			for(int k=1;k<=num;k++) {
				System.out.print("*");
			   }
			 System.out.println();				
			 num=num-2;
		   }
		
		for(int i=0;i<2;i++) {
			for(int j=i;j<=0;j++) {
				System.out.print(" ");
				     }		
			for(int k=1;k<=num1;k++) {
				System.out.print("*");
			}
			 System.out.println();
			 num1=num1+2;
		}
		
		

		 
  
    }
	
    
}
	



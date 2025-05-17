package Package2;
import java.lang.Object;
import java.io.IOException;
import java.util.*;

public class Exceptions{
	
	public static void main(String[] args)  {
		 
		
	   //Arithmetic Exception
		try{
	         int num1=30, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e){
	         System.out.println ("You Shouldn't divide a number by zero");
	      }
		//Another example :     double result = Math.sqrt(-1); // Throws ArithmeticException due to imaginary result
		
		//Array Index out of Bound exception
		try{
	        int a[]=new int[10];
	        //Array has only 10 elements
	        a[11] = 9;
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println ("ArrayIndexOutOfBounds");
	      }
	
		//Number format exception- occurs when a string is parsed to any numeric value
		try{
			 int num=Integer.parseInt ("XYZ") ;
			 System.out.println(num);
		      }
		catch(NumberFormatException e){
			  System.out.println("Number format exception occurred");
		       }
		
		//StringIndexOutOfBound Exception
		try{
			 String str="beginnersbook";
			 System.out.println(str.length());;
			 char c = str.charAt(40);
			 System.out.println(c);
		      }
		catch(StringIndexOutOfBoundsException e){
			  System.out.println("StringIndexOutOfBoundsException!!");
		       }
		
		//Null pointer exception	
		try{
			String str=null;
			System.out.println (str.length());
		}
	        catch(NullPointerException e){
			System.out.println("NullPointerException..");
		}
		
		
//Note: There is a super or generic class "Exception" which can handle all the above exceptions.		
		
		
		//Throw keyword---It is used when we want to explicitly declare any exception, we cannot handle exception using throw but
		//                but we can tell user where is the error occurred. 
		checkEligibilty(10, 39);
	
	}
		static void checkEligibilty(int stuage, int stuweight){ 
	      if(stuage<12 && stuweight<40) {
	         throw new ArithmeticException("Student is not eligible for registration"); 
	      }
	      else {
	         System.out.println("Student Entry is Valid!!"); 
	      }
	   
	
	
	}
		
		
}
	
	

package Package2;

import com.sun.jdi.Method;

public class CustomException extends Exception{

	
	CustomException(){
		System.out.println("My custom exception is caused");
	}

		
	public static void main(String[] args) throws CustomException   {
		
		//if you are explicitly calling exception then it can be handled by throws only
			int x=1;
			if(x>10) {
				System.out.println("Try block is passed successfully");
		}
			else {
				throw new CustomException();
			}
		//Below code will not get executed as the program will terminate above only after exception has occured
	    //Below logic is for knowledge 
		//If you are calling a method which can throw custom exception than that can be handled either by throws
	    // or try and catch
			try {
				method();
			} catch (CustomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
}
	
	public static void method() throws CustomException   {
		throw new CustomException();
	}
	
}
 
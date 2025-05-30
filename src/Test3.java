import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
	
	
	public static void main(String[]args) throws IOException {
		
		File file = new File("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\ABC.txt");
		boolean fvar = file.createNewFile();
	     if (fvar){	
	          System.out.println("File " + file.getName() + " has  been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
	                    	
	}
	//Testing comments
	
}
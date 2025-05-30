package Package2;

import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MulticastSocket;
import java.util.*;


public class CreateFile{
	
	
	public static void main(String[] args) throws IOException  {
		
		
		//To create new file through java
		File file = new File("C:\\Users\\Dell\\eclipse-workspace\\ABC.txt");
		boolean fvar = file.createNewFile();
	     if (fvar){	
	          System.out.println("File " + file.getName() + " has  been created successfully");
	     }
	     else{
	          System.out.println("File already present at the specified location");
	     }
	     
	     //To check if file is Hidden
	     if(file.isHidden()) {
	    	 System.out.println("The specified file is hidden");
	    	}else{
	    		System.out.println("The specified file is not hidden");
	    	}
	      
	     //setting file to read only mode.
	     file.setReadOnly();
    	     	     
	     
	    try {
	     //writing a file
	     //user will get error "Access is denied" as it is in read only mode.
	        FileOutputStream fos = new FileOutputStream(file);
		 	String text= " Add this text to the file";
		 	//String content cannot be directly written into a file. It needs to be converted into bytes
		 	byte byt[] =text.getBytes();
		 	fos.write(byt);
		 	fos.close();
	    }
	    catch(FileNotFoundException e){	    	
	    	e.printStackTrace();
	    	System.out.println(e.getMessage());
	    	System.out.println(e.toString());
	    	System.out.println("File cannot be written as the user does not have the required access");
	    	    }
	    
	    
	     
	     
//	     //To delete a file
//	     boolean fvar2 = file.delete();
//		 if (fvar2){	
//	          System.out.println("File " + file.getName() + " has been deleted successfully");
//	     }
//	     else{
//	          System.out.println("File is not deleted");
//	     }
	      
	     
	}
	}
package Package2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ReadWriteFile {
	
	
	public static void main(String[] args) throws IOException {
	 	
		//Property file is used to save the data in key and value pair
		//Reading the property file using File input stream
		 Properties prop = new Properties();
		 FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\Study Material\\Eclipse workspace\\Practise Program\\src\\Package2\\Properties.properties");
		 prop.load(fis);
		 System.out.println(prop.get("username"));
		 System.out.println(prop.getProperty("password"));
		 //no tenant property is available in the file so it returns null
		 System.out.println(prop.get("tenant"));
		 fis.close(); 
		 
		 //Note that we are creating the objects of IO Streams in main method directly hence no error, otherwise we need to create
		 //separate constructor to handle it
		 //Reading the text file using Buffer reader
		 BufferedReader br = null;
		 String filepath = "C:\\Users\\Dell\\Desktop\\Study Material\\Eclipse workspace\\Practise Program\\src\\Package2\\Class3.java.txt";
	   	 br = new BufferedReader(new FileReader(filepath));		
	   
		   System.out.println("Reading the file using readLine() method:");
		   String contentLine = br.readLine();
		   while (contentLine != null) {
		      System.out.println(contentLine);
		      contentLine = br.readLine();
		      //this statement if not given then it will go in infinite loop.Readlline method contains /n and /r
		      // readLine()= Reads a line of text. A line is considered to be terminated by any one of a line feed ('\n'), a carriage return ('\r'), 
		      // a carriage return followed immediately by a line feed, or by reaching the end-of-file(EOF).
		      //once the line is completed and there is no further text content line will be null and loop will be terminated.
		      
		   }
		 	br.close();
		 	
		 	
		 	
		  //Write file using FileOutputStream
		 	FileOutputStream fos = new FileOutputStream(filepath);
		 	String text= " Add this text to the file";
		 	//String content cannot be directly written into a file. It needs to be converted into bytes
		 	byte byt[] =text.getBytes();
		 	fos.write(byt);
		 	fos.close();
		 	
		 	
		 	
		 	
		 	
		 	
		 	
	       
	       
		
	}

}

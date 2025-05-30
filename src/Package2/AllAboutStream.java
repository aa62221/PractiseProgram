package Package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AllAboutStream {

	public static void main(String[] args) {
	
		
////Reading the file through FileInputStream		
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\TestFile.txt");
		int i=0;
		while((i=fis.read())!=-1) {   //-1 means it reaches the end of the data i.e nothing to read
			System.out.print((char)i);      //if not casted into char then  ASCII value would have been printed.
		}
		fis.close();
	}
	catch(Exception e) {
		System.out.println(e);
	} 
		

//Appending the data of one file to other file
	
	try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\TestFile.txt");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Dell\\eclipse-workspace\\TestFile2.txt",true); //Passing true parameter to append the text, else it will overwrite
		int i;
		try {
			while((i=fis.read())!=-1) {
				fout.write(i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		

	
	
	
	}

}

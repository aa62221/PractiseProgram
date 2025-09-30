import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Test {
	
	public static void main(String[] args) throws IOException {

		 String abc ="today is tuesday";
		 String[] words = abc.split(" ");
			for (int i = words.length - 1; i >= 0; i--) {
				String word = words[i];
				char firstChar= word.charAt(0);
				firstChar = Character.toUpperCase(firstChar);
                System.out.print(firstChar + word.substring(1) + " ");				
			}
			
			
	
	
	
	
	
	
}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

    public static void main(String[] args) {
    	 String s = "This is a large large large String";
    	 String[] words = s.split(" ");
    	 HashMap<String, Integer> hmap = new HashMap<String, Integer>();
			for (String w : words) {
				hmap.put(w, hmap.get(w)==null?1:hmap.get(w)+1);
			}
			System.out.println(hmap);
			
		int max= Collections.max(hmap.values());
		for( Map.Entry<String, Integer> me: hmap.entrySet()) {
			if (me.getValue() == max) {
				System.out.println("Word with maximum occurrence: " + me.getKey());
			}
		}

    	
    	
    	
		
    }
}
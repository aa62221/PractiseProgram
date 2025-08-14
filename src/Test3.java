
import java.util.HashMap;
import java.util.Scanner;

public class Test3 {
        public static void main(String[] args) {
           
        
        	HashMap<String, Integer> scores = new HashMap<>();
        	scores.put("Akash", 85);
        	scores.put("Vikas", 92);
        	scores.put("Priya", 85);
        	scores.put("Rohan", 78);
        	
        	scores.entrySet()
        		.stream()
        		.sorted((e1, e2) -> {
        			int valueCompare = e2.getValue().compareTo(e1.getValue());
        			if (valueCompare == 0) {
        				return e1.getKey().compareTo(e2.getKey());
        			}
        			return valueCompare;
        		})
        		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        }

        	
        	
}
        
        
        
        
        
        


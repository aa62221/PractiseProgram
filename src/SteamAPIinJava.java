import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SteamAPIinJava {
	
	
   
     public static void main(String[] args) {
    
    	 List<String> names = Arrays.asList("Akshay", "Kimaya", "Rohit","Ankita", "Anjali");
    	 names.stream().filter(s -> s.startsWith("A")).
    	 forEach(e -> System.out.println(e));
    	 System.out.println("-------");
    	 
    	 names.stream().map(s -> s.toUpperCase()).
    	 forEach(e -> System.out.println(e));
    	 System.out.println("-------");
    	 
    	 List<String> list =names.stream().sorted().collect(Collectors.toList());
    	 list.forEach(e -> System.out.println(e));
    	 System.out.println("-------");
    	 
    	 Long count =names.stream().count();
    	 System.out.println(count);
    	 System.out.println("-------");

    	 //Find the 2nd Highest number from the list of Array
    	 List<Integer> nums = Arrays.asList(10, 20, 8, 25, 20, 30, 30);
    	 int secondHighest = nums.stream()
                 .distinct()
                 .sorted(Comparator.reverseOrder())
                 .skip(1)
                 .findFirst()
                 .get();
            System.out.println(secondHighest);
            
          //Find the frequency of each character in the string  
          String input = "aabbcdeaa";
          char[] ch = input.toCharArray() ;
    	 
    }
}

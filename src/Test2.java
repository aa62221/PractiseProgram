
import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {
         int array[]= {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6};
		 HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		 for(int i: array) {
			 hmap.put(i, hmap.get(i)==null?1:hmap.get(i)+1);
		 }
		 System.out.println(hmap);
		 
    	
    	
    	
    }
}

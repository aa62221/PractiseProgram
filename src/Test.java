import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		
		
		int arr[]= {14,3,12,7,8,12,3,1};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		for( int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]- arr[i]==1 |arr[i+1]- arr[i]==0) {
				System.out.println("no missing number");
			}
			else{
				for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
					System.out.println(j + " ");
				}
				
			}
		}
	
		
	}
  
}
	
         
	
	
	



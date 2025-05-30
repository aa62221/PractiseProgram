import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighestNumberInArray {
	
	static int array[]= {5,1,8,15,12,45,99,75,0};
	static int highest =0;
	static int secondhighest =0;
	
	
	public static void main(String[] args) {

		for(int m: array) {
			if(m>highest) {
				secondhighest = highest;
				highest =m;
			}
			else if(m>secondhighest){
				secondhighest = m;
			}
			
		}
		System.out.println("Highest number is "+ highest);
		System.out.println("Second Highest number is "+ secondhighest);
	
		sortmethod();
	}
	

//OR you can also use sort method

public static void sortmethod() {
	
	Arrays.sort(array);
	System.out.println(array[array.length-2]);
		
}





}
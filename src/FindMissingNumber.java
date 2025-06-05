import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {

	public static void main(String[] args) {
		
//		//Program to find the missing number from first n natural number
//		
//		int n, sumOfArray=0;
//		Scanner scan = new Scanner(System.in);		
//		System.out.println("Enter the number of elements in array");
//		n=scan.nextInt();
//		 
//		int array[] = new int[n];		
//		for( int i=0; i<=n-2;i++) {
//			array[i]= scan.nextInt();			
//			sumOfArray =sumOfArray+array[i];			
//		}
//		//Sum of first n natural numbers		
//		int sumOfnNumber = (n*(n+1))/2;		
//		int missingNumber = sumOfnNumber-sumOfArray;
//		
//		System.out.println("Missing number is "+ missingNumber);
//		scan.close();
//----------------------------------------------------------------------------------------------------------
	
		//Program to find missing numbers between 2 consecutive numbers in an array
		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter the number of elements in array");
		int n=scan.nextInt();
		 
		int array[] = new int[n];		
		for( int i=0; i<=n-1;i++) {
			array[i]= scan.nextInt();								
		}
		Arrays.sort(array);
		
        System.out.println(Arrays.toString(array));
        
        for(int i=0;i<array.length-1;i++) {
       	
        	if(array[i+1]-array[i]==1) {
        		System.out.println("no missing number");
        	}
        	else {
        		for(int j=array[i]+1; j<array[i+1];j++) {
        			System.out.print(j +" ");
        		}
        	}
        	
        	System.out.println();
        	
        }
        
        scan.close();
	}

}

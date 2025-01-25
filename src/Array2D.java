import java.util.Arrays;

class Array2D {

	public static void main(String[] args) {
	
	//Program to print 2D Array	
		
//		int array[][]= new int[2][3];
//		
//		array[0][0]= 1;
//		array[0][1]= 2;
//		array[0][2]= 3;
//		array[1][0]= 4;
//		array[1][1]= 5;
//		array[1][2]= 6;
	
	    int array[][] = {{1,2,3},{4,5,6}};
	    
		int[] intArr= { 1, 2, 3, 4 };
		System.out.println(intArr);
		//Simple way to print any array
		System.out.println(Arrays.toString(intArr));
		
		//This will give you hash value as this method does not work on 2D array
		System.out.println(Arrays.toString(array));
		
		for(int i=0; i<2; i++) {
		
		      for(int j=0; j<3; j++) {
			 
			System.out.print (array[i][j] + " ");
			
		} 
		     System.out.println();
		
		}
	
		
	}

}

package Package2;

public class ContinueStatement {

	public static void main(String[] args) {
	
		
		//With while loop
		int x =0;
		while(x<10) {
				
			if(x==2)
			{
				x++;      //This statement is very necessary here because once continue statement is reached 
				          //it will go the beginning of the loop and x++ mentioned after if loop will not be called.
				continue;
//				x++;     // we cannot write this statement after continue as it will not be reachable.
				           //Once continue is called it will go to the beginning of the loop. You will get error  "Unreachable code".
			}
			System.out.println(x);
			x++;
		}
		
		
		System.out.println("-------------------------");
		
		//With for loop
		for(int y=0; y<10; y++) {
			if(y==3) {
				continue;  //no need to mention y++ as the increment operator is mentioned in the beginning of the for loop.
			}
			System.out.println(y);
		}

	}
 
}

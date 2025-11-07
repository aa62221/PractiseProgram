package Package2;

public class Test2  {
	
public static void main(String[]args) {
		
	Test2 obj= new Test2();
	obj.check();
	
	
	}

public void run() {
	int i = 10;
	int j = i / 0;
}

public void check() {
try {
System.out.println(10);
run();
System.out.println(0);
}

catch(ArithmeticException | ArrayIndexOutOfBoundsException e){  
    System.out.println(e.getMessage());       
}
//Below catch block will not be executed as the exception will be caught above only
catch (Exception e) {
//e.printStackTrace();
if (e instanceof Exception) {
System.out.println(2);
}
if (e instanceof Throwable) {
System.out.println(3);
}
System.out.println(4);
}
   


finally {
System.out.println(5);
}
}



   
}

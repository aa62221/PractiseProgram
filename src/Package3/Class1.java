package Package3;

import Package2.Test2;

public class Class1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Class1 obj= new Class1();
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
		} catch (Exception e) {
		System.out.println(4);
		run();
		
		} finally {
		System.out.println(5);
		}
		
		System.out.println(6);
	
		
		//The code after the finally block is not executed because the exception in catch block is not handled.
		//JAVA will run finally block without condition.
	}
	   
}
 
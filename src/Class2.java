public class Class2 extends abst{
	
	int x=11;
    int y; 
	String str;
	public final void method1() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Class2 obj = new Class2();
		obj.method1();
		
		abst obj2= new Class2();
		//Over-riding method of child class will be called
		obj2.method1();
		System.out.println(obj2.i);
		System.out.println(obj2.x);   //Data members are not overridden, so it will print value of parent class variable
		System.out.println(obj2.y);  
		System.out.println(obj2.z);
		obj.testLocalVariable();

	}

	public void testLocalVariable() {
		int x;
//		System.out.println(x);---This will throw error as the local variable needs to be initialized else it will throw compile error
		System.out.println(y);
//		This will print 0 as default value because this is Global variable
		System.out.println(str.length());
//		This will throw null pointer exception as the variable was not initialized during declaration
	
	}

}
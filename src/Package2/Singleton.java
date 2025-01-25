/**
 * 
 */
package Package2;

/**
 * @author Akshay
 * 
 * The object of this class is called in Class1 under Package 2
 *
 */
public  class Singleton {

	int x = 10 ;
	//Step1 to create static object of same class
	static Singleton obj = null;
	//Step2 to create private constructor
	private Singleton() {
	}
	//Step3 to create static method to return object of class,
	public static Singleton methodToCallObject() 
	{
		if(obj==null) {
			obj = new Singleton();
		}
		return obj;

}
	public static void main(String[]args) {
		
	Singleton obj = Singleton.methodToCallObject();
	Singleton object2 = Singleton.methodToCallObject();
	System.out.println(obj.x);
	System.out.println(object2.x);
	obj.x = 15;
     //The below line of code shows that multiple object of class will also have same value as it is singleton class		
	System.out.println(object2.x);
	
}
	
}
 
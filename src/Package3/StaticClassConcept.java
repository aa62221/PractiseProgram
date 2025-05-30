package Package3;

public  class StaticClassConcept {
	
     
	
	static class Test{
		
	}
	
	class Test2
	{
		
	}

	//Nested class in java can be static however the main class cannot.
	//non static nested class is called inner class.
	
	
	
	public static void main(String[] args) {
		
		StaticClassConcept.Test nestedObject= new Test();
		StaticClassConcept outerObject = new StaticClassConcept();
		StaticClassConcept.Test2 innerObject = outerObject.new Test2();
		
	}
}
 

import java.util.*;



public class JavaCollection {
	
	public static void main(String[] args) {
     
	  int[] arr= {1,2,3,4,5};
	  int[] arr2= {1,2,4,6,7,8,9,10};
	  
	  //retain only common elements
	  List<Integer> list1= new ArrayList<>();
	  for(int i: arr) {
          list1.add(i);
	  }
	  List<Integer> list2= new ArrayList<>();
	  for(int i: arr2) {
          list2.add(i);
	  }
	  list1.retainAll(list2);
	  System.out.println(list1);
	  
	  //remove common elements
	  List<Integer> list3= new ArrayList<>();
	  for(int i: arr) {
          list3.add(i);
	  }
	  List<Integer> list4= new ArrayList<>();
	  for(int i: arr2) {
          list4.add(i);
	  }
	  list3.removeAll(list4);
	  System.out.println(list3);
	  
	  //add all elements
	  List<Integer> list5= new ArrayList<>();
	  for(int i: arr) {
          list5.add(i);
	  }
	  List<Integer> list6= new ArrayList<>();
	  for(int i: arr2) {
          list6.add(i);
	  }
	  list5.addAll(list6);
	  System.out.println(list5);
          
	  
		
		
		
		
		
		
		
		
	  }
	
	
	
	
}


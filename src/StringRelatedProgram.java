import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class StringRelatedProgram {
	
	
	public static void main(String[] args) {
		
		sumOfNumberInString();
		findDistinctElement();
		compareTwoString();
		compareString();
		removeWhiteSpaces();
		swapStrings();
		smallestUniqueSubstring();
		System.out.println(anagram("abaaa", "baaaa"));
		countWords();
		System.out.println(uniqueCharacter());
		numberOfCharacters();
		vowelsAndConsonants();
		pascalCase();
		System.out.println();
		System.out.println(methodToReturnSingleDigitSum("7891"));
		pascalCase1();
	}
		
//----------Find the sum of the numbers in the given string------------
  public static  void sumOfNumberInString() {	
		String str = "dh4d3k2l1234k";
        char[] array = str.toCharArray();
        int sum = 0;
        //String temp = "";
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            String temp = "";
            if (Character.isDigit(c)) {
//            	sum+= Character.getNumericValue(c);--- You can use this method as well
                temp += c;
                sum+=Integer.valueOf(temp);
           }      
        }
        System.out.println(sum);
		
	}
  
//----------Find the element with digit in it from array------------
  public static  void findDistinctElement() {	
	  String [] city = {"Pune","Mumb1ai","Ci23y"};
      
      for( int i=0;i<city.length;i++){
          
          String s =city[i];
          
          for(int j=0;j<s.length();j++){
              char c= s.charAt(j); 
              if(Character.isDigit(c)){
                  System.out.println(s);
                  break;
              }
          }
              
          }
          
      }
  
 //-----------------Compare 2 string with equals() method and == operator-----------------
  public static void compareTwoString() {
	  String S1 = "coding ninjas";
	  String S3 = "coding ninjas";
	  String S2 = new String("coding ninjas");
	  String S4 = new String("coding ninjas");
	  String S5 = "Coding ninjas";
	  String S6 = new String("coding ninjas").intern();
	  System.out.println(S1==S3);  //returns true as both are created using literals and value is stored in string constant pool
	  System.out.println(S1==S2); // returns false, as it compares the reference in the memory
	  System.out.println(S1.equals(S2)); // return true, as it compares the values of the two strings.
	  System.out.println(S2==S4); // returns false as two new objects has been created in heap memory for s2 and s4.
	  System.out.println(S1.compareTo(S5)); // return 32 as it compares String lexicographically
	  System.out.println(S1==S6);//return true as intern method creates an object in the constant pool.
	  System.out.println("____________");
  }
  
  
  //---------------Comparing String, String Buffer, String Builder------------------------
  
  public static void compareString() {
	  String S1 = "coding ninjas";
	  StringBuffer S2= new StringBuffer(S1);
	  StringBuilder S3= new StringBuilder(S1);
	  
	  
  //    System.out.println(S1==S2);   // Throw error as you cannot compared two different types
	    System.out.println(S1.equals(S2));// Returns false as types are different
	    System.out.println(S1.contentEquals(S2)); //Returns true as contentEquals() method takes String Buffer parameter
	    
	//    System.out.println(S1==S3);   // Throw error as you cannot compared two different types
	    System.out.println(S1.equals(S3));// Returns false as types are different
	    System.out.println(S1.contentEquals(S3)); //Returns true as contentEquals() method takes String Builder parameter
	    System.out.println("____________");
  }
  
 
//------------Remove white spaces from the string with and without using trim() method---------------
  public static void removeWhiteSpaces() {
	  String s ="    T e s t         ";
	  String p="";
	  
//	  System.out.println(s);
//	  System.out.println(s.trim());//trim() method will only remove spaces from start and end and not in between string
//	  String result = s.replaceAll("\\s+", "");
	  
	  for(int i=0;i<s.length();i++) {
		 char c =s.charAt(i);	
		 if(c!=' ') {
			 p+=c;	 
		 }	  
	  }
	  System.out.print(p);
	  System.out.println();

  }
      
//-----------Swap 2 strings without using third variable---------------
  
  public static void swapStrings() {
	  
	  String a="Coding";
	  String b="ninjas";
	  
	  a= a+b;
	  System.out.println(a);
	  b= a.substring(0,a.length()-b.length());
	  System.out.println(b);
	  a=a.substring(b.length());
	  System.out.println(a);
	  

  }
  
 //------------Program to print the smallest unique substring------------
  
	public static void smallestUniqueSubstring() {
		// TODO Auto-generated method stub
		
		String s ="ABAABBAAC";
		int n =2;//as smallest substring would be of 2 characters
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		for(int i=0; i<=s.length()-n;i++) {
		 String p= s.substring(i,i+n);
	     
		 Integer val =hmap.get(p);
		 if(val==null) {
		 hmap.put(p,1);
		 }
		 else {
			 hmap.put(p, val+1);
		 } 
		 
		}
		System.out.println(hmap);
		
		Iterator<Map.Entry<String,Integer>> itr =hmap.entrySet().iterator();
		while(itr.hasNext()) {
		  Map.Entry<String,Integer> me = itr.next();
		  Integer v=me.getValue();
		  if(v==1) {
			  System.out.println("Smallest unique substring is " +me.getKey());
		  }
			
		}
	}
		
//------------Check if Strings are anagrams----------------------------
		
	public static boolean anagram (String str1, String str2) {
		
		boolean isAnagram= true;
		
		char[] str11= str1.toCharArray();
		char[] str12= str2.toCharArray();
		
		int n1 = str11.length;
		int n2 = str12.length;
		
		if(n1!=n2) {
			 isAnagram=false;
		}
		else {
		Arrays.sort(str11);
        Arrays.sort(str12);
        
//        if (Arrays.equals(str11, str12)) {
//			System.out.println("Strings are Anagrams");
//		} else {
//			System.out.println("Strings are not Anagrams");
//		}
        try {
        for(int i=0; i<n1;i++) {
        	if(str11[i]!=str12[i]){
        		isAnagram=false;
        		break;
        	}        	
          }
        }
        catch(Exception e) {
        	System.out.println(e.toString());
          }
 
		}
		return isAnagram;
	}
		
//------------Count the number of words in the string----------------------------
	
	public static void countWords() {
	String str1 = "Count the number of   words   in this    String   a";
	// String[] words = str1.trim().split("\\s+"); Trim leading and trailing spaces and split by one or more spaces
	int count=0;
	if (str1.charAt(0) != ' ') {
		count++;
	}
	for( int i=0; i<str1.length()-1; i++) {
		if(str1.charAt(i)==' ' && str1.charAt(i+1)!= ' ') {
			count++;			
		}
		
	}
       System.out.println("Number of words in a string are " + count);
}

	//------------First unique character in the string----------------------------	
	
	public static char uniqueCharacter() {
		
		String s = "abcdefacf";
		char[] c = s.toCharArray();	
		char u = 0;
		HashMap<Character,Integer> hmap = new LinkedHashMap<Character, Integer>();
		
		for(char ch: c) {
		Integer val= hmap.get(ch);		
		if(val==null) {
			hmap.put(ch, 1);
		}
		else {
			hmap.put(ch, val+1);
		}	
		}		
		System.out.println(hmap);		
		Iterator<Map.Entry<Character, Integer>> itr =hmap.entrySet().iterator();
		while(itr.hasNext()) {
		  Map.Entry<Character, Integer> me = itr.next();
		  Integer v=me.getValue();
		  if(v==1) {
			 u=me.getKey();
			 break;      //Remove this statement if you want to find all the unique characters
		  }
		
		}	
		return u;
		
	}
	
//---Count the number of alphabets in each word in string--------------------
	
	public static void numberOfCharacters() {
		String s = "  test  this    madam";
		
		char [] str= s.toCharArray();
		for(int i=0;i<str.length;i++) {
			String s1="";
			
			while(i<str.length && str[i]!=' ') {
				s1=s1+str[i];	
				i++;
			}	
			
			if(s1.length()>0)
			System.out.println(s1+ " -" +s1.length());			
		}
		//-------Alternative way to count number of characters in each word in string
//		   String[] words = s.trim().split("\\s+");
//	       for(String word:words) {
//	    	   System.out.println(word.length());
//	       }
		
	}
	
//------------Number of Vowels and Consonants---------------------
	
	public static void vowelsAndConsonants(){
		  
		String s = "aeiouj";
        char[] c= s.toCharArray();
        int vowelcount =0;
        int consonent =0;
		for(char ch: c) {
			
			//ch= Character.toUpperCase(ch);
			if(ch=='a' ||ch=='e' || ch=='i' ||ch=='o'||ch=='u' ) {
			  vowelcount++;	
			}
			else if(ch!=' '){
				consonent++;
			}
		}
		
		System.out.println(vowelcount);
		System.out.println(consonent);
		}	
	
//------------PascalCase---------------------
	
	 public static void pascalCase(){	
	 String s ="json simPle guAva apache comMons lang3 junit jmock";
	 //s=s.toLowerCase();
     String[] str = s.split(" ");
     
     for( int i=0; i<str.length;i++){
          
         String p =str[i];
         p=p.toLowerCase();
         String q="";
         for(int j=0; j<p.length();j++){
          
             if(j==0){
                 q=q+p.charAt(j);  
                 q=q.toUpperCase();
             }
             else{
                 q=q+p.charAt(j);            
             }                            
         }
         System.out.print(q+ " ");
     }
  	}

	 
//----------Sum the Digits of the String till the result is Single Digit--------------
	 public static String methodToReturnSingleDigitSum(String str) {
			
			
			while(str.length()>1) {
				int sum=0;			
				for(int i=0;i<str.length();i++) {
					String s="";
					s=s+str.charAt(i);				
					sum=sum+Integer.parseInt(s);	
//					sum += Character.getNumericValue(str.charAt(i));
				}
				str=String.valueOf(sum); 		
			}
			return str;
			
		}
	 
//----------Pascal case without using inbuilt function--------------
//------------Also called as Title Case		
	 public static void pascalCase1(){	
		 
		 String s ="Selenium is easier than API Automation";
			String[] words = s.split(" ");
			for(int i = 0;i< words.length;i++) {
			
			String S =words[i];
			char firstChar = S.charAt(0);
			if (firstChar >= 'a' && firstChar <= 'z') {
			    firstChar = (char)(firstChar - 32);
			}
			String result = firstChar + S.substring(1);
			System.out.print(result+ " ");
		}
		 
	 
	 }
}


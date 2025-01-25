package Package2;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Class1 {

	public static void main(String[] args) {
		String s ="Selenium is easier than API Automation";
				String[] str= s.split(" ");
				int n =str.length;

				for(int i=0;i<n;i++){

				String p =str[i];
				String q="";
				for(int j=0;j<p.length();j++){

				if(j==0){
				q=q+p.charAt(j);
				q=q.toUpperCase();
				}
				else{
				q=q+p.charAt(j);
				}
				
				}
				q= q+" ";

				System.out.print(q);
	}
				
				
	
} 
	
	
}
	



	


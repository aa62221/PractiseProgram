import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterviewQue {

	public static void main(String[] args) {
		
		EvenOddPartition();
		System.out.println("Number of ways to reach top : " +countWays(3));
		removeLeadingTrailingZeros("000123000");
		System.out.println(reverseString("abcd$akd#p"));
		noOfClicks();
		leaderInteger();
		findDate();
		findPalandrome("abamk121plalp");
		moveZeros();
	}
	
	//Sliding window approach
	//shift all even numbers to the left and odd numbers to right
	public static void EvenOddPartition() {
		int arr[] = {2,5,8,7,1,3,6,4,5,9};		
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] % 2 == 0) {
				left++;
			} else if (arr[right] % 2 != 0) {
				right--;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	

	// Method to calculate the number of ways to reach the nth stair
    public static int countWays(int n) {
        // Base cases
        if (n == 0) {
            return 1; // 1 way to stay at the ground
        }
        if (n < 0) {
            return 0; // No way to go below ground
        }
        // Recursive calls for 1 step, 2 steps, and 3 steps
        return countWays(n - 1) + countWays(n - 2);
    }
//    If n = 3:
//
//    	countWays(3) = countWays(2) + countWays(1)
//
//    	countWays(2) = countWays(1) + countWays(0)
//    	→ 1 + 1 = 2
//
//    	countWays(1) = countWays(0) + countWays(-1)
//    	→ 1 + 0 = 1

        // Remove leading and trailing zeros from a string
     public static void removeLeadingTrailingZeros(String s) {
        int start = 0;
        while (start < s.length() && s.charAt(start) == '0') {
            start++;
        }
        // Find the last non-zero character
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == '0') {
            end--;
        }
        // Extract the substring between start and end
//        String result = (start <= end) ? s.substring(start, end + 1) : "";
        String result = s.substring(start, end + 1);
        System.out.println(result);
    }
     
     //OR
//     char[] c= str.toCharArray();
//     String sb = "";
//		for (char ch : c) {
//			if (ch == '0') {
//				continue;
//			}
//			sb= sb+ ch;
//			
//		}
//		System.out.print(sb);

     // Method to reverse only alphabetic characters in a string
     public static String reverseString(String str) {
         char[] chars = str.toCharArray();
         List<Character> letters = new ArrayList<>();
         // Collect all alphabetic characters
         for (char c : chars) {
             if (Character.isLetter(c)) {
                 letters.add(c);
             }
         }
         // Reverse the list of alphabetic characters
         Collections.reverse(letters);
         // Replace alphabetic characters in the original string
         int letterIndex = 0;
         for (int i = 0; i < chars.length; i++) {
             if (Character.isLetter(chars[i])) {
                 chars[i] = letters.get(letterIndex);
                 letterIndex++;
             }
         }
         return new String(chars);
     }
     
   //Suppose there is an application that capture the IP Address of the user upon each click and that information is logged in the Audit logs. Find out who has the maximum number of clicks
     public static void noOfClicks() {

         // Sample audit log data (userId, IP address)
         String[] auditLogs = {
             "192.168.1.1",
             "192.168.1.2",
             "192.168.1.1",
             "192.168.1.3",
             "192.168.1.2",
             "192.168.1.1",
             "192.168.1.3",
             "192.168.1.1"
         };
         // Map to store the count of clicks for each user
         Map<String, Integer> userClickCount = new HashMap<>();
         // Process audit logs
         for (String log : auditLogs) {
         	Integer val =userClickCount.get(log);
         	if(val == null) {
 				userClickCount.put(log, 1);
 			} else {
 				userClickCount.put(log, val + 1);
         	}
         }
         System.out.println(userClickCount);
         // Find the user with the maximum clicks
         String maxUser = null;
         int maxClicks = 0;
         for (Map.Entry<String, Integer> entry : userClickCount.entrySet()) {
             if (entry.getValue() > maxClicks) {
                 maxUser = entry.getKey();
                 maxClicks = entry.getValue();
             }
         }
         // Output the result
         System.out.println("User with maximum clicks: " + maxUser + " (" + maxClicks + " clicks)");
     
     }
     
     //A leader element in an array is the one that is strictly greater than all the elements to its right.
     // By definition, the rightmost element is always a leader.
//     Array: [16, 17, 4, 3, 5, 2]
//    		 Start from the right: 2 → leader (rightmost).
//    		 Next: 5 > 2 → leader.
//    		 Next: 3 < 5 → not leader.
//    		 Next: 4 < 5 → not leader.
//    		 Next: 17 > 5 → leader.
//    		 Next: 16 < 17 → not leader.
//    		 ✅ Leaders are: [17, 5, 2]

     
         public static void leaderInteger() {
             int[] arr = {16, 17, 4, 3, 5, 2};
             List<Integer> leaders = new ArrayList<>();

             int n = arr.length;
             int maxFromRight = arr[n - 1];  // rightmost element is always a leader
             leaders.add(maxFromRight);

             // Traverse from right to left
             for (int i = n - 2; i >= 0; i--) {
                 if (arr[i] > maxFromRight) {
                     maxFromRight = arr[i];
                     leaders.add(maxFromRight);
                 }
             }

             // Since we added leaders in reverse order, reverse the list
             Collections.reverse(leaders);

             System.out.println("Leader elements: " + leaders);
         }
         
         //Find the date from the given string and print
          public static void findDate() {
        	  String input ="My DOB is 09-09-1993 and Kimaya's is 21/03/1994";
      	    String pattern = "\\d{2}[-/]\\d{2}[-/]\\d{4}";
      	    List<String> dates = new ArrayList<>();
      	    Pattern p = Pattern.compile(pattern);
      	    Matcher m = p.matcher(input);
      		while (m.find()) {
      			dates.add(m.group());
      		}
      		
      		System.out.println(dates);
          }
          
           //Find the longest palindrome substring in a given string with its length
          public static void findPalandrome(String str) {
      		
      		HashMap<String, Integer> map = new HashMap<>();
      		for( int i=0;i<str.length();i++){
                  
                  for( int j=i+1;j<=str.length();j++){
                       
                      String sb =str.substring(i,j);
                      String rev = new StringBuilder(sb).reverse().toString();
//                      StringBuilder rev = new StringBuilder(sb);
//                      rev= rev.reverse();
//                      if(sb.contentEquals(rev)) {
//                    	  System.out.println("Palindrome substring is: " + sb);
//                      }
                      if(sb.equalsIgnoreCase(rev)) {
      					map.put(sb, sb.length());
                      }
                  }
      	  }
      		
      		int max =Collections.max(map.values());
      		
      		for (Map.Entry<String, Integer> entry : map.entrySet()) {
      			if (entry.getValue() == max) {
      				System.out.println("Longest Palindrome substring is: " + entry.getKey() + " with length: " + entry.getValue());
      			}
      		}
          }
          
          //Program to move zeros to the end of an array
          public static void moveZeros() {
        	  int[] arr= {3,0,2,1,0,0,6,1,9,0};
              int index = 0;
              // Step 1: Move all non-zeros forward
              for (int i = 0; i < arr.length; i++) {
                  if (arr[i] != 0) {
                      arr[index] = arr[i];
                      index++;
                  }
              }
              // Step 2: Fill remaining places with 0
              // Going till arr.length as index is added for last loop above i.e 6
              while (index < arr.length) {
                  arr[index] = 0;
                  index++;
              }
              System.out.println(Arrays.toString(arr));
          }
          
        //shift all even numbers to the left and odd numbers to right while maintaining their original order
      	 public static void EvenOddPartitionMaitainingOrder() {
      		
      		   int[] arr = {8, 5, 2, 4, 9, 6, 3, 1, 7};
      	       int[] result = new int[arr.length];
      	       int index = 0;
      	        // Step 1: Copy evens in order
      	        for (int num : arr) {
      	            if (num % 2 == 0) {
      	                result[index++] = num;
      	            }
      	        }
      	        System.out.println(index);
      	        // Step 2: Copy odds in order
      	        for (int num : arr) {
      	            if (num % 2 != 0) {
      	                result[index++] = num;
      	            }
      	        }
      	        System.out.println(Arrays.toString(result));
      }
      	 
      	 //Note:- You have to create new array "result" here , you can't do in same array like moveZeros()
      	 // Because array during first for loop array will change to 8,2,4,6,9,6,3,1,7 and you will loose 5 and 6 will appear twice.
     
}

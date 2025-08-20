import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQue {

	public static void main(String[] args) {
		//shift all even numbers to the left and odd numbers to right
		EvenOddPartition();
		System.out.println("Number of ways to reach top : " +countWays(3));
		removeLeadingTrailingZeros("000123000");
		System.out.println(reverseString("abcd$akd#p"));
	}
	
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


    
}

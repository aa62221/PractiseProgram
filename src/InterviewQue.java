import java.util.Arrays;

public class InterviewQue {

	public static void main(String[] args) {
		//shift all even numbers to the left and odd numbers to right
		EvenOddPartition();
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

}


/*
 ! Rotate array by K elements

Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

Examples:

Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

*/
import java.util.*;

class rotate {

	public static void Swap(int arr[], int start, int end){

		while(start<=end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void rotateright(int arr[], int k) {
       // ! Method 1
		int size = arr.length;
		// if (size == 0)
		// 	return;
		// k = k % size; // to bring in range
		// if (k > size)
		// 	return;
		// int temp[] = new int[k]; // size k ka array

		// for (int i = size - k; i < size; i++) { // last ke k elements ko temp array me store kar dena
		// 	temp[i - (size - k)] = arr[i];
		// }

		// for (int i = size - k - 1; i >= 0; i--) { // last ke k-1 element ko right me khiskana
		// 	arr[i + k] = arr[i];
		// }
		// for (int i = 0; i < k; i++) { // shuru k elements ko wapas se bharna temp se
		// 	arr[i] = temp[i];
		// }
	// !Method 2
	 //* giveven array [1,2,3,4,5,6] */
     //  ~ Step 1 : Reverse last k element [1,2,3,4,5,7,6]
     //  ~ Step 2: Reverse first n-k element [5,4,3,2,1,6,7]
     //  ~ Step 3: Reverse whole arrsy [7,6,5,4,3,2,1]
         
	 Swap(arr, size-k, size-1);
	 Swap(arr,  0, size-k-1);
	 Swap(arr,  0, size-1);
	}

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		rotateright(arr, 2);

		System.out.print(Arrays.toString(arr));
	}
}
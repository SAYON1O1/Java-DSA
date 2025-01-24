/*Remove Duplicates in-place from Sorted Array

Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array.*/

import java.util.*;

class Dublicate_element_in_arr{
 
/*
    ! method 1 */
	     	// O(n^2)----> Time
			// O(n)-------> Space
	// public static int[] remove(int arr[], int n){
    //           int ar[]=new int[n];
    //            int k=0;
	// 	for(int i=0; i<n; i++)
	// 	{    int check=0;
	// 		for(int j=i+1; j<n; j++){
	// 			if(arr[i]==arr[j]){
    //                 check=1;
	// 			}
	// 		}
	// 		if(check!=1){
	// 		  ar[k]= arr[i];
    //                 k++;
	// 		}
	// 	}
	// 	return ar;
	// }

/*
    ! modifies approach */

	// public static int[] remove(int arr[], int n){
	// 	int i = 0;
    //     for (int j = 1; j < arr.length; j++) {
    //         if (arr[i] != arr[j]) {
    //             i++;
    //             arr[i] = arr[j];
    //         }
    //     }
		 
	// 	 i++;

	// 	while(i<n){
	// 			arr[i]=0;
	// 			i++;
	// 	}

	// 	return arr;

	// }
	
/*
    ! method 2 using HashSet<>
 */
	        // O(nlogn)----> Time
	// public static int[] remove(int arr[], int n){
	// 	// HashSet set = new HashSet<>();
	// 	HashSet<Integer> set = new HashSet<>();
	// 	for(int i=0; i<n; i++){
	// 		set.add(arr[i]);
	// 	}
	// 	int j = 0;
	// 	for(int x: set){
	// 		arr[j]=x;
	// 		j++;
	// 	}
	// 	while(j<n){
	// 		arr[j]=0;
	// 		j++;
	// 	}
	// 	return arr;
	// }

	

	public static void main(String args[]){
		int arr[]={1,1,2,2,2,3,3};
			
		System.out.println(Arrays.toString(remove(arr,arr.length)));	

	}


}
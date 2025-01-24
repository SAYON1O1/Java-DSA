/*
! Problem Statement: 
   Given an array of N integers, left rotate the array by one place.
*/
class Rotate_by_1{



	public static void Rotate(int arr[]){
		int ele_1 = arr[0];
		for(int i=0; i< arr.length-1; i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]= ele_1;
	}



	public static void main(String args[]){

		int array[] = {1,2,3,4,5};
                  
		Rotate(array);
		System.out.print("The rotated array by one element is: ");
			for(int i= 0; i<array.length; i++){
				System.out.print(array[i]);
			}
	}
}
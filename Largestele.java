import java.util.*;

class Largestele{
	

	public static int Largest(int arr[], int n){
	    int Large = Integer.MIN_VALUE;	
		for(int i= 0; i<n; i++){
			if(arr[i]>Large)
			{
				Large = arr[i];
			}
		}
			// METHOD 2
		//Arrays.sort(arr);
		//Large= arr[n-1];

			//METHOD 3
		//for (i = 0;i < n;i++)
		//{
		//small = Math.min(small,arr[i]);
		//Large = Math.max(large,arr[i]);
		//}
		return Large;
	}
	public static int Slargest(int arr[], int n){
		int Large = Integer.MIN_VALUE;
		int Slarge = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			if(arr[i]> Large){
				Slarge = Large;
				Large = arr[i];
			}
			if (arr[i]>Slarge && arr[i]<Large)
			{
				Slarge = arr[i];
			}
			
					
		}	

		return Slarge;	

	}
	  
	public static int Smallest(int arr[], int n){
	    int Small = Integer.MAX_VALUE;	
		for(int i= 0; i<n; i++){
			if(arr[i]<Small)
			{
				Small = arr[i];
			}
		}
		//Arrays.sort(arr);
		//Large= arr[n-1];
		//for (i = 0;i < n;i++)
		//{
		//small = Math.min(small,arr[i]);
		//Large = Math.max(large,arr[i]);
		//}
		return Small;
	}

	public static int Ssmallest(int arr[], int n){
		int Small = Integer.MAX_VALUE;
		int Ssmall = Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++) {
			if(arr[i]< Small){
				Ssmall= Small;
				Small = arr[i];
			}
			if (arr[i]<Ssmall && arr[i]<Small)
			{
				Ssmall = arr[i];
			}
			
					
		}	

		return Ssmall;	

	}

	public static void main(String args[]){
			
		int arr[] = {-5,-9,-2,-4,-1};
		System.out.println("The largest element in the array is: "+ Largest(arr,arr.length));
		System.out.println("The Second largest element in the array is: "+ Slargest(arr,arr.length));
		System.out.println("The SMALLEST element in the array is: "+ Smallest(arr,arr.length));
		System.out.println("The Second smallest element in the array is: "+ Ssmallest(arr,arr.length));



	}



}
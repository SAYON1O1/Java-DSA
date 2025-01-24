import java.util.*;

public class Ar{
	
	public static void main(String args[]){
		System.out.println("Give me the size of the array");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println("Enter the elements");
		int arr[] = new int[n];
			
			for(int i=0; i<n; i++){
				System.out.print("Enter element "+ i +" of array:");
			    arr[i]=sc.nextInt();
			  
			}

			for(int i=0; i<n; i++){
			   System.out.println(i+"th element of array = " + arr[i]);
			  
			}
			Arrays.sort(arr);
			  System.out.print("After sorting");
			for(int i=0; i<n; i++){
				System.out.println(i+"th element of array = " + arr[i]);
			   
			 }
			String s= Arrays.toString(arr);
			System.out.print("in string form"+s);	
                

	}


}

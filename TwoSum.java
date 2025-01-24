import java.util.*;

class TwoSum{
    
	public static int[] Solution(int arr[], int target){
		System.out.print("Function called");
		for(int i=0; i<(arr.length)-1; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i]+arr[j]==target){
					return new int[]{i,j};
				}
					
			}
		}
		 return new int[]{};


	}
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array");
			int n = sc.nextInt();
		  int arr[]= new int[n];
	        System.out.print("Enter the target");
			int target = sc.nextInt();
			System.out.print("Enter the array elements");
                for(int i = 0;i<arr.length;i++){
			        arr[i]=sc.nextInt();
		}
		System.out.println();		   
		  
		          /*  
				     ! ************very impoetant********8 !
				        Arrays.toString(Solution(arr,target))
					   since it is returning array 
					   so we can not sirectly call it
					   or else it will return the base address of the array
				   !   System.out.println(Solution(arr,target)-----> will return the base address
				   
				  */
		   
           System.out.println(Arrays.toString(Solution(arr,target)));
	}







}
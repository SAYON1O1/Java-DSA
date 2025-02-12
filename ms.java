import java.util.Scanner;

public class ms {

    public static void mergesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si+ (ei-si)/2;
        //left division
        mergesort(arr, si, mid);
        //right division
        mergesort(arr, mid+1, ei);

        merge(arr, si, ei, mid);

    }

    public static void merge(int arr[], int si, int ei, int mid){

        int temp [] = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

       while(i<=mid && j<=ei){

            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
       }

       while(i<=mid){
        temp[k++] = arr[i++];
       }
       while(j<=ei){
        temp[k++]= arr[j++];
       }

       for (k = 0; k < temp.length; k++) {
        arr[si + k] = temp[k];
    }

    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array");
            for (int i = 0; i < arr.length; i++) {

                arr[i]=sc.nextInt();
                
            }

        mergesort(arr,0,arr.length-1);

        System.out.println("Sorted Array using bubble bhai:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
     }
    
}

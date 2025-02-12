import java.util.Scanner;

public class QS {
    public static void quicksort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }

        int pidx=partition(arr,si,ei); // returns index of pivot  
        quicksort(arr, si, pidx-1);//left
        quicksort(arr,  pidx+1, ei);//right

    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];//choose pivot as last element
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array");
            for (int i = 0; i < arr.length; i++) {

                arr[i]=sc.nextInt();
                
            }

            quicksort(arr,0,arr.length-1);

            System.out.println("Sorted Array using bubble bhai:");
            //printing using for each loop
            for (int i : arr) {
                System.out.print(i + " ");
            }
 
    }
}

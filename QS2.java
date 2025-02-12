import java.util.Scanner;

public class QS2 {

    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei); // returns index of pivot  
        quicksort(arr, si, pidx - 1); // left subarray
        quicksort(arr, pidx + 1, ei); // right subarray
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // choose pivot as the last element
        int i = si - 1; // pointer for the smaller element

        // Traverse the array and swap elements as needed
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++; // Increment the smaller element pointer
                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Move the pivot to its correct position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i; // Return the pivot index
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5]; // Array size
        System.out.println("Enter the array elements:");

        // Taking input for the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling quicksort
        quicksort(arr, 0, arr.length - 1);

        // Printing sorted array
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

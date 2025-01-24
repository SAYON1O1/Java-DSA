import java.util.*;

class ggg {
    public static int[] Solution(int arr[], int target) {
        for (int i = 0; i < (arr.length) - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j}; // Return indices
                }
            }
        }
        return new int[]{}; // Return empty array if no solution found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input prompts
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the solution function and print the result
        int[] result = Solution(arr, target);
        if (result.length == 0) {
            System.out.println("No two indices found that sum up to the target.");
        } else {
            System.out.println("Indices: " + Arrays.toString(result));
        }
    }
}
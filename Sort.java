import java.util.*;
class Sort{
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
        //! same as temp[k]=arr[i];
        //!          k++; 
        //!          i++;
        temp[k++] = arr[i++];
       }
       while(j<=ei){
        temp[k++]= arr[j++];
       }

       for (k = 0; k < temp.length; k++) {
        arr[si + k] = temp[k];
    }

    }
    public static void selection(int arr[]){
        for(int i=0; i < arr.length; i++){
            int maxid=i;
          for(int j=i+1;j<arr.length;j++){
             if(arr[j]>arr[maxid]){//desending case
                maxid=j;
             }
             int temp = arr[i];
             arr[i] = arr[maxid];
             arr[maxid]=temp;

          }
        }
    }
    public static void insertion(int arr[]){

        for(int i=1;i<arr.length;i++){
            int curr = arr[i] ;
            int prev = i-1;
            while( prev>=0 && arr[prev]>curr){
                    arr[prev+1]=arr[prev];
                    prev--;
            }
            arr[prev+1]= curr;

        }
    }


    public static void bubble(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1; j<arr.length; j++){

                if(arr[i]<arr[j]){//decending case
                    int temp = arr [i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
            
        }
    }

    public static void countsort(int arr[]){

        int maxele =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxele){
                maxele=arr[i];
            }
        }

        int count[] = new int[maxele+1]; 
        // maxele + 1 (size because of index out of bound error)

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++; // increasing frequency
        }

        for(int i=maxele;i>=0;i--){
            int frequency = count[i];

            while(frequency>0){
                System.out.println(i);
                    frequency--;
            }

        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the array");
            for (int i = 0; i < arr.length; i++) {

                arr[i]=sc.nextInt();
                
            }
 

        // System.out.println("bubble sort");
        
        // bubble(arr);
        // for (int i = 0; i < arr.length; i++) {
        //     System.err.println(arr[i]);        
            
        // }
        
        
        // System.out.println("selection sort");
        //  selection(arr);
        //  for (int i = 0; i < arr.length; i++) {
            //     System.err.println(arr[i]);        
            
            // }


            
        //     System.out.println("insertion sort");
        //     insertion(arr);

        // for (int i = 0; i < arr.length; i++) {
        //         System.err.println(arr[i]);        
                
        // }

        
            //  System.out.println("count sort");
            // countsort(arr);

        mergesort(arr,0,arr.length-1);

        System.out.println("Sorted Array using bubble bhai:");
        //printing using for each loop
        for (int i : arr) {
            System.out.print(i + " ");
        }


        




    

        
    }
}
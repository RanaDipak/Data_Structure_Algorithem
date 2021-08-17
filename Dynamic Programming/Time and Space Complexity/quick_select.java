import java.io.*;
public class quick_select {
    public static int quickSelect(int arr[], int lo, int hi, int k){
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi); 
        if(k > pi){
            return quickSelect(arr, pi + 1, hi, k);
        }else if(k < pi){
            return quickSelect(arr, lo, pi - 1, k);
        }else{
            return pivot;
        }
    }
    public static int partition(int arr[], int pivot, int lo, int hi){
        int i = lo, j = lo;
        while(i <= hi){
            if(arr[i] <= pivot){
                swap(arr, i, j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j - 1;
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(isSmaller(arr, j + 1, j)){
                    swap(arr, j + 1, j);
                }else{
                    break;
                }
            }
        }
    }
    public static boolean isSmaller(int arr[], int i, int j){
        if(arr[i] < arr[j]){
            return true;
        }else{
            return false;
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size : ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        System.out.println("Enter data : ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }   
        System.out.println("Enter k value: ");
        int k = Integer.parseInt(br.readLine());
        System.out.println(quickSelect(arr, 0, arr.length - 1, k - 1));
        insertionSort(arr);
        print(arr);
    }
}

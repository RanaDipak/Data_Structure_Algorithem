import java.io.*;
public class quick_sort {
    public static void quickSort(int arr[], int lo, int hi){
        if(lo > hi){
            return;
        }
        int pivot = arr[hi];
        int index = partition(arr, pivot, lo, hi);
        quickSort(arr, lo, index - 1);
        quickSort(arr, index + 1, hi);
    }
    public static int partition(int arr[], int pivot, int lo, int hi){
        int i = lo, j = lo;
        while(i <= hi){
            if(arr[i] <= pivot){
                swap(arr, i , j);
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
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        quickSort(arr, 0, arr.length - 1);
        print(arr);
    }
}

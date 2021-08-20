import java.io.*;
public class Radix_Sort {
    public static void radixSort(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val > max){
                max = val;
            }
        }
        int exp = 1;
        while(exp <= max){
            countSort(arr, exp);
            exp = exp * 10;
        }
    }
    public static void countSort(int arr[], int exp){
        int ans[] = new int[arr.length];
        int farr[] = new int[10];
        for(int i = 0; i < arr.length; i++){
            farr[arr[i] / exp % 10]++;
        }
        for(int i = 1; i < farr.length; i++){
            farr[i] += farr[i - 1] ;
        }
        for(int i = arr.length - 1; i >= 0; i--){
            int pos = farr[arr[i] / exp % 10] - 1;
            ans[pos] = arr[i];
            farr[arr[i] / exp % 10]--;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
        System.out.print("After Sorting on "+ exp + " place -> ");
        print(arr);
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of Array : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter data : ");
        int arr[] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        radixSort(arr);
        print(arr);
    }
}

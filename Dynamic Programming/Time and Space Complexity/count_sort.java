import java.io.*;
public class count_sort{
    public static void countSort(int arr[], int min, int max){
        int range = max - min + 1;
        int farr[] = new int[range];
        for(int i = 0; i < arr.length; i++){
            int idx = arr[i] - min;
            farr[idx]++;
        }
        for(int i = 1; i < farr.length; i++){
            farr[i] = farr[i] + farr[i - 1];
        }
        int ans[] = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
        // for(int i = 0; i < arr.length; i++){
            int val = arr[i];
            int pos = farr[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            farr[val - min]--;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size of Array : ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter data : ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        print(arr);
    }
}
import java.io.*;

public class Max_Of_An_Array {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many number are enter in the array : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter the elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = maxArray(arr, 0);
        System.out.println("Max elements is : "+ max);
    }

    public static int maxArray(int arr[], int idx) {
        if (idx == arr.length - 1){
            return arr[idx];
        }
        int misa = maxArray(arr, idx + 1);
        if(misa > arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}
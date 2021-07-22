import java.io.*;

public class Display_Array {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many number are enter in the array : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter the elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        displayArray(arr, 0);
    }

    public static void displayArray(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println("The " + idx + " elements is : " + arr[idx]);
        displayArray(arr, idx + 1);
    }
}
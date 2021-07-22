import java.io.*;

public class Display_Array_Inverse {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many number are enter in the reverse array : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter the elements : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        displayArrayReavrse(arr, 0);
    }

    public static void displayArrayReavrse(int arr[], int idx) {
        if (idx == arr.length) {
            return;
        }
        displayArrayReavrse(arr, idx + 1);
        System.out.println("The " + idx + " elements is : " + arr[idx]);
    }
}
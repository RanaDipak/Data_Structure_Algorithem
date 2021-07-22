import java.io.*;

public class Last_Index {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your number : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter value in Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter value to find the last idex : ");
        int x = Integer.parseInt(br.readLine());
        int lIndex = lastIndex(arr, arr.length - 1, x);
        System.out.println(lIndex);
    }

    public static int lastIndex(int arr[], int idx, int x) {
        if (idx == 0) {
            return -1;
        }
        int liisma = lastIndex(arr, idx - 1, x);
        if (arr[idx] == x) {
            return idx;
        } else {
            return liisma;
        }
    }
}
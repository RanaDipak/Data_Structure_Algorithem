import java.io.*;

public class First_Index {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your number : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter value in Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter value to find the first idex : ");
        int x = Integer.parseInt(br.readLine());
        int findex = firstIndex(arr, 0, x);
        System.out.println(findex);
    }

    public static int firstIndex(int arr[], int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == x) {
            return idx;
        } else {
            int misa = firstIndex(arr, idx + 1, x);
            return misa;
        }
    }
}
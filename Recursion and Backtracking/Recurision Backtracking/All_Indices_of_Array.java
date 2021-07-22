import java.io.*;

public class All_Indices_of_Array {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your number : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter value in Array : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter value to find the idex : ");
        int x = Integer.parseInt(br.readLine());
        int aiia[] = allIndicesOfArray(arr, x, 0, 0);
        if (aiia.length == 0) {
            System.out.println("Your value is not available in this array.");
            return;
        }
        for (int i = 0; i < aiia.length; i++) {
            System.out.println(aiia[i]);
        }
    }

    public static int[] allIndicesOfArray(int arr[], int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == x) {
            int aiisa[] = allIndicesOfArray(arr, x, idx + 1, fsf + 1);
            aiisa[fsf] = idx;
            return aiisa;
        } else {
            int aiisa[] = allIndicesOfArray(arr, x, idx + 1, fsf);
            return aiisa;
        }
    }
}
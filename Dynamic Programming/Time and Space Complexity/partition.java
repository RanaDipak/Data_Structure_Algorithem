import java.io.*;

public class partition {
    public static void partition(int arr[], int pivot) {
        // 0 to j - 1 -> <= pivot
        // j to i - 1 -> > pivot
        // i to end -> unknow
        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter array size : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter data : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter number : ");
        int p = Integer.parseInt(br.readLine());
        partition(arr, p);
        print(arr);
    }
}

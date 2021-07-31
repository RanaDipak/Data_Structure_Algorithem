import java.io.*;

public class merge_two_sorted_array {
    public static int[] mergeTwoSortedArray(int a[], int b[]) {
        int res[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (isSmaller(arr, j + 1, j)) {
                    swap(arr, j + 1, j);
                } else {
                    break;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (isSmaller(arr, j, min)) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (isSmaller(arr, j + 1, j)) {
                    swap(arr, j + 1, j);
                }
            }
        }
    }

    public static boolean isSmaller(int arr[], int i, int j) {
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter how many print array for n : ");
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        System.out.println("Enter value: ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter how many print array for m : ");
        int m = Integer.parseInt(br.readLine());
        int b[] = new int[m];
        System.out.println("Enter value: ");
        for (int j = 0; j < m; j++) {
            b[j] = Integer.parseInt(br.readLine());
        }
        // bubbleSort(a);
        // bubbleSort(b);
        selectionSort(a);
        insertionSort(b);
        System.out.println("Merge Two sorted Array is : ");
        int merge[] = mergeTwoSortedArray(a, b);
        print(merge);
    }
}

import java.io.*;

public class Merge_sort {
    public static int[] mergeSort(int arr[], int lo, int hi) {
        if (lo == hi) {
            int ba[] = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = (lo + hi) / 2;
        int fsh[] = mergeSort(arr, lo, mid);
        int ssh[] = mergeSort(arr, mid + 1, hi);
        int fsa[] = mergeTwoSortedArray(fsh, ssh);
        return fsa;
    }

    public static int[] mergeTwoSortedArray(int a[], int b[]) {
        System.out.println();
        System.out.println("Mergin This two Arrays");
        System.out.println();
        System.out.println("Left Array -> ");
        print(a);
        System.out.println();
        System.out.println("Rigth Array -> ");
        print(b);
        System.out.println();
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
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int merge[] = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array -> ");
        System.out.println();
        print(merge);
    }
}

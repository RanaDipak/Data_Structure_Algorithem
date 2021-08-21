import java.util.*;
public class Sort_Date {
    public static void SortDate(String arr[]){
        countSort(arr, 1000000, 100, 32);
        countSort(arr, 10000, 100, 13);
        countSort(arr, 1, 10000, 2501);
    }
    public static void countSort(String arr[], int div, int mod, int range){
        String ans[] = new String[arr.length];
        int farr[] = new int[range];
        for(int i = 0; i < arr.length; i++){
            farr[Integer.parseInt(arr[i], 10) / div % mod]++;
        }
        for(int i = 1; i < farr.length; i++){
            farr[i] += farr[i - 1];
        }
        for(int i = arr.length - 1; i >= 0; i--){
            int pos = farr[Integer.parseInt(arr[i], 10) / div % mod] - 1;
            ans[pos] = arr[i];
            farr[Integer.parseInt(arr[i], 10) / div % mod]--;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
    }
    public static void print(String arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array  : ");
        int n = sc.nextInt();
        System.out.println("Enter Data : ");
        String arr[] = new String[n];
        for(int i = 0; i < n; i++){
            String str = sc.next();
            arr[i] = str;
        }
        SortDate(arr);
        print(arr);
    }
}

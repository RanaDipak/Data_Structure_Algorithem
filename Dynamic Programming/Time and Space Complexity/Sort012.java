import java.util.*;
public class Sort012 {  
    static void Sort_012(int arr[]){
        int j = 0; //0 to j - 1 -> 0
        int i = 0; //j to i - 1 -> 1
        int k = arr.length - 1; //k + 1 to end -> 2
        // i to k -> unknow
        while(i <= k){
            if(arr[i] == 0){
                swap(arr, i, j);
                i++; j++;
            }else if(arr[
                i] == 1){
                i++;
            }else{
                swap(arr, i, k);
                k--;
            }
        }
    }
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter data : ");
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Sort_012(arr);
        print(arr);
    }
}

import java.util.*;
public class Target_Sum_Pair {
    public static void targetSumPair(int arr[], int target){
        Arrays.sort(arr);
        int li = 0;
        int ri = arr.length - 1;
        while(li < ri){
            if(arr[li] + arr[ri] < target){
                li++;
            }else if(arr[li] + arr[ri] > target){
                ri--;
            }else{
                System.out.println(arr[li] + "," + arr[ri]);
                li++;
                ri--;
            }
        }
    }
    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter data : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target number : ");
        int target = sc.nextInt();
        print(arr);
        System.out.println();
        targetSumPair(arr, target);
    }
}

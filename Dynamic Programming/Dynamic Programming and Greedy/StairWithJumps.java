import java.util.*;
public class StairWithJumps {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter data : ");
        int arr[] = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[n + 1];
        dp[n] = 1;
        for(int i = n - 1; i >= 0; i--){
            for(int j = 1; j <= arr[i] && i + j < dp.length; j++){
                dp[i] += dp[i + j];
            }
        }
        System.out.print("Ans is : "+dp[0]);
    }
}

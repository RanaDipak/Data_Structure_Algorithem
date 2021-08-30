import java.util.*;
public class Coin_Change_Combination {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("How many coin take : ");
        int n = sc.nextInt();
        System.out.println("Enter Coin : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter amount : ");
        int amt = sc.nextInt();
        int dp[] = new int[amt + 1];
        dp[0] = 1;
        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i]; j < dp.length; j++){
                dp[j] += dp[j - arr[i]];
            }
        }
        System.out.println("Amount is : "+dp[amt]);
    }
}

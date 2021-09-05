import java.util.*;
public class _0_1_knapsack {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int val[] = new int[n];
        int wts[] = new int[n];
        for(int i = 0; i < n; i++){
            val[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            wts[i] = sc.nextInt();
        }
        int cap = sc.nextInt();
        int dp[][] = new int[n + 1][cap + 1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(j >= wts[i - 1]){
                    int rCap = j - wts[i - 1];
                    if(dp[i - 1][rCap] + val[i - 1] > dp[i - 1][j]){
                        dp[i][j] = dp[i - 1][rCap];
                    }else{
                        dp[i][j] = dp[i - 1][j];
                    }
                }else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n][cap]);
    }
}

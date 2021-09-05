import java.util.*;

public class unbounded_knapsack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val[] = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        int wts[] = new int[n];
        for (int i = 0; i < n; i++) {
            wts[i] = sc.nextInt();
        }
        int cap = sc.nextInt();
        int dp[] = new int[cap + 1];
        dp[0] = 0;
        for (int i = 1; i <= cap; i++) {
            int max = 0;
            for (int j = 0; j < n; j++) {
                if (wts[j] <= i) {
                    int rCap = i - wts[j];
                    int rval = dp[rCap];
                    int tval = rval + val[j];
                    if (tval > max) {
                        max = tval;
                    }
                }
            }
            dp[i] = max;
        }
        System.out.print(dp[cap]);
    }
}

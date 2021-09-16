import java.util.Scanner;

public class Tiling_with_M_X_1_Tiling_Dynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value N : ");
        int n = sc.nextInt();
        System.out.print("Enter value M : ");
        int m = sc.nextInt();
        int dp[] = new int[n + 1];
        for(int i = 1; i <= n; i++){
            if(i < m){
                dp[i] = 1;
            }else if(i == m){
                dp[i] = 2;
            }else{
                dp[i] = dp[i - 1] + dp[i - m];
            }
        }
        System.out.println(dp[n]);
        sc.close();
    }
}

import java.util.*;
public class Min_Cost_Maze_Travel {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N size of Array : ");
        int n = sc.nextInt();
        System.out.print("Enter M size of Array : ");
        int m = sc.nextInt();
        System.out.println("Enter Data : ");
        int arr[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int dp[][] = new int[n][m];
        for(int i = n - 1; i >= 0; i--){
            for(int j = m - 1; j >= 0; j--){
                if(i == n - 1 && j == m - 1){
                    dp[i][j] = arr[i][j];
                }else if(i == n - 1){
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                }else if(j == m - 1){
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) + arr[i][j];
                }
            }
        }
        System.out.print(dp[0][0]);
    }
}

import java.util.*;
public class Coin_Change_Permutation {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        int dp[] = new int[tar + 1];
        dp[0] = 1;
        for(int i = 1; i < tar + 1; i++){
            for(int coin : arr){
                if(coin <= i){
                    int ramt = i - coin;
                    dp[i] += dp[ramt];  
                }
            }
        }
        System.out.println(dp[tar]);
    }   
}

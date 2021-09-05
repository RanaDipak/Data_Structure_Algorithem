import java.util.*;
public class Count_Binary_String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // using Array method use 
        int dp0[] = new int[n + 1];
        int dp1[] = new int[n + 1];
        dp0[1] = 1;
        dp1[1] = 1;
        for(int i = 2; i <= n; i++){
            dp1[i] = dp1[i - 1] + dp0[i - 1];
            dp0[i] = dp1[i - 1];
        }
        System.out.println("Using Array : "+dp0[n] + dp1[n]);
        // Not using Array Method
        int oc0 = 1;
        int oc1 = 1;
        for(int i = 2; i <= n; i++){
            int nc1 = oc0 + oc1;
            int nc0 = oc1;
            oc0 = nc0;
            oc1 = nc1;
        }
        System.out.println("Without Array : "+oc0 + oc1);
    }
}

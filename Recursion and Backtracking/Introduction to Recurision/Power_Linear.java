// This is Power Linear program 
import java.io.*;

public class Power_Linear {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value : ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter the power : ");
        int n = Integer.parseInt(br.readLine());
        int p = power(n, x);
        System.out.println(p);
    }

    public static int power(int n, int x) {
        if (n == 0) {
            return 1;
        }
        int xpm1 = power(n - 1, x);
        int xpn = xpm1 * x;
        return xpn;
    }
}
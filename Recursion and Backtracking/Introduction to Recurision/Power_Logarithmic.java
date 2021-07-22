import java.io.*;

public class Power_Logarithmic {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value : ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Enter the power : ");
        int n = Integer.parseInt(br.readLine());
        int p = power_logarithmic(x, n);
        System.out.println(p);
    }

    public static int power_logarithmic(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int xpnb2 = power_logarithmic(x, n / 2);
        int xpn = xpnb2 * xpnb2;
        if (n % 2 == 1) {
            xpn = xpn * x;
        }
        return xpn;
    }
}
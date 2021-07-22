import java.io.*;

public class Print_Zigzag {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number to print Zigzag Form : ");
        int n = Integer.parseInt(br.readLine());
        zigzag(n);
        System.out.println();
    }

    public static void zigzag(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        zigzag(n - 1);
        System.out.print(n + " ");
        zigzag(n - 1);
        System.out.print(n + " ");
    }
}
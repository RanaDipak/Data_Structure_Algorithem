// This is my factorial program
import java.io.*;
public class Factorial {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write digit and find to Factorial Number : ");
        int n = Integer.parseInt(br.readLine());
        int fact = Print_Factorial(n);
        System.out.println(fact);
    }

    public static int Print_Factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int fn1 = n * Print_Factorial(n - 1);
        return fn1;
    }
}
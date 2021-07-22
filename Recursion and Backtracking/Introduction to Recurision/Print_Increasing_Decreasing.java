import java.io.*;

public class Print_Increasing_Decreasing {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many number are print Increasing and Decreasing order : ");
        int n = Integer.parseInt(br.readLine());
        printIncreasingDecreasing(n);
        System.out.println();
    }

    public static void printIncreasingDecreasing(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printIncreasingDecreasing(n - 1);
        System.out.print(n + " ");
    }
}
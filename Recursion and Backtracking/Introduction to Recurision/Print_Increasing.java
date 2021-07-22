import java.io.*;

public class Print_Increasing {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many number are print in Increasing Order : ");
        int n = Integer.parseInt(br.readLine());
        printIncreasing(n);
        System.out.println();
    }

    public static void printIncreasing(int n) {
        if (n == 0)
            return;
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }
}
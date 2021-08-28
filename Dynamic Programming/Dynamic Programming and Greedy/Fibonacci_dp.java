import java.util.*;
public class Fibonacci_dp{
    public static int fibDp(int n, int qb[]){
        if(n == 0 || n == 1){
            return n;
        }
        if(qb[n] != 0){
            return qb[n];
        }
        System.out.print( n+" -> ");
        int fibdp1 = fibDp(n - 1, qb);
        int fibdp2 = fibDp(n - 2, qb);
        int fibdp = fibdp1 + fibdp2;
        qb[n] = fibdp;
        return fibdp;
        
    }
    // This is method not good beacuse single value multiple time use so time increase
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        System.out.print(" hello " + n);
        int fib1 = fib(n - 1);
        int fib2 = fib(n - 2);
        int fibtotal = fib1 + fib2;
        return fibtotal;
    }
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data : ");
        int n = sc.nextInt();
        // int ans = fib(n);
        int ans = fibDp(n, new int[n + 1]);
        System.out.print( 1+" -> ");
        System.out.print( 0);
        System.out.println("\n"+ans);
    }
}
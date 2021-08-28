import java.time.*;
import java.util.*;
public class Climbing_Stair {
    // this is establishment method 
    public static int climbStairWithTabulation(int n){
        int qb[] = new int[n + 1];
        qb[0] = 1;
        for(int i = 1; i <= n; i++){
            if(i == 1){
                qb[i] = qb[i - 1];
                System.out.print(qb[i]);
            }else if(i == 2){
                qb[i] = qb[i - 1]+ qb[i - 2];
                System.out.print(qb[i]);
            }else{
                qb[i] = qb[i - 1]+ qb[i - 2] + qb[i - 3];
                System.out.print(qb[i]);
            }
        }
        return qb[n];
    }
    // this is memorization method 
    public static int climbStairWithMemorization(int n, int qb[]){
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }
        if(qb[n] > 0){
            return qb[n];
        }
        System.out.print(n+" ");
        int nm1 = climbStairWithMemorization(n - 1, qb);
        int nm2 = climbStairWithMemorization(n - 2, qb);
        int nm3 = climbStairWithMemorization(n - 3, qb);
        int sum = nm1 + nm2 + nm3;
        qb[n] = sum;
        return sum;

    }
    // this method is not usefull because one value multiple time arriving that why not use.
    public static int climbStair(int n){
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }
        System.out.print(n+" ");
        int nm1 = climbStair(n - 1);
        int nm2 = climbStair(n - 2);
        int nm3 = climbStair(n - 3);
        int sum = nm1 + nm2 + nm3;
        return sum;
    }
    public static void main(String args[])throws Exception{
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter size of Stair : ");
        int n = sc.nextInt();

        Instant start = Instant.now();
        int cs = climbStair(n);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed.toMillis());

        // find to Complexity climbstair
        // long startTime = System.currentTimeMillis();
        // int cs = climbStair(n);
        // long endTime = System.currentTimeMillis() - startTime;
        // System.out.println("\n"+(endTime) / 1000 + " ms");
        System.out.println("Simple ClimbStair Path using recursion method : "+cs);

        // find to complexity and using memorization method
        long startTime1 = System.currentTimeMillis();
        int cs1 = climbStairWithMemorization(n, new int[n + 1]);
        long endTime1 = System.currentTimeMillis() - startTime1;
        System.out.println("\n"+(endTime1) / 1000 + " ms");
        System.out.println("Memorization using recursion method : "+cs1);
        
        // find to complexity and using to establishment method
        long startTime2 = System.currentTimeMillis();
        int cs2 = climbStairWithTabulation(n);
        long endTime2 = System.currentTimeMillis() - startTime2;
        System.out.println("\n"+(endTime2) / 1000 + " ms");
        System.out.println("Tabulation using iterative method : "+cs2);
    }
}

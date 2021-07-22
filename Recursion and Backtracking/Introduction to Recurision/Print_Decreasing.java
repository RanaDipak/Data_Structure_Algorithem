// This program is print to Decreasing order
import java.util.*;
public class Print_Decreasing{
    public static void main(String arsgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number are print in Decreasing Order : ");
        int n = sc.nextInt();
        printDecreasing(n);
    }
    public static void printDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }
}
import java.util.*;
public class Arrange_Building {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        long n = sc.nextInt();
        long ob = 1;//old building
        long os = 1;//old space
        for(int i = 2; i <= n; i++ ){
            long nb = os;
            long ns = os + ob;
            os = ns;
            ob = nb;
        }
        long sum = os + ob;
        sum = sum * sum;
        System.out.print(sum);
    }
}

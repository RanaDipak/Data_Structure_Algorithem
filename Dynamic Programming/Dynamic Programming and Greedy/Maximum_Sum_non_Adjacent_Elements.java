import java.util.Scanner;

public class Maximum_Sum_non_Adjacent_Elements {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the value : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int inc = arr[0];
        int exc = 0;
        for(int i = 1; i < n; i++){
            int ninc = exc + arr[i];
            int nexc = Math.max(inc, exc);
            inc = ninc;
            exc = nexc;
        }
        int ans = Math.max(inc, exc);
        System.out.println("Your ans is  : "+ans);
        sc.close();
    }
}

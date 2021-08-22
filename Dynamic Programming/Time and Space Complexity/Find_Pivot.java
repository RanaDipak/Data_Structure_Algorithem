import java.util.*;
public class Find_Pivot {
    public static int findPivot(int arr[]){
        int lo = 0; 
        int hi = arr.length - 1;
        while(lo < hi){
            int mid = (lo + hi) / 2;
            if(arr[mid] < arr[hi]){
                hi = mid;
            }else{
                lo = mid + 1;
            }
        }
        return arr[hi];
    }
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        System.out.println("Enter Data : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findPivot(arr);
        System.out.println("Pivot value is : "+ans);
    }
}

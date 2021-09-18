import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stock_Span {
    public static void display(int arr[]) {
        StringBuilder sb = new StringBuilder();
        for (int val : arr) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static int[] solve(int arr[]) {
        int span[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of Array : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter Data : ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int span[] = solve(arr);
        display(span);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Largest_Area_Histogram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Size of Array : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter Data : ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int rb[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }

        int lb[] = new int[arr.length];
        st = new Stack<>();
        st.push(0);
        lb[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println(maxArea);
    }
}

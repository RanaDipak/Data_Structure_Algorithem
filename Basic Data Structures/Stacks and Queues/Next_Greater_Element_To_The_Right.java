import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Next_Greater_Element_To_The_Right {
    public static void dispaly(int arr[]){
        StringBuilder sb = new StringBuilder();
        for(int val : arr){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
    // This is solve to the index put in this stack
    public static int [] solveIndex(int arr[]){
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i = 1; i < arr.length; i++){
            while(st.size() > 0 && arr[i] >= arr[st.peek()]){
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }
    // This is solve to the value put in this stack 
    public static int[] solve(int arr[]){
        int nge[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        nge[arr.length - 1] = -1;
        st.push(arr[arr.length - 1]);
        for(int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size() > 0){
                nge[i] = st.peek();
            }else{
                nge[i] = -1;
            }
            st.push(arr[i]);
        }
        return nge;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size of array  : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter data : ");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        // int nge[] = solve(arr);
        int nge[] = solveIndex(arr);
        dispaly(nge);
    }
}

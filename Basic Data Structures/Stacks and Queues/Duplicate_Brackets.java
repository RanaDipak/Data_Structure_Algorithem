import java.io.*;
import java.util.*;
public class Duplicate_Brackets{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter function like (a + b) : ");
        String str = br.readLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
               if(st.peek() == '(') {
                   System.out.println(true);
                    return;
               }else{
                   while(st.peek() != '('){
                       st.pop();
                   }
                   st.pop();
               }
            }else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
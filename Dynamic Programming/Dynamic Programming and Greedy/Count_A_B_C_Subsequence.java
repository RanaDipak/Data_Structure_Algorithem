import java.util.*;
public class Count_A_B_C_Subsequence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = 0;
        int ab = 0;
        int abc = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'){
                a = 2 * a + 1;
            }else if(ch == 'b'){
                ab = 2 * ab + 1;
            }else if(ch == 'c'){
                abc = 2 * abc + 1;
            }
        }
        System.out.println(abc);
    }
}

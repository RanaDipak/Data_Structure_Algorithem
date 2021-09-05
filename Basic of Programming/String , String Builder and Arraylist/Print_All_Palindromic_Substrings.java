import java.util.*;
public class Print_All_Palindromic_Substrings{
    public static boolean isPalindrom(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 != ch2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void solution(String str) {
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                String ss = str.substring(i, j);
                if(isPalindrom(ss) == true){
                    System.out.print(ss + ",");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        System.out.println("Palindrom : ");
        solution(str);
        sc.close();
    }
}
import java.util.Scanner;

public class Toggle_Case_of_Character {
    public static String toggleCharacter(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < str.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char uch = (char)('A' + ch -'a');
                sb.setCharAt(i, uch);
            }else if(ch >= 'A' && ch <= 'Z'){
                char lch = (char)('a' + ch - 'A');
                sb.setCharAt(i, lch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println(toggleCharacter(str));
        sc.close();
    }
}

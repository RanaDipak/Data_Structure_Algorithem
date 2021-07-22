import java.io.*;
import java.util.*;

public class Get_kpc {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String : ");
        String str = br.readLine();
        ArrayList<String> words = getkpc(str);
        System.out.println(words);
    }

    static String codes[] = { ".,", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    static ArrayList<String> getkpc(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char c = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getkpc(ros);
        ArrayList<String> myres = new ArrayList<>();
        String code = codes[c - '0'];
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            for (String rstr : rres) {
                myres.add(ch + rstr);
            }
        }
        return myres;
    }
}
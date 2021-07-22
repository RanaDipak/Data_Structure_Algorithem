import java.io.*;
import java.util.*;
public class Get_Subsequence{
    public static void main(String args[])throws Exception{
        // Scanner sc = new Scanner(System.in);
        // String st = sc.next();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your String and Get SubSequence : ");           
        String str = br.readLine();
        ArrayList <String> res = gss(str);
        System.out.println(res);
    }   
    public static ArrayList<String> gss (String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);
        ArrayList<String> mres = new ArrayList<>();
        for (String st : rres){
            mres.add(" "+ st);
            mres.add(ch + st);
        }
        return mres;
    }
}
import java.io.*;
import java.util.*;
public class Get_Stair_Paths{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number : ");
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> paths = getStairPaths(n);
        System.out.println("Your getStairPath is :"+paths);
    }
    public static ArrayList<String> getStairPaths(int n){
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();
        for (String path : path1){
            paths.add(path + 1);
        }
        for (String path : path2){
            paths.add(path + 2);
        }
        for (String path : path3){
            paths.add(path + 3);
        }
        return paths;
    }
}
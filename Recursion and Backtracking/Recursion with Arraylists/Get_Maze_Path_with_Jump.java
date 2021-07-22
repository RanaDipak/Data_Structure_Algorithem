import java.util.*;
import java.io.*;
public class Get_Maze_Path_with_Jump {
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the n value : ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter the m value : ");
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> paths = getMazePathWithJump(0, 0, n, m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePathWithJump(int sr, int sc, int dr, int dc){
        if(sc == dc && sr == dr){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        for (int ms = 1; ms <= dc - sc; ms++){
            ArrayList<String> hpaths = getMazePathWithJump(sr, sc + ms, dr, dc);
            for(String hpath : hpaths){
                paths.add("H" + ms + hpath);
            }
        }
        for(int ms = 1; ms <= dr -sr; ms++){
            ArrayList<String> vpaths = getMazePathWithJump(sr + ms, sc, dr, dc);
            for(String vpath : vpaths){
                paths.add("V" + ms + vpath);
            }
        }
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++){
            ArrayList<String> dpaths = getMazePathWithJump(sr + ms, sc + ms, dr, dc);
            for(String dpath : dpaths){
                paths.add("D" + ms + dpath);
            }
        }
        return paths;
    }
}

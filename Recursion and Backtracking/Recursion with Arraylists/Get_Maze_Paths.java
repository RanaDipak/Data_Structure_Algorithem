import java.util.*;
import java.io.*;
class Get_Maze_Paths{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n value : ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Enter m value : ");
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();
        if(sc < dc){
            hpath = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr < dr){
            vpath = getMazePaths(sr + 1, sc, dr, dc);
        }
        ArrayList<String> paths = new ArrayList<>();
        for (String path : hpath){
            paths.add('H' + path);
        }
        for(String path : vpath){
            paths.add('V' + path);
        }
        return paths;
    }
}
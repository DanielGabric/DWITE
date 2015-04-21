import java.io.*;
import java.util.*;
public class Tattarrattat {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;++i){
            String str = s.nextLine();
            int length[][]=new int[str.length()+1][str.length()+1];
            for(int x=1;x<=str.length();++x)
                for(int y=1;y<=str.length();++y)
                    if(str.charAt(x-1)==str.charAt(str.length()-y)) 
                        length[x][y]=length[x-1][y-1]+1;
                    else 
                        length[x][y]=Math.max(length[x-1][y],length[x][y-1]);
            System.out.println(length[str.length()][str.length()]);
        }
    }
}
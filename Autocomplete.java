import java.io.*;
import java.util.*;
public class Autocomplete {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        String[] dictionary = new String[50000];
        for(int i=0;i<50000;++i){
            int x=i,sum=0;
            while(x>0){
                sum+=x%10;
                x/=10;
            }
            dictionary[i]=((sum*i)%99999)+"";
        }
        for(int sdf=0;sdf<5;++sdf){
            String str = s.nextLine();
            int count =0;
            for(int i=0;i<50000;++i){
                if(str.length()>dictionary[i].length())continue;
                if(str.equals(dictionary[i].substring(0,str.length())))count++;
            }
            System.out.println(count);
        }
    }
}
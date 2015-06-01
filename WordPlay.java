import java.io.*;
import java.util.*;
public class WordPlay{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        for(int asdf=0;asdf<5;++asdf){
            String str = s.nextLine();
            boolean isGood = true;
            out:while(true){
                if(str.isEmpty()){
                    System.out.print("S");
                    break;
                }else if(!isGood){
                    System.out.print("U");
                    break;
                }
                isGood = false;
                for(int i=0;i<str.length();++i){
                    int j;
                    for(j=i+1;j<str.length();++j)
                        if(str.charAt(i)!=str.charAt(j))break;
                    if(j-i>1){
                        isGood = true;
                        str = str.substring(0,i)+str.substring(j);
                        continue out;
                    }
                }
            }
        }
        System.out.println();
    }
} 
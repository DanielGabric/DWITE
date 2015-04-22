import java.io.*;
import java.util.*;
public class RomanNumeral{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int[]roman = new int[300];
        roman['I']=1;
        roman['V']=5;
        roman['X']=10;
        roman['L']=50;
        roman['C']=100;
        roman['D']=500;
        roman['M']=1000;
        for(int m=0;m<5;++m){
            String str = s.nextLine().trim();
            int sum=0;
            for(int i=0;i<str.length();++i){
                sum += roman[str.charAt(i)];
            }
            for(int i=0;i<str.length()-1;++i){
                if(roman[str.charAt(i)]<roman[str.charAt(i+1)])sum-=2*roman[str.charAt(i)];
            }
            System.out.println(sum);
        }
    }
}
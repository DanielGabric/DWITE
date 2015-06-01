import java.io.*;
import java.util.*;
public class AllIsBalanced {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        out:for(int i=0;i<5;++i) {
            int curl = 0,square=0,paran=0;
            String str = s.nextLine().trim();
            for(int j=0;j<str.length();++j){
                char c = str.charAt(j);
                if(curl <0 || square < 0|| paran < 0){
                    System.out.println("not balanced");
                    continue out;
                }
                if(c=='(')paran++;
                else if(c==')')paran--;
                else if(c=='{')curl++;
                else if(c=='}')curl--;
                else if(c=='[')square++;
                else if(c==']')square--;
            }
            if(square==0&&curl==0&&paran==0)System.out.println("balanced");
            else System.out.println("not balanced");
        }
    }
} 
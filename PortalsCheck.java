import java.io.*;
import java.util.*;
public class PortalsCheck {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = Integer.parseInt(s.nextLine());
            boolean map[][]=new boolean[n][n];
            int index=0;
            Map <String, Integer> map1 = new TreeMap<String, Integer>();
            for(int i=0;i<n;++i){
                String text[] = s.nextLine().split(" ");
                if(!map1.containsKey(text[1])){
                    if(text[0].equals("q")){
                        System.out.println("not connected");
                        continue;
                    }
                    map1.put(text[1],index);
                    index++;
                }
                if(!map1.containsKey(text[2])){
                    if(text[0].equals("q")){
                        System.out.println("not connected");
                        continue;
                    }
                    map1.put(text[2],index);
                    index++;
                }
                if(text[0].charAt(0)=='p'){
                    map[map1.get(text[1])][map1.get(text[2])]=map[map1.get(text[2])][map1.get(text[1])]=true;
                }else{
                    if(isConnected(map,map1.get(text[1]),map1.get(text[2]),n)){
                        System.out.println("connected");
                    }else{
                        System.out.println("not connected");
                    }
                }
            }
        }
    }
    public static boolean isConnected(boolean [][]map, int start, int end, int tot){
        Queue <Integer> queue = new LinkedList<Integer>();
        boolean alreadySeen[]=new boolean[tot];
        queue.add(start);
        while(!queue.isEmpty()){
            int s = queue.poll();
            if(s==end)return true;
            if(alreadySeen[s])continue;
            alreadySeen[s]=true;
            for(int i=0;i<tot;++i){
                if(map[s][i])queue.add(i);
            }
        }
        return false;
    }
}

import java.io.*;
import java.util.*;
public class RunningInCircles {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            boolean map[][]=new boolean[101][101];
            int n = Integer.parseInt(s.nextLine().trim());
            ArrayList<Integer>points = new ArrayList<Integer>();
            for(int i=0;i<n;++i){
                String text[] = s.nextLine().split(" ");
                int one = Integer.parseInt(text[0]);
                int two = Integer.parseInt(text[1]);
                map[one][two]=true;
                points.add(one);
            }
            for(int i:points){
                int l = length(map,i);
                if(l!=-1){
                    System.out.println(l);
                    break;
                }
            }
        }
    }
    public static int length(boolean map[][],int start){
        Queue<int[]> queue = new LinkedList<int[]>();
        int[]start1={start,0};
        queue.add(start1);
        boolean hasSeen[]=new boolean[101];
        int prev=-1;
        while(!queue.isEmpty()){
            int[] x = queue.poll();
            int s = x[0];
            int l = x[1];
            if(l>0&&s==start){
                return l;
            }
            if(hasSeen[s])continue;
            hasSeen[s]=true;
            for(int i=0;i<=100;++i){
                if(map[s][i]){
                    int [] sta = {i,l+1};
                    queue.add(sta);
                }
            }
        }
        return -1;
    }
} 
import java.util.*;
import java.io.*;

public class RicochetRobot {

    static int n = 20;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("DATA.txt"));
        int sum = 0;
        while (s.hasNext()) {
            char[][] maze = new char[n][n];
            int xStart = 0, yStart = 0;
            for (int y = 0; y <n; ++y) {
                String text = s.nextLine().trim();
                for (int x = 0; x < n; ++x) {
                    maze[x][y] = text.charAt(x);
                    if (maze[x][y] == 'A') {
                        xStart = x;
                        yStart = y;
                    }
                }
            }
            s.nextLine();
            sum = bfs(maze,xStart,yStart);
            System.out.println(sum);
        }
        System.out.println(sum);
    }

    /*Breadth first search*/
    public static int bfs(char[][] maze, int xStart, int yStart) {
        Queue<int[]> queue = new LinkedList<int[]>();
        int[] start = {xStart, yStart, 0};
        queue.add(start);
        while (!queue.isEmpty()) {
            int[] array = queue.remove();
            int x = array[0];
            int y = array[1];
            if (maze[x][y] == 'B') {
                
                return array[2];
            }
            int[][] neighbors = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
            out:
            for (int i = 0; i < 4; ++i) {
                int x1=x,y1=y;
                while(true){
                    x1+=neighbors[i][0];
                    y1+=neighbors[i][1];
                    if((x1>=n||y1>=n||y1<0||x1<0)||maze[x1][y1]=='#'){
                        int[]node = {x1-neighbors[i][0],y1-neighbors[i][1],array[2]+Math.abs(x1-x-neighbors[i][0])+Math.abs(y1-y-neighbors[i][1])};
                        queue.add(node);
                        continue out;
                    }
                }
            }
        }
        return 0;
    }
}

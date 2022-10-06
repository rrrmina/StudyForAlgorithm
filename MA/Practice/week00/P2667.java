package MA.Practice.week00;

import java.util.*;
// 단지번호붙이기 https://www.acmicpc.net/problem/2667
public class P2667 {
    static int count;
    static int N;
    static int[][] map;
    static boolean [][] check;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static ArrayList<Integer> result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        check = new boolean[N][N];
        for(int i=0; i<N; i++){
            String str = sc.next();
            for(int j=0; j<N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }
        count = 0;
        result = new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j]==1 && !check[i][j]){
                    count=1;
                    dfs(i,j);
                    result.add(count);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int r : result) System.out.println(r);
    }

    private static int dfs(int x, int y) {
        check[x][y] = true;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(map[nx][ny]==1 && !check[nx][ny]){
                    dfs(nx, ny);
                    count++;
                }
            }
        }
        return count;
    }
}

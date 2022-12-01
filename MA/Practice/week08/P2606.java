package MA.Practice.week08;

import java.io.*;
import java.util.*;

public class P2606 {
    static int c, pair;
    static boolean[][] arr;
    static boolean[] check;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        c = Integer.parseInt(br.readLine());
        pair = Integer.parseInt(br.readLine());
        arr = new boolean[c][c];
        check = new boolean[c];

        for (int i = 0; i < pair; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            arr[a][b] = true;
            arr[b][a] = true;
        }
        bfs(0);
    }

    private static void bfs(int i) {
        check[i] = true;
        queue.add(i);
        int cnt = 0;
        while (!queue.isEmpty()) {
            int num = queue.poll();
            for (int j = 0; j < c; j++) {
                if (arr[num][j] && !check[j]) {
                    queue.add(j);
                    check[j] = true;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

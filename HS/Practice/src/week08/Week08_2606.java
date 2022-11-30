package week08;

import java.io.*;
import java.util.*;

// 바이러스
public class Week08_2606 {
    static int computerN;
    static int[][] computerList;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        input();
        bfs();
        output();
    }

    private static void output() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(count + "");
        bw.flush();
        bw.close();
    }

    private static void bfs() {
        int start = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 0; i < computerList[temp].length; i++) {
                if (visited[i] == false && computerList[temp][i] == 1) {
                    visited[i] = true;
                    queue.add(i);
                    count++;
                }
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computerN = Integer.parseInt(br.readLine());
        int edgeN = Integer.parseInt(br.readLine());
        computerList = new int[computerN + 1][computerN + 1];
        visited = new boolean[computerN + 1];
        StringTokenizer st;

        for (int i = 0; i < edgeN; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            computerList[a][b] = 1;
            computerList[b][a] = 1;
        }
    }
}

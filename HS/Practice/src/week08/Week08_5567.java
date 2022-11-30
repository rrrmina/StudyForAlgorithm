package week08;

import java.io.*;
import java.util.*;

// 결혼식
public class Week08_5567 {
    static int num;
    static List<List<Integer>> friends;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        input();
        dfs(1, 0);
        output();
    }

    private static void dfs(int n, int depth) {
        if (depth == 2) {
            return;
        }

        for (int i : friends.get(n)) {
            visited[i] = true;
            dfs(i, depth + 1);
        }
    }

    private static void output() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 2; i < visited.length; i++) {
            if (visited[i]) {
                count++;
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
    }



    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        friends = new ArrayList<>();
        for (int i = 0; i <= num; i++) {
            friends.add(new ArrayList<>());
        }

        visited = new boolean[num + 1];
        StringTokenizer st;
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            friends.get(a).add(b);
            friends.get(b).add(a);
        }
    }
}

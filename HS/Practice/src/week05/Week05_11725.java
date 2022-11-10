package week05;

import java.io.*;
import java.util.*;

// 트리의 부모 찾기, 11725
public class Week05_11725 {
    static List<List<Integer>> input;
    static int n;
    static int[] parents;

    public static void main(String[] args) throws IOException {
        makeInput();
        bfs();
        makeOutput();
    }

    private static void makeOutput() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 2; i < parents.length; i++) {
            bw.write(parents[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        parents[1] = 1;
        while (!queue.isEmpty()) {
            int parent = queue.poll();
            for (int i : input.get(parent)) {
                if (parents[i] == 0) {
                    parents[i] = parent;
                    queue.add(i);
                }
            }
        }
    }

    private static void makeInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        input = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            input.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            input.get(a).add(b);
            input.get(b).add(a);
        }
        parents = new int[n+1];
    }
}

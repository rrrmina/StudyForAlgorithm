package MA.Practice.week05;

import java.util.*;
import java.io.*;

public class P11725 {
    private static int n;
    private static ArrayList<Integer>[] list;
    private static int parent[];
    private static boolean visit[];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        list = new ArrayList[n+1];
        visit = new boolean[n+1];
        parent = new int[n+1];
        for(int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }
        for(int i=0; i<n-1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            list[temp1].add(temp2);
            list[temp2].add(temp1);
        }
        dfs(1);
        for(int i=2; i<=n; i++) System.out.println(parent[i]);

    }
    private static void dfs(int start) {
        visit[start] = true;
        for(int i=0; i<list[start].size(); i++) {
            int temp = list[start].get(i);
            if(visit[temp] == false) {
                parent[temp] = start;
                dfs(temp);
            }
        }
    }
}

package week03;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Week03_3078 {

    static void combination(String[] arr, boolean[] visited, int start, int n, int k, int r) {
        if (r == 0) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    list.add(arr[i]);
                }
            }
        System.out.println();
        return;
        }


        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, k, r - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArr = br.readLine().split(" ");
        int n = Integer.parseInt(sArr[0]);
        int k = Integer.parseInt(sArr[1]);
        String[] arr = new String[n];
        for(int i=0; i<n; i++) arr[i] = br.readLine();
        boolean[] visited = new boolean[n];
        combination(arr, visited, 0, n, k, 2);

    }
}

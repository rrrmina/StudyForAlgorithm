package MA.Practice.week07;

import java.io.*;
import java.util.*;

public class P6603 {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int[] s;
    static boolean[] check;

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            s = new int[n];
            check = new boolean[n];
            for (int i = 0; i < n; i++) s[i] = Integer.valueOf(st.nextToken());
            //Arrays.sort(s);
            lotto(0, 0);
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void lotto(int m, int k) {
        if (m == 6) {
            for (int i = 0; i < n; i++) {
                if (check[i]) sb.append(s[i] + " ");
            }
            sb.append('\n');
        }
        for (int i = k; i < n; i++) {
            check[i] = true;
            lotto(m + 1, i + 1);
            check[i] = false;
        }
    }
}

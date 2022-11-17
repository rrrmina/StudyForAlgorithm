package MA.Practice.week06;


import java.io.*;
import java.util.*;

public class P13116 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int a, b;
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            int minNum = Math.min(a, b);
            if(minNum == a) {
                while(true) { // 1.
                    if(b - a < a) break;
                    b /=2;
                }
            } else {
                while(true) {
                    if(a - b < b) break;
                    a /=2;
                }
            }

            while (a != b) { // 2.
                if(a > b) {
                    a /= 2;
                    if(a == b) break;
                    b /= 2;
                }
                else {
                    b /=2;
                    if(a == b) break;
                    a /=2;
                }
            }
            sb.append((a *10)).append("\n");
        }
        System.out.println(sb);
    }
}
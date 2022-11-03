package MA.Practice.another;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P2529 {
    static int n;
    static char[] chars = new char[10];
    static boolean[] check = new boolean[10];
    static ArrayList answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) chars[i] = st.nextToken().charAt(0);
        bfs(0,"");
        Collections.sort(answer);
        System.out.println(answer.get(answer.size()-1));
        System.out.println(answer.get(0));
    }

    static void bfs(int idx, String num) {
        if (idx == n+1) {
            answer.add(num);
            return;
        }
        for (int i = 0; i <= 9; i++) {
            if (check[i]) continue;
            if (idx == 0 || check(num.charAt(idx-1), (char)(i+'0'), chars[idx-1])) {
                check[i] = true;
                bfs(idx + 1, num+i);
                check[i] = false;
            }
        }
    }

    static boolean check(char a, char b, char c) {
        if (c == '<') if (a > b) return false;
        if (c == '>') if (a < b) return false;
        return true;
    }
}

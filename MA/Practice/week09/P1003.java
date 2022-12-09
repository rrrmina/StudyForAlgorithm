package MA.Practice.week09;

import java.util.*;

public class P1003 {
    static int t;
    static Integer[][] fibonacci = new Integer[41][2];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        t = sc.nextInt();
        fibonacci[0][0] = 1;
        fibonacci[0][1] = 0;
        fibonacci[1][0] = 0;
        fibonacci[1][1] = 1;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            dp(n);
            sb.append(fibonacci[n][0]).append(" ").append(fibonacci[n][1]).append('\n');
        }
        System.out.println(sb);
    }

    private static Integer[] dp(int n) {
        if (fibonacci[n][0] == null || fibonacci[n][1] == null) {
            fibonacci[n][0] = dp(n - 1)[0] + dp(n - 2)[0];
            fibonacci[n][1] = dp(n - 1)[1] + dp(n - 2)[1];
        }
        return fibonacci[n];
    }
}

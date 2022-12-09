package week09;

import java.io.*;

// 피보나치 함수
public class Week09_1003 {
    static Integer[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testN = Integer.parseInt(br.readLine());
        int index = 0;
        while (index < testN) {
            int n = Integer.parseInt(br.readLine());
            dp = new Integer[41][2]; // n<=40 이므로 크기는 +1
            dp[0][0] = 1; // n=0 일 때 f(0)이 호출되는 수
            dp[0][1] = 0; // n=0 일 때 f(1)이 호출되는 수
            dp[1][0] = 0; // n=1 일 때 f(0)이 호출되는 수
            dp[1][1] = 1; // n=1 일 때 f(1)이 호출되는 수

            fibonacci(n);

            bw.write(dp[n][0] + " " + dp[n][1] + "\n"); // 줄바꿈 안하면 틀렸습니다 뜸
            bw.flush();
            index++;
        }
        br.close();
        bw.close();
    }

    private static Integer[] fibonacci(int n) {
        if (dp[n][0] == null || dp[n][1] == null) {
            dp[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0]; // n일 때 0이 호출되는 수 구하기
            dp[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1]; // n일 떄 1이 호출되는 수 구하기
        }
        return dp[n];
    }
}

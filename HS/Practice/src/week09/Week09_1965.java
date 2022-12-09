package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 상자 넣기
public class Week09_1965 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] boxes = new int[n];
        int[] dp = new int[n];

        String[] temp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            boxes[i] = Integer.parseInt(temp[i]);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1; // 자기 자신
            for (int j = 0; j < i; j++) {
                if (boxes[j] < boxes[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1); // 자신보다 작은 것들 + 자기 자신(+1)
                }
            }
            result = Math.max(result, dp[i]); // 최대 상자 개수 갱신
        }

        System.out.println(result);
    }
}

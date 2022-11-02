package week03;

import java.io.*;
import java.util.StringTokenizer;

// 리모컨
public class Week03_1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Boolean[] broken = new Boolean[10];
        for (int i = 0; i < m; i++) {
            broken[Integer.parseInt(st.nextToken())] = true;
        }
        // 100번부터 위아래 버튼으로만 갔을 때가 초기값
        int result = Math.abs(n - 100);
        for (int i = 0; i <= 999999; i++) {
            String s = String.valueOf(i);
            int len = s.length();

            boolean flag = false;
            for (int j = 0; j < len; j++) {
                if (broken[s.charAt(j) - '0']) {
                    flag = true;
                    break;
                }
            }
            // i에서 누른 버튼들이 모두 고장나지 않을 경우
            if (!flag) {
                int min = Math.abs(n - i) + len;
                result = Math.min(result, min);
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}

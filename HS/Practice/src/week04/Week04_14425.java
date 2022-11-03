package week04;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

// 문자열 집합
public class Week04_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            hm.put(s, s);
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (hm.containsKey(br.readLine())) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}

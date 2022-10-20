package week02;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// 나는야 포켓몬 마스터 이다솜
public class Week02_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map_str = new HashMap<>();
        HashMap<Integer, String> map_int = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            map_str.put(s, i);
            map_int.put(i, s);
        }

        for (int i = 1; i <= m; i++) {
            String input = br.readLine();
            // input이 숫자라면
            if (input.charAt(0) - 48 >= 0 && input.charAt(0) - 48 <= 9) {
                bw.write(map_int.get(Integer.parseInt(input))+"\n");
            } else {
                bw.write(map_str.get(input)+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

package week09;

import java.io.*;
import java.util.*;

// 생태학
public class Week09_4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Integer> map = new TreeMap<>(); // 순서 보장 Map
        int total = 0;

        String input;
        while (true) {
            input = br.readLine();
            if (input == null || input.equals("")) {
                break;
            }
            total++;
            if (map.containsKey(input)) {
                map.put(input, map.get(input) + 1); // 중복이 있으면 +1
            } else {
                map.put(input, 1);
            }
        }

        for (String s : map.keySet()) {
            double value = (double) (map.get(s) * 100.0) / total;
            bw.write(s + " " + String.format("%.4f", value) + "\n"); // Math.round로 하면 틀림
        }
        bw.flush();
        bw.close();
    }
}

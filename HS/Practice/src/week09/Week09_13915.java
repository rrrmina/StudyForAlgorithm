package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 현수의 열기구 교실
public class Week09_13915 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testcaseStr = "";
        StringBuilder sb;
        StringBuilder result = new StringBuilder();

        while ((testcaseStr = br.readLine()) != null) { // 이거 없으면 50%에서 틀렸습니다 나온다
            HashSet<String> set = new HashSet<>();
            int testcase = Integer.parseInt(testcaseStr);
            for (int i = 0; i < testcase; i++) {
                Set<Integer> number = new HashSet<>();
                sb = new StringBuilder();
                String[] temp = br.readLine().split("");
                for (String s : temp) {
                    number.add(Integer.valueOf(s));
                }
                for (int n : number) {
                    sb.append(String.valueOf(n));
                }
                set.add(String.valueOf(sb));
            }
            result.append(set.size() + "\n");
        }
        System.out.println(result.toString());
    }
}

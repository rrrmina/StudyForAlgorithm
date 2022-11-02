package week04;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

// ATM
public class Week04_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(list);
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - i - 1; j >= 0; j--) {
                result += list.get(i);
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}

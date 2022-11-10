package week04;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

// 대칭 차집합
public class Week04_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> ahm = new HashMap<>();
        for (int i = 0; i < a; i++) {
            ahm.put(Integer.parseInt(st.nextToken()), i);
        }

        st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> bhm = new HashMap<>();
        for (int i = 0; i < b; i++) {
            bhm.put(Integer.parseInt(st.nextToken()), i);
        }

        int aMinusB = 0;
        for (int i : ahm.keySet()) {
            if (!bhm.containsKey(i)) {
                aMinusB++;
            }
        }

        int bMinusA = 0;
        for (int i : bhm.keySet()) {
            if (!ahm.containsKey(i)) {
                bMinusA++;
            }
        }

        bw.write(aMinusB + bMinusA + "");
        bw.flush();
        bw.close();
    }
}

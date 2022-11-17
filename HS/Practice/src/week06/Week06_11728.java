package week06;

import java.io.*;
import java.util.*;

// 배열 합치기, 11728
public class Week06_11728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> a = new ArrayList<>();
        String[] aArr = br.readLine().split(" ");
        for (int i = 0; i < aArr.length; i++) {
            a.add(Integer.parseInt(aArr[i]));
        }

        String[] bArr = br.readLine().split(" ");
        for (int i = 0; i < bArr.length; i++) {
            a.add(Integer.parseInt(bArr[i]));
        }

        Collections.sort(a);

        for (int i : a) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();
    }
}

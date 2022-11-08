package week04;

import java.io.*;
import java.util.*;

// 좋다, 미해결
public class Week04_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            list.add(temp);
            arr[i] = temp;
        }

        HashMap<Integer,Integer> hs = new HashMap<>();
        int key = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                List<Integer> subList = new ArrayList<>(list);
                subList.remove(j);
                subList.remove(i);
                if (subList.contains(sum)) {
                    hs.put(sum, sum);
                }
            }
        }

        bw.write(hs.size() + "");
        bw.flush();
        bw.close();
    }
}

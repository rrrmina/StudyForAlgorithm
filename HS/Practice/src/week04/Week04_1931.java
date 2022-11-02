package week04;

import java.io.*;
import java.util.*;

// 회의실 배정
public class Week04_1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            arr[i] = new int[str.length];
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int preTime = 0;
        for (int i = 0; i < arr.length; i++) {
            if (preTime <= arr[i][0]) {
                preTime = arr[i][1];
                count++;
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}

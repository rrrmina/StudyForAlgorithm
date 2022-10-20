package week02;

import java.io.*;
import java.util.Arrays;

// 일곱 난쟁이
public class Week02_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[9];
        int sum = 0;
        int nA = 0;
        int nB = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                   nA = arr[i];
                   nB = arr[j];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(nA == arr[i] || nB == arr[i]) continue;
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
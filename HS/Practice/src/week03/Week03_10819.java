package week03;

import java.io.*;
import java.util.StringTokenizer;

public class Week03_10819 {
    static int max = 0;

    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            int sum = 0;
            for (int i = 0; i < r - 1; i++) {
                sum += Math.abs(arr[i] - arr[i + 1]);
            }
            max = Math.max(max, sum);
            return;
        }

        for (int i=depth; i<n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.valueOf(st.nextToken());
        }

        permutation(arr, 0, n, n);
        bw.write(max + "");
        bw.flush();
        bw.close();
    }
}

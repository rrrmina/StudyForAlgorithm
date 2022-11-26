package week07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// n번째 큰 수
public class week07_2075 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n*n];
        int idx =0;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[idx++] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[n*n - n]);
    }
}

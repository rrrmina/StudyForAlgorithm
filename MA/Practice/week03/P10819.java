package MA.Practice.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 차이를 최대로 https://www.acmicpc.net/problem/10819
public class P10819 {
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        max = 0;
        bf(arr, 0, n);
        System.out.println(max);
    }
    public static void bf(int[] a, int cnt, int n){
        if(cnt==n){
            findMaxSum(n, a);
            return;
        }
        for(int i=cnt; i<n; i++){
            swap(a, i, cnt);
            bf(a, cnt+1, n);
            swap(a, i, cnt);
        }
    }
    public static void swap(int[] a, int m, int n) {
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }
    public static void findMaxSum(int n, int[] a) {
        int sum = 0;
        for (int i = 0; i < n-1; i++) sum += Math.abs(a[i]- a[i+1]);
        if(max < sum) max = sum;
    }
}

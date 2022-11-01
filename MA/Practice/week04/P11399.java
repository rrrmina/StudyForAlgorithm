package MA.Practice.week04;
// ATM https://www.acmicpc.net/problem/11399
import java.io.*;
import java.util.*;

public class P11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[n];
        for(int i=0; i<n; i++) time[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(time);
        int sum = 0;
        for(int i=0; i<n; i++) sum += time[i]*(n-i);
        System.out.println(sum);
    }
}

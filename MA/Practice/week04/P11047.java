package MA.Practice.week04;
// 동전 0 https://www.acmicpc.net/problem/11047
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11047 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;

        for(int i = n - 1; i >= 0; i--) {
            if(coin[i] <= k) {
                count += (k / coin[i]);
                k = k % coin[i];
            }
        }
        System.out.println(count);
    }
}

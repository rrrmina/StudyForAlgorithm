package MA.Practice.week04;
// 잃어버린 괄호 https://www.acmicpc.net/problem/1541
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), "-");
        int sum = Integer.MAX_VALUE; //0안됨.. 테케에는 없지만 합이 중간에 0 될 수도 있음.
        while (stringTokenizer.hasMoreTokens()) {
            StringTokenizer st = new StringTokenizer(stringTokenizer.nextToken(), "+");
            int temp = 0;
            while (st.hasMoreTokens()) temp += Integer.parseInt(st.nextToken());
            if (sum == Integer.MAX_VALUE) sum = temp;
            else sum -= temp;
        }
        System.out.println(sum);
    }
}
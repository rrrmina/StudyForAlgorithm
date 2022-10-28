package MA.Practice.week03;
// 리모컨 https://www.acmicpc.net/problem/1107
import java.util.Scanner;

public class P1107 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int channel = sc.nextInt();
        int m = sc.nextInt();

        boolean[] broken = new boolean[10];
        for(int i = 0; i < m; i++) {
            int n = sc.nextInt();
            broken[n] = true;
        }

        int result = Math.abs(channel - 100);
        for(int i = 0; i <= 999999; i++) {
            String str = String.valueOf(i);
            int len = str.length();

            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                if(broken[str.charAt(j) - '0']) {
                    isBreak = true;
                    break;
                }
            }
            if(!isBreak) {
                int min = Math.abs(channel - i) + len;
                result = Math.min(min, result);
            }
        }
        System.out.println(result);
    }
}

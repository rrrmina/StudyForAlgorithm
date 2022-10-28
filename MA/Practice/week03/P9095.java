package MA.Practice.week03;
// 1, 2, 3 더하기 https://www.acmicpc.net/problem/9095

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        for(int i=0; i<n; i++) num[i] = Integer.parseInt(br.readLine());

        int[] answer = new int[11];
        answer[1] = 1; // 1 = 1
        answer[2] = 2; // 2 = 1+1 = 2
        answer[3] = 4; // 3 = 1+1+1 = 1+2 = 2+1 = 3   4 = 1+1+1+1 = 1+1+2 = 1+2+1 = 1+3 = 2+1+1 = 2+2 = 3+1 = 4 5 = 1+1+1+1+1 = 2+3개수 = 3+2개수 = 4+1개수 = 5

        for(int i=4; i<11; i++){
            answer[i] = answer[i-3] + answer[i-2] + answer[i-1];
        }

        for(int i=0; i<n; i++){
            System.out.println(answer[num[i]]);
        }
    }
}

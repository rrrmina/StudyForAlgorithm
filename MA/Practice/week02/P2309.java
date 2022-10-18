package MA.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 일곱 난쟁이 https://www.acmicpc.net/problem/2309
public class P2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if (sum - heights[i] - heights[j] == 100) {
                    heights[i] = -1;
                    heights[j] = -1;
                    Arrays.sort(heights);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(heights[k]);
                    }
                    return;
                }
            }
        }
    }
}

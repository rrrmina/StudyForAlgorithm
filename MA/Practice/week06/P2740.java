package MA.Practice.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2740 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] matrix1 = new int[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j<m; j++) matrix1[i][j] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] matrix2 = new int[m][k];
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j<k; j++) matrix2[i][j] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < k; j++) {
                int sum = 0;
                for(int h = 0; h < m; h++) {
                    sum += matrix1[i][h] * matrix2[h][j];
                }
                sb.append(sum).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}



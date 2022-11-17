package week06;

import java.io.*;
import java.util.StringTokenizer;

// 행렬 곱셈, 2740
public class Week06_2740 {

    static int[][] a;
    static int[][] b;
    static int an;
    static int am;
    static int bn;
    static int bm;
    static int[][] result;

    public static void main(String[] args) throws IOException {
        input();
        multiple();
        output();
    }

    private static void multiple() {
        for (int i = 0; i < an; i++) {
            for (int j = 0; j < bm; j++) {
                for (int k = 0; k < bn; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] anm = br.readLine().split(" ");
        an = Integer.parseInt(anm[0]);
        am = Integer.parseInt(anm[1]);

        a = inputMatrix(an, am, br);

        String[] bnm = br.readLine().split(" ");
        bn = Integer.parseInt(bnm[0]);
        bm = Integer.parseInt(bnm[1]);

        b = inputMatrix(bn, bm, br);

        result = new int[an][bm];
    }

    private static int[][] inputMatrix(int n, int m, BufferedReader br) throws IOException {
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                temp[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return temp;
    }

    private static void output() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int[] s : result) {
            for (int ss : s) {
                bw.write(ss+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}

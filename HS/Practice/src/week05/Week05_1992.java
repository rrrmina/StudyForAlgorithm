package week05;

import java.io.*;

// 쿼드트리, 1992
public class Week05_1992 {
    static String[][] input;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        input = inputPaper();
        partition(0, 0, input.length);
        showOutPut();
    }

    private static void partition(int y, int x, int size) {
        if (checkBlackAndWhite(y, x, size)) {
            sb.append(input[y][x]);
            return;
        }

        size = size / 2;

        sb.append("(");
        partition(y, x, size); // 2사분면
        partition(y, x + size, size); // 1사분면
        partition(y + size, x, size); // 3사분면
        partition(y + size, x + size, size); // 4사분면
        sb.append(")");
    }

    private static boolean checkBlackAndWhite(int y, int x, int size) {
        String color = input[y][x];
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (!input[i][j].equals(color)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String[][] inputPaper() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        input = new String[n][n];
        for (int i = 0; i < n; i++) {
            input[i] = br.readLine().split("");
        }
        return input;
    }

    private static void showOutPut() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}

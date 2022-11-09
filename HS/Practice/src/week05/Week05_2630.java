package week05;

import java.io.*;
import java.util.StringTokenizer;

// 색종이 만들기, 2630
public class Week05_2630 {
    static int whiteCount = 0;
    static int blueCount = 0;
    static String[][] input;

    public static void main(String[] args) throws IOException {
        input = inputPaper();
        partition(0, 0, input.length);
        showOutPut();
    }

    private static void partition(int y, int x, int size) {
        if (colorCheck(y, x, size)) {
            if (input[y][x].equals("0")) {
                whiteCount++;
            } else {
                blueCount++;
            }
            return;
        }

        size = size / 2;

        partition(y, x, size);
        partition(y, x + size, size);
        partition(y + size, x, size);
        partition(y + size, x + size, size);

    }

    private static boolean colorCheck(int y, int x, int size) {
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
            input[i] = br.readLine().split(" ");
        }
        return input;
    }

    private static void showOutPut() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(whiteCount + "\n");
        bw.write(blueCount + "");
        bw.flush();
        bw.close();
    }
}

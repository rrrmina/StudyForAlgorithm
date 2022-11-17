package week05;

import java.io.*;

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
            } else if (input[y][x].equals("1")) {
                blueCount++;
            }
            return;
        }

        size = size / 2;
        partition(y, x, size); // 2사분면
        partition(y, x + size, size); // 1사분면
        partition(y + size, x, size); // 3사분면
        partition(y + size, x + size, size); // 4사분면
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

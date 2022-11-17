package week05;

import java.io.*;

// 종이의 개수, 1780
public class Week05_1780 {
    static String[][] input;
    static int minus;
    static int zero;
    static int plus;

    public static void main(String[] args) throws IOException {
        input = inputPaper();
        partition(0, 0, input.length);
        showOutPut();
    }

    private static void partition(int y, int x, int size) {
        if (checkNum(y, x, size)) {
            if (input[y][x].equals("-1")) {
                minus++;
            } else if (input[y][x].equals("0")) {
                zero++;
            } else if (input[y][x].equals("1")) {
                plus++;
            }
            return;
        }

        size = size / 3;
        partition(y, x, size); // 왼쪽 상단
        partition(y, x + size, size); // 중앙 상단
        partition(y, x + size * 2, size); // 오른쪽 상단
        partition(y + size, x, size); // 왼쪽
        partition(y + size, x + size, size); // 중앙
        partition(y + size, x + size * 2, size); // 오른쪽
        partition(y + size * 2, x, size); // 왼쪽 하단
        partition(y + size * 2, x + size, size); // 중앙 하단
        partition(y + size * 2, x + size * 2, size); // 오른쪽 하단
    }

    private static boolean checkNum(int y, int x, int size) {
        String value = input[y][x];
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (!input[i][j].equals(value)) {
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
        bw.write(minus + "\n");
        bw.write(zero + "\n");
        bw.write(plus + "");
        bw.flush();
        bw.close();
    }
}

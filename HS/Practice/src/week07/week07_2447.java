package week07;

import java.io.*;

// 별 찍기 - 10
public class week07_2447 {
    static char[][] arr;
    static int n;

    public static void main(String[] args) throws IOException {
        input();
        star(0, 0, n, false);
        output();
    }

    static void star(int x, int y, int n, boolean blank) {

        if (blank) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int size = n / 3;
        int count = 0;
        for (int i = x; i < x + n; i += size) {
            for (int j = y; j < y + n; j += size) {
                count++;
                if (count == 5) { // 공백 칸일 경우
                    star(i, j, size, true);
                } else {
                    star(i, j, size, false);
                }
            }
        }
    }

    private static void output() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new char[n][n];
    }

}

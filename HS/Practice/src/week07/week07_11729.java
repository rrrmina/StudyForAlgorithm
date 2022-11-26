package week07;

import java.io.*;

// 하노이 탑
public class week07_11729 {
    public static int count = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void move(int n, int from, int by, int to) {
        count++;
        if (n == 1) {
            sb.append(from + " " + to + "\n");
            return;
        }

        move(n - 1, from, to, by);
        sb.append(from + " " + to + "\n");
        move(n - 1, by, from, to);
    }

    public static void main(String[] args) throws IOException {
        int n = input();
        move(n, 1, 2, 3);
        ouput(n);
    }

    private static void ouput(int n) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(n) + "\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        return n;
    }
}

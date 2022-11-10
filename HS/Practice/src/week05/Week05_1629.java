package week05;

import java.io.*;

// 곱셈, 1629
public class Week05_1629 {
    static long result;

    public static void main(String[] args) throws IOException {
        String[] input = input();
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        result = solve(a, b, c);

        output();
    }

    private static long solve(int a, int b, int c) {
        if (b == 1) {
            return a % c;
        }

        long temp = solve(a, b/2, c);

        if (b % 2 == 1) {
            return (temp * temp % c) * a % c;
        }
        return temp * temp % c;

    }

    private static String[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().split(" ");
    }

    private static void output() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}

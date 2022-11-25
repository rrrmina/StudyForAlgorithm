package MA.Practice.week07;

import java.util.Scanner;

public class P11729 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sb.append((int) (Math.pow(2, n) - 1)).append('\n'); // 일반식
        Hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }

    public static void Hanoi(int n, int start, int middle, int arrival) {
        if (n == 1) {
            sb.append(start + " " + arrival).append( "\n");
            return;
        }
        Hanoi(n - 1, start, arrival, middle);
        sb.append(start + " " + arrival).append( "\n");
        Hanoi(n - 1, middle, start, arrival);
    }
}

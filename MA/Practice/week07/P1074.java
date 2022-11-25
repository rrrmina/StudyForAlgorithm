package MA.Practice.week07;

import java.util.Scanner;

public class P1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(recursion(n, r, c));
    }

    public static int recursion(int n, int row, int col) {
        if (n == 0) return 0;
        return 2 * (row % 2) + (col % 2) + 4 * recursion(n - 1, row / 2, col / 2);
    }
}

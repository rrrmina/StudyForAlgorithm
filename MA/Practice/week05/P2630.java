package MA.Practice.week05;
// 색종이 만들기 https://www.acmicpc.net/problem/2630
import java.io.*;
import java.util.*;

public class P2630 {
    public static int white = 0;
    public static int blue = 0;
    public static int[][] board;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++) board[i][j] = Integer.parseInt(st.nextToken());
        }
        recursion(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }

    public static void recursion(int row, int col, int size) {
        if(checkColor(row, col, size)) {
            if(board[row][col] == 0) white++;
            else blue++;
            return;
        }
        int newSize = size / 2;	// 절반 사이즈
        // 재귀 호출
        recursion(row, col, newSize);						// 2사분면
        recursion(row, col + newSize, newSize);				// 1사분면
        recursion(row + newSize, col, newSize);				// 3사분면
        recursion(row + newSize, col + newSize, newSize);	// 4사분면
    }

    public static boolean checkColor(int row, int col, int size) {
        int color = board[row][col];
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(board[i][j] != color) return false;
            }
        }
        return true;
    }
}
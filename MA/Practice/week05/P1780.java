package MA.Practice.week05;
// 종이의 개수 https://www.acmicpc.net/problem/1780
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1780 {
    public static int num1 = 0;
    public static int num0 = 0;
    public static int minus1 = 0;

    public static int[][] board;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        StringTokenizer st;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++) board[i][j] = Integer.parseInt(st.nextToken());
        }
        recursion(0, 0, n);
        System.out.println(minus1);
        System.out.println(num0);
        System.out.println(num1);
    }

    public static void recursion(int row, int col, int size) {
        if(checkNum(row, col, size)) {
            if(board[row][col] == 0) num0 ++;
            else if(board[row][col]==1) num1 ++;
            else minus1 ++;
            return;
        }
        int newSize = size / 3;
        recursion(row, col, newSize);
        recursion(row, col + newSize, newSize);
        recursion(row, col + 2*newSize, newSize);
        recursion(row + newSize, col, newSize);
        recursion(row + newSize, col + newSize, newSize);
        recursion(row + newSize, col + 2*newSize, newSize);
        recursion(row + 2*newSize, col, newSize);
        recursion(row + 2*newSize, col + newSize, newSize);
        recursion(row + 2*newSize, col + 2*newSize, newSize);
    }

    public static boolean checkNum(int row, int col, int size) {
        int num = board[row][col];
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(board[i][j] != num) return false;
            }
        }
        return true;
    }
}


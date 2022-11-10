package MA.Practice.week05;
// 쿼드트리 https://www.acmicpc.net/problem/1992
import java.io.*;

public class P1992 {
    public static char[][] video;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        video = new char[n][n];
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < n; j++) video[i][j] = str.charAt(j);
        }
        recursion(0,0,n);
        System.out.println(sb);
    }
    public static void recursion(int row, int col, int size) {
        if(checkColor(row, col, size)) {
            sb.append(video[row][col]);
            return;
        }
        int newSize = size / 2;
        sb.append('(');
        recursion(row, col, newSize);
        recursion(row, col + newSize, newSize);
        recursion(row + newSize, col, newSize);
        recursion(row + newSize, col + newSize, newSize);
        sb.append(')');
    }
    public static boolean checkColor(int row, int col, int size) {
        char color = video[row][col];
        for(int i = row; i < row + size; i++) {
            for(int j = col; j < col + size; j++) {
                if(video[i][j]!=color) return false;
            }
        }
        return true;
    }
}

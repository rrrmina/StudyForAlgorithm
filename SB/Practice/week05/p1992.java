package SB.Practice.week05;

import java.util.ArrayList;
import java.util.Scanner;

public class p1992 {
  // s1 쿼드트리
  static int[][] video;
  static ArrayList<Integer> result;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());

    video = new int[N][N];
    result = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      String[] line = sc.nextLine().split("");
      for (int j = 0; j < N; j++) {
        video[i][j] = Integer.parseInt(line[j]);
      }
    }

    compression(0, 0, N);

    for (Integer integer : result) {
      if (integer == 2)
        System.out.print("(");
      else if (integer == 3)
        System.out.print(")");
      else {
        System.out.print(integer);
      }
    }
  }

  private static void compression(int row, int col, int size) {
    if (video_check(row, col, size)) {
      if (video[row][col] == 0) {
        result.add(0);
      } else
        result.add(1);
      return;
    }
    // 2 : 괄호 (
    result.add(2);
    // size 1/2
    int new_size = size / 2;

    //compression 1,2,3,4 quadrant
    compression(row, col, new_size);
    compression(row, col + new_size, new_size);
    compression(row + new_size, col, new_size);
    compression(row + new_size, col + new_size, new_size);

    // 3 : 괄호 )
    result.add(3);
  }

  private static boolean video_check(int row, int col, int size) {
    int binary = video[row][col];

    for (int i = row; i < row + size; i++) {
      for (int j = col; j < col + size; j++) {
        if (video[i][j] != binary)
          return false;
      }
    }
    return true;
  }
}

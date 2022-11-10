package SB.Practice.week05;

import java.util.Scanner;

public class p1780 {

  static int[][] paper;
  static int minusOne;
  static int zero;
  static int one;

  // s2 종이의 개수
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    paper = new int[N][N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        paper[i][j] = sc.nextInt();
      }
    }

    partition(0, 0, N);

    System.out.println(minusOne);
    System.out.println(zero);
    System.out.println(one);
  }

  private static void partition(int row, int col, int size) {
    if (count_check(row, col, size)) {
      if (paper[row][col] == -1) {
        minusOne++;
      } else if (paper[row][col] == 0) {
        zero++;
      } else if (paper[row][col] == 1) {
        one++;
      }
      return;
    }

    int new_size = size / 3;

    partition(row, col, new_size);
    partition(row, col + new_size, new_size);
    partition(row + new_size, col, new_size);
    partition(row + new_size, col + new_size, new_size);
    partition(row + 2 * new_size, col, new_size);
    partition(row, col + 2 * new_size, new_size);
    partition(row + 2 * new_size, col + 2 * new_size, new_size);
    partition(row + new_size, col + 2 * new_size, new_size);
    partition(row + 2 * new_size, col + new_size, new_size);
  }

  private static boolean count_check(int row, int col, int size) {
    int count = paper[row][col];

    for (int i = row; i < row + size; i++) {
      for (int j = col; j < col + size; j++) {
        if (paper[i][j] != count) {
          return false;
        }
      }
    }
    return true;

  }

}

package SB.Practice.week05;

import java.util.Scanner;

public class p2630 {
  static int white = 0;
  static int blue = 0;
  static int confetti[][];
  // s2 색종이 만들기
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    confetti = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        // 하얀색 0, 파란색 1
        confetti[i][j] = sc.nextInt();
      }
    }
    partition(0, 0, n);

    System.out.println(white);
    System.out.println(blue);
  }

  private static void partition(int row, int col, int size) {
    // same color check
    // if all same, return
    if (color_check(row, col, size)) {
      if (confetti[row][col] == 0) {
        //하얀색일 경우
        white++;
      } else
        blue++;
      return;
    }
    // size 1/2
    int new_size = size / 2;

    //partition 1,2,3,4 quadrant
    partition(row, col, new_size);
    partition(row, col + new_size, new_size);
    partition(row + new_size, col, new_size);
    partition(row + new_size, col + new_size, new_size);
  }

  private static boolean color_check(int row, int col, int size) {
    int color = confetti[row][col];

    for (int i = row; i < row + size; i++) {
      for (int j = col; j < col + size; j++) {
        if (confetti[i][j] != color)
          return false;
      }
    }
    return true;
  }

}

// https://st-lab.tistory.com/227

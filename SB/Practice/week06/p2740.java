package SB.Practice.week06;

import java.util.Scanner;

public class p2740 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int aN = sc.nextInt();
    int aM = sc.nextInt();

    int[][] a = new int[aN][aM];

    for (int i = 0; i < aN; i++) {
      for (int j = 0; j < aM; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    int bM = sc.nextInt();
    int bK = sc.nextInt();

    int[][] b = new int[bM][bK];

    for (int i = 0; i < bM; i++) {
      for (int j = 0; j < bK; j++) {
        b[i][j] = sc.nextInt();
      }
    }

    int[][] AB = new int[aN][bK];

    for (int i = 0; i < aN; i++) {
      for (int j = 0; j < bK; j++) {
        for (int k = 0; k < bM; k++) {
          AB[i][j] += a[i][k] * b[k][j];
        }
      }
    }

    for (int[] ints : AB) {
      for (int anInt : ints) {
        System.out.print(anInt + " ");
      }
      System.out.println();
    }

  }

}

// https://st-lab.tistory.com/245
package SB.Practice.week02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class p2309 {

  static boolean flag = false;

  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[9];
    int[] arr2 = new int[7];

    for (int i = 0; i < 9; i++) {
      arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);
    combination(arr, arr2, 0, 0);

  }

  private static void combination(int[] arr, int[] arr2, int index, int start) {
    if (flag)
      return;
    if (index == 7)
    {
      int sum = 0;
      for (int i = 0; i < 7; i++) {
        sum += arr2[i];
      }
      if (sum == 100)
      {
        flag = true;
        for (int i = 0; i < 7; i++) {
          System.out.println(arr2[i]);
        }
      }
      return;
    }
    for (int i = start; i < 9; i++) {
        arr2[index] = arr[i];
        combination(arr, arr2, index + 1, i + 1);
    }
  }

}

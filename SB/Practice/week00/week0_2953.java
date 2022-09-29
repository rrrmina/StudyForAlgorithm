package Baekjoon;

import java.util.Scanner;

public class week1_2953 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = Integer.MIN_VALUE;
    int maxi = -1;

    for (int i = 0; i < 5; i++) {
      int sum = 0;
      String[] strs = sc.nextLine().split(" ");
      for (String str : strs)
        sum += Integer.valueOf(str);
      if (sum > max)
      {
        max = sum;
        maxi = i + 1;
      }
    }
    System.out.println(maxi + " " + max);
  }

}

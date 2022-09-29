package Baekjoon;

import java.util.Scanner;

public class week1_10809 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] chars = sc.nextLine().toCharArray();
    int[] list = new int[26];

    for (int i = 0; i < 26; i++) {
      list[i] = -1;
    }
    for (int i = 0; i < chars.length; i++) {
     if (list[chars[i] - 97] == -1)
       list[chars[i] - 97] = i;
    }
    for (int i = 0; i < 26; i++) {
      System.out.print(list[i]);
      if (i < 25) {
        System.out.print(" ");
      }
    }
  }
}

package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class week1_8958 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.valueOf(sc.nextLine());
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int sum = 0;
      String[] strs = sc.nextLine().split("");
      for (int j = 0; j < strs.length; j++) {
        if (strs[j].equals("O")) {
          sum++;
          for (int k = j + 1; k < strs.length; k++) {
            if (strs[j].equals(strs[k]))
              sum++;
            else
              break;
          }
        }
      }
      list.add(sum);
    }

    for (Integer integer : list) {
      System.out.println(integer);
    }
  }

}

package SB.Practice.week00;

import java.util.Scanner;

public class week1_2920 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] strs = sc.nextLine().split(" ");

    int flag = 0;

    if (Integer.valueOf(strs[0]) == 1) {
      for (int i = 0; i + 1 < strs.length; i++) {
        if (Integer.valueOf(strs[i]) + 1 == Integer.valueOf(strs[i + 1]))
          continue;
        else
          flag = 1;
      }
      if (flag == 0)
        System.out.println("ascending");
      else
        System.out.println("mixed");
    } else if (Integer.valueOf(strs[0]) == 8) {
      for (int i = 0; i + 1 < strs.length; i++) {
        if (Integer.valueOf(strs[i]) - 1 == Integer.valueOf(strs[i + 1]))
          continue;
        else
          flag = 1;
      }
      if (flag == 0)
        System.out.println("descending");
      else
        System.out.println("mixed");
    }
    else
      System.out.println("mixed");
  }
}

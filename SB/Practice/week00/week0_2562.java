package SB.Practice.week00;

import java.util.Scanner;

public class week1_2562 {

  public static void main(String[] args) {
    int max = Integer.MIN_VALUE;
    int maxi = -1;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 9; i++) {
      int num = Integer.valueOf(sc.nextLine());
      if (num > max){
        max = num;
        maxi = i + 1;
      }
    }
    System.out.println(max + "\n" + maxi);
  }

}

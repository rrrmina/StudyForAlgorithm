package Baekjoon;
import java.util.Scanner;

public class week1_10818 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int max = -1000000;
    int min = 1000000;

    int n = Integer.valueOf(sc.nextLine());
    String[] ns = sc.nextLine().split(" ");

    for (int i = 0; i < n; i++) {
      int num = Integer.valueOf(ns[i]);
      max = Math.max(max, num);
      min = Math.min(min, num);
    }

    System.out.println(min + " " + max);
    sc.close();
  }

}

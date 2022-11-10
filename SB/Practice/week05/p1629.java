package SB.Practice.week05;

import java.util.Scanner;

public class p1629 {
  // s1 곱셈
  static long C;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long A = sc.nextLong();
    long B = sc.nextLong();

    C = sc.nextLong();

    System.out.println(myPow(A, B));
  }

  private static long myPow(long a, long b) {

    // 지수가 1일 경우 a^1, a 그대로 리턴
    if (b == 1) {
      return a % C;
    }

    // 지수의 절반에 해당하는 a^(b/2) 구함
    long temp = myPow(a, b / 2);

    // 지수가 홀수라면 a 한 번 더 곱해줌
    if (b % 2 == 1) {
      return (temp * temp % C) * a % C;
    }
    return (temp * temp % C);
  }
}

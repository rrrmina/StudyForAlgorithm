package SB.Practice.week06;

import java.util.Scanner;

public class p13116 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      int A = sc.nextInt();
      int B = sc.nextInt();

      int min = Math.min(A, B);
      if (min == A)
      {
        while(true) {
          if(B - A < A) break;
          B/=2;
        }
      } else {
        while(true) {
          if(A - B < B) break;
          A/=2;
        }
      }

      while (A != B)
      {
        if (A > B)
        {
          A /= 2;
          if (A == B) break;
          B /= 2;
        }
        else {
          B /= 2;
          if (A == B) break;
          A /= 2;
        }
      }
      System.out.println(A*10);
    }
  }

}

// https://sohee-dev.tistory.com/3
package SB.Practice.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * week2_24053
 */
public class week2_24053 {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());

    long[] a = new long[n];
    long[] b = new long[n];

    String[] as = bf.readLine().split(" ");
    String[] bs = bf.readLine().split(" ");

    bf.close();

    for (int i = 0; i < n ; i++)
      a[i] = Long.parseLong(as[i]);

    for (int i = 0; i < n ; i++)
      b[i] = Long.parseLong(bs[i]);

    boolean run = true;

    if (Arrays.equals(a,b))
      run = false;

    long temp;

    if (run) {
      Loop1:
      for (int i = 1; i < n; i++) {
        Loop2:
        for (int j = i; j > 0; j--) {
          if (a[j] < a[j - 1]) {
            temp = a[j];
            a[j] = a[j - 1];
            // 이 부분에서 비교
            if (Arrays.equals(a, b)) {
              run = false;
              break Loop1;
            } else
            a[j - 1] = temp;
          } else
            break;
        }
        if (Arrays.equals(a, b)) {
          run = false;
          break Loop1;
        }
      }
    }

    if (run) {
      System.out.println(0);
    } else {
      System.out.println(1);
    }

//    long after = System.currentTimeMillis();
//
//    long diff = (after - before);
//    System.out.println(diff);


  }


}
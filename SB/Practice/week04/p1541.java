package SB.Practice.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1541 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] exp = br.readLine().split("-");

    int sum = 0;

    int num;

    for (int i = 0; i < exp.length; i++) {
      num = 0;
      try {
        num = Integer.parseInt(exp[i]);
      } catch (NumberFormatException e) {
        String[] plus = exp[i].split("\\+");
        for (int j = 0; j < plus.length; j++) {
          num += Integer.parseInt(plus[j]);
        }
      } finally {
        if (i == 0)
          sum += num;
        else
          sum -= num;
      }
    }

    System.out.println(sum);
  }

}

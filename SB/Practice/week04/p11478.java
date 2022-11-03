package SB.Practice.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class p11478 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] s = br.readLine().split("");
    StringBuilder sb = new StringBuilder();

    HashSet<String> set = new HashSet<>();

    for (int i = 0; i < s.length; i++) {

      for (int j = i; j < s.length; j++) {
        sb.setLength(0);
        int k = i;
        while (k <= j) {
          sb.append(s[k]);
          k++;
        }
        set.add(sb.toString());
      }
    }
    System.out.println(set.size());
  }

}

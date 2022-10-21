package SB.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p1620 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] str = br.readLine().split(" ");
    // 도감에 수록된 포켓몬의 수
    int n = Integer.parseInt(str[0]);
    // 맞춰야 할 문제의 갯수
    int m = Integer.parseInt(str[1]);

    Map numBook = new HashMap<Integer, String>();
    Map stringBook = new HashMap<String, Integer>();

    for (int i = 1; i <= n; i++) {
      String name = br.readLine();
      numBook.put(i, name);
      stringBook.put(name, i);
    }

    for (int i = 0; i < m; i++) {
      String problem = br.readLine();
        try {
          int num = Integer.parseInt(problem);
          System.out.println(numBook.get(num));
        } catch (NumberFormatException e) {
          System.out.println(stringBook.get(problem));
        }
    }
    br.close();
  }

}

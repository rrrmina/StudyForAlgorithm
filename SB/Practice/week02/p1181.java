package SB.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p1181 {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());

    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String line = bf.readLine();

      if (!list.contains(line))
        list.add(line);
    }

    list.sort((o1, o2) -> {
      if (o1.length() > o2.length())
        return 1;
      else if (o1.length() < o2.length())
        return -1;
      else {
        if (o1.compareTo(o2) < 0)
          return -1;
        else
          return 1;
      }
    });

    for (String s : list) {
      System.out.println(s);
    }
  }

}

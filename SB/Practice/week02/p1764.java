package SB.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class p1764 {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String[] str = bf.readLine().split(" ");
    // 듣도 못한 사람의 수
    int n = Integer.parseInt(str[0]);
    // 보도 못한 사람의 수
    int m = Integer.parseInt(str[1]);

    Set list = new HashSet<String>();
    List answer = new ArrayList<String>();

    for (int i = 0; i < n; i++) {
      list.add(bf.readLine());
    }

    for (int i = 0; i < m; i++) {
      String line = bf.readLine();
      if (list.contains(line))
        answer.add(line);
    }

    Collections.sort(answer);

    System.out.println(answer.size());

    answer.forEach(s -> {
      System.out.println(s);
    });


  }

}

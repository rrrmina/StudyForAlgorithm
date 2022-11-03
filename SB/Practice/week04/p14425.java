package SB.Practice.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p14425 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] nm = br.readLine().split(" ");
    int n = Integer.parseInt(nm[0]);
    int m = Integer.parseInt(nm[1]);

    List listS = new ArrayList<String>();

    for (int i = 0; i < n; i++) {
      listS.add(br.readLine());
    }

    int count = 0;

    for (int i = 0; i < m; i++) {
      String str = br.readLine();
      for (int j = 0; j < n; j++) {
        if (listS.get(j).toString().equals(str))
        {
          count++;
          break;
        }
      }
    }
    System.out.println(count);

  }

}

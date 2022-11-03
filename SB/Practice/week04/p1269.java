package SB.Practice.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class p1269 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] Nab = br.readLine().split(" ");
    int Na = Integer.parseInt(Nab[0]);
    int Nb = Integer.parseInt(Nab[1]);

    String[] a = br.readLine().split(" ");
    String[] b = br.readLine().split(" ");

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < Na; i++) {
      set.add(Integer.parseInt(a[i]));
    }

    int dup = 0;

    for (int i = 0; i < Nb; i++) {
      if (set.contains(Integer.valueOf(b[i])))
        dup++;
      else
        set.add(Integer.parseInt(b[i]));
    }

    System.out.println(set.size() - dup);
  }

}

package SB.Practice.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class p11399 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    List<Integer> times = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(
        Collectors.toList());

    Collections.sort(times);

    int sum = 0;

    for (int i = 0; i < times.size(); i++) {
      int j = 0;
      while(j <= i) {
        sum += times.get(j);
        j++;
      }
    }

    System.out.println(sum);
  }

}

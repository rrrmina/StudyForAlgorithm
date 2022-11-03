package SB.Practice.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class p1931 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    List<int[]> meeting = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String[] meet = br.readLine().split(" ");
      meeting.add(new int[]{Integer.parseInt(meet[0]), Integer.parseInt(meet[1])});
    }

    final int[] count = {0};

    meeting.sort(new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        if (o1[1] == o2[1]) {
          return o1[0] - o2[0];
        }
        return o1[1] - o2[1];
      }
    });




    final int[] time = {-1};

    meeting.forEach((o) -> {
      if (o[0] >= time[0]) {
        count[0]++;
        time[0] = o[1];
      }
    });
    System.out.println(count[0]);
  }

}

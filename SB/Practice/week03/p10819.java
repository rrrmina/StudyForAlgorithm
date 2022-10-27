package SB.Practice.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10819 {
  //https://nahwasa.com/entry/%EB%B0%B1%EC%A4%80-10819-%EC%9E%90%EB%B0%94-%EC%B0%A8%EC%9D%B4%EB%A5%BC-%EC%B5%9C%EB%8C%80%EB%A1%9C-BOJ-10819-JAVA
  static boolean[] visit;
  static int n;
  static int[] arr;
  static int answer = 0;


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(br.readLine());

    String[] str = br.readLine().split(" ");
    arr = new int[n];
    visit = new boolean[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }

    dfs(0, 0, 0);
    System.out.println(answer);

  }

  private static void dfs(int count, int before, int sum) {
    if (count == n){
      answer = Math.max(answer, sum);
      return;
    }

    for (int i = 0; i < n; i++) {
      if (visit[i])
        continue;
      visit[i] = true;
      dfs(count + 1, arr[i], count==0?0:sum+Math.abs(before - arr[i]));
      visit[i] = false;
    }
  }

}

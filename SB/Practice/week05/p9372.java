package SB.Practice.week05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9372 {

  // s4 상근이의 여행
  // 노드 N개가 있을 때 노드끼리 모두 연결되게 하기 위해서는 최소 N-1개의 간선 필요
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 테스트 케이스의 수
    int T = Integer.parseInt(br.readLine());

    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < T; i++) {
      // 국가의 수
      st = new StringTokenizer(br.readLine());
      int N = Integer.parseInt(st.nextToken());
      // 비행기의 종류
      int M = Integer.parseInt(st.nextToken());

      for (int j = 0; j < M; j++) {
        br.readLine();
      }
      sb.append((N - 1) + "\n");
    }
    System.out.println(sb.toString());
  }
}

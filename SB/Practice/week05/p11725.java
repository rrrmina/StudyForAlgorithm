package SB.Practice.week05;

import java.util.ArrayList;
import java.util.Scanner;

public class p11725 {

  // s2 트리의 부모 찾기
  static int N;
  static ArrayList<Integer>[] list;
  static int[] parents;
  static boolean[] check;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();

    list = new ArrayList[N + 1];
    parents = new int[N + 1];
    check = new boolean[N + 1];

    for (int i = 1; i <= N; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for (int i = 1; i < N; i++) {
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();

      list[n1].add(n2);
      list[n2].add(n1);
    }

    for (int i = 1; i <= N; i++) {
      if (!check[i]) {
        dfs(i);
      }
    }
    for (int i = 2; i <= N; i++) {
      System.out.println(parents[i]);
    }
  }

  private static void dfs(int node) {
    if (check[node])
      return;

    check[node] = true;
    for (Integer n : list[node]) {
      if (!check[n])
      {
        parents[n] = node;
        dfs(n);
      }
    }

  }
}

// https://log-laboratory.tistory.com/65
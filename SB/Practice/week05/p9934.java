package SB.Practice.week05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p9934 {
  // s1 완전 이진 트리
  static int K;
  static int[] order;
  static List<ArrayList<Integer>> nodes;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    K = sc.nextInt();
    int node_count = (int) (Math.pow(2, K)) - 1;
    order = new int[node_count];
    nodes = new ArrayList<>();

    for (int i = 0; i < node_count; i++) {
      order[i] = sc.nextInt();
    }

    for (int i = 0; i < K; i++) {
      nodes.add(new ArrayList<>());
    }

    get_root(0, node_count - 1, 0);

    for (int i = 0; i < K; i++) {
      for (int j : nodes.get(i)) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  private static void get_root(int start, int end, int depth) {
    if (depth == K)
      return;

    int root = (start + end) / 2;

    nodes.get(depth).add(order[root]);

    // left : start to (mid - 1)
    get_root(start, root - 1, depth + 1);
    // right : (root + 1) to end
    get_root(root + 1, end, depth + 1);
  }
}

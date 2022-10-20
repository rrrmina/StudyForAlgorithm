package SB.Practice.week00;


import java.util.Arrays;
import java.util.Scanner;

public class week1_2667 {
  private static int[][] map;
  private static boolean[][] visited;
  private static int apartNum;
  private static int[] aparts;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.valueOf(sc.nextLine());
    map = new int[n][n];
    visited = new boolean[n][n];
    apartNum = 0;
    aparts = new int[n * n];

    for (int i = 0; i < n; i++) {
      String[] line = sc.nextLine().split("");
      for (int j = 0; j < n; j++) {
        map[i][j] = Integer.valueOf(line[j]);
      }
    }
//    default false.........
//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < n; j++) {
//        visited[i][j] = false;
//      }
//    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (map[i][j] == 1 && !visited[i][j])
        {
          apartNum++;
          dfs(i, j, n);
        }
      }
    }
    System.out.println(apartNum);
    Arrays.sort(aparts);
    for (int apart : aparts) {
      if(apart != 0)
        System.out.println(apart);
    }

  }

  private static void dfs(int i, int j, int n) {
    int di[] = {0, 0, 1, -1};
    int dj[] = {1, -1, 0, 0};

    visited[i][j] = true;
    aparts[apartNum]++;

    for (int k = 0; k < 4; k++) {
      // 상하좌우 확인
      int ni = i + di[k];
      int nj = j + dj[k];

      if (ni >= 0 && nj >= 0 && ni < n && nj < n)
      {
        if (map[ni][nj] == 1 && !visited[ni][nj])
          dfs(ni, nj, n);
      }
    }
  }


}

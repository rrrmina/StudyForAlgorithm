package SB.Practice.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1, 2, 3 더하기
// https://dnf-lover.tistory.com/entry/%EB%B0%B1%EC%A4%80-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-9095%EB%B2%88-1-2-3-%EB%8D%94%ED%95%98%EA%B8%B0-DP-%EB%8B%A4%EC%9D%B4%EB%82%98%EB%AF%B9-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D-JAVA
public class p9095 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] array = new int[11];

    array[0] = 0;
    array[1] = 1;
    array[2] = 2;
    array[3] = 4;

    int a = 0;
    // 점화식 : array[n] = array[n - 1] + array[n - 2] + array[n - 3]
    for (int i = 0; i < n; i++) {
      a = Integer.parseInt(br.readLine());
      for (int j = 4; j <= a; j++) {
        array[j] = array[j - 1] + array[j - 2] + array[j - 3];
      }
      System.out.println(array[a]);
    }
  }
}

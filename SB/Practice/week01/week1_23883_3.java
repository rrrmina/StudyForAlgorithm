package Baekjoon.week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * week2_23883
 */
public class week2_23883_3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    long before = System.currentTimeMillis();

    Map<Integer, Integer> map = new TreeMap(Collections.reverseOrder());
    int arr[] = new int[n];

    for (int i = 0; i < n; i++) {
      // key : 주어진 수 , value : 원래 index
      int num = sc.nextInt();
      map.put(num, i);
      arr[i] = num;
    }

    map.keySet().stream().sorted();

    // 1, 2, 3, 4, 5, ...

    final int[] count = {0};
    final int[] i = {n - 1};

    //key = 최댓값의 인덱스
  try {
    map.forEach((key, value) -> {
      if (i[0] > 0) {
        if (arr[i[0]] != key) {
          count[0]++;
          if (count[0] == k) {
            System.out.println(
                Math.min(arr[i[0]], arr[value]) + " " + Math.max(arr[i[0]], arr[value]));
            throw new RuntimeException();
          }
          map.replace(arr[i[0]], value);
          int temp = arr[value];
          arr[value] = arr[i[0]];
          arr[i[0]] = temp;
        }
        i[0]--;
      }
    });
  } catch (Exception e){}

    if (count[0] < k) {
      System.out.println(-1);
    }

    long after = System.currentTimeMillis();

    long diff = (after - before);
    System.out.println(diff);
  }

}


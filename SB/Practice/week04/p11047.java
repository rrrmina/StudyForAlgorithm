package SB.Practice.week04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p11047 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] NK = br.readLine().split(" ");

    int n = Integer.parseInt(NK[0]);
    int k = Integer.parseInt(NK[1]);

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      stack.push(Integer.parseInt(br.readLine()));
    }

    int count = 0;
    int mod = k;

    while (mod > 0) {
      int num = stack.pop();
      count += (mod / num);
      mod %= num;
    }

    System.out.println(count);
  }

}

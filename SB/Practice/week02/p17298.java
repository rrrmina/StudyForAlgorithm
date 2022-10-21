package SB.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 오큰수
public class p17298 {

  //https://st-lab.tistory.com/196

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    Stack<Integer> stack = new Stack<>();

    int n = Integer.parseInt(bf.readLine());
    int[] element =  new int[n];

    StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

    for (int i = 0; i < n; i++) {
      element[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 0; i < n; i++) {
      while (!stack.isEmpty() && element[stack.peek()] < element[i]) {
        element[stack.pop()] = element[i];
      }
      stack.push(i);
    }

    while (!stack.isEmpty()) {
      element[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(element[i]).append(' ');
    }

    System.out.println(sb);
  }
}

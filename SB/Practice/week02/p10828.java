package SB.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p10828 {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      String line = bf.readLine();

      if (line.contains("push"))
      {
        int num = Integer.parseInt(line.split(" ")[1]);
        stack.push(num);
      } else if (line.equals("pop")) {
        if (stack.empty()) {
          System.out.println(-1);
        } else
          System.out.println(stack.pop());
      } else if (line.equals("size")) {
        System.out.println(stack.size());
      } else if (line.equals("empty")) {
        if (stack.empty()) {
          System.out.println(1);
        } else
          System.out.println(0);
      } else if (line.equals("top")) {
        if (stack.empty()) {
          System.out.println(-1);
        } else
          System.out.println(stack.peek());
      }
    }
  }

}

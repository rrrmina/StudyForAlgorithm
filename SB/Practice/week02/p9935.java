package SB.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 문자열 폭발
// https://loosie.tistory.com/317
public class p9935 {

  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String str = bf.readLine();
    String bomb = bf.readLine();

    int bombSize = bomb.length();

    StringBuilder sb = new StringBuilder();

    Stack<Character> st = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      st.push(str.charAt(i));

      if (st.size() >= bombSize) {
        boolean flag = true;

        for (int j = 0; j < bombSize; j++) {
          if (st.get(st.size() - bombSize + j) != bomb.charAt(j)) {
            flag = false;
            break;
          }
        }
        if (flag) {
          for (int j = 0; j < bombSize; j++) {
            st.pop();
          }
        }
      }
    }

    for (Character c : st) {
      sb.append(c);
    }
    System.out.println(sb.length()==0?"FRULA":sb.toString());
  }
}

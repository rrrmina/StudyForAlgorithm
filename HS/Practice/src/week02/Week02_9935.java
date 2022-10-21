package week02;

import java.io.*;
import java.util.Stack;

// 문자열 폭발 9935
public class Week02_9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();
        String s = br.readLine();
        String bomb = br.readLine();

        for (int i = s.length() - 1; i >= 0; i--) {
            stack.push(s.charAt(i));
            if (stack.size() >= bomb.length() && bomb.charAt(0) == stack.peek()) {
                boolean flag = true;
                for (int j = 1; j < bomb.length(); j++) {
                    if (stack.get(stack.size() - 1 - j) != bomb.charAt(j)) {
                        flag = false;
                    }
                }
                if (flag) {
                    for (int k = 0; k < bomb.length(); k++) {
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()) bw.write("FRULA");

        while (!stack.isEmpty()) {
            bw.write(stack.pop()+"");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

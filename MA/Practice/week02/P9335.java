package MA.Practice.week02;

import java.io.*;
import java.util.*;
// 문자열 폭발 https://www.acmicpc.net/problem/9935
public class P9335 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));

            if(stack.size() >= bomb.length()){
                boolean check = true;
                for(int j=0; j<bomb.length(); j++){
                    if (stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                if(check) {
                    for (int j = 0; j < bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack) {
            sb.append(ch);
        }
        System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
    }
}

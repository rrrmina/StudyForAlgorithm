package MA.Practice.week02;

import java.util.Scanner;
import java.util.Stack;
// 오큰수 https://www.acmicpc.net/problem/17298
public class P17298 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        int n = in.nextInt();
        int[] seq = new int[n];
        for(int i = 0; i < n; i++) {
            seq[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(seq[i]).append(' ');
        }
        System.out.println(sb);
    }
}

package MA.Practice.week02;

import java.util.Scanner;

public class P10828 {
    // 스택 https://www.acmicpc.net/problem/10828
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        stack = new int[n];
        StringBuilder sb = new StringBuilder();
        //String result = "";
        for(int i=0; i<n; i++) {
            String str = sc.next();
            switch(str) {
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    // result += pop() +'\n';
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    // result += size() +'\n';
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    // result += empty() +'\n';
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    // result += top()+'\n';
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    }
    public static int pop() {
        if(size == 0) return -1;
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }
    public static int size() {
        return size;
    }
    public static int empty() {
        if (size == 0) return 1;
        else return 0;
    }
    public static int top() {
        if(size == 0) return -1;
        else return stack[size - 1];
    }
}

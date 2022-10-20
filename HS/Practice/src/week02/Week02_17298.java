package week02;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


// 오큰수
public class Week02_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Stack<Integer> stack_tmp = new Stack<>();
        Stack<Integer> stack_res = new Stack<>();
        int[] arr = new int[n];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            while (!stack_tmp.isEmpty() && stack_tmp.peek() <= arr[i]) {
                stack_tmp.pop();
            }
            if(stack_tmp.isEmpty()) stack_res.push(-1);
            else if (stack_tmp.peek() > arr[i]) stack_res.push(stack_tmp.peek());
            else if (arr[i] < stack_res.peek()) stack_res.push(stack_res.peek());
            else stack_res.push(-1);
            stack_tmp.push(arr[i]);
        }

        while (!stack_res.isEmpty()) {
            bw.write(stack_res.pop()+" ");
        }
        bw.flush();
        stack_res.clear();
        bw.close();
        br.close();
    }
}

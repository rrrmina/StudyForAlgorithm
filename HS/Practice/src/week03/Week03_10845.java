package week03;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Week03_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int input = Integer.parseInt(br.readLine());
        int rear = 0;

        for (int i = 0; i < input; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    rear = Integer.parseInt(command[1]);
                    queue.offer(rear);
                    break;
                case "pop":
                    if(queue.isEmpty()) bw.write(-1 +"\n");
                    else bw.write(queue.poll()+"\n");
                    break;
                case "size":
                    if(queue.isEmpty()) bw.write(0+"\n");
                    else bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                case "front":
                    if(queue.isEmpty()) bw.write(-1 +"\n");
                    else bw.write(queue.peek()+"\n");
                    break;
                case "back":
                    if(queue.isEmpty()) bw.write(-1 +"\n");
                    else bw.write(rear+"\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}

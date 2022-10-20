package week02;


import java.io.*;

// 스택 10828
public class Week02_10828 {
    public static class ArrayStack {
        private int top;
        private int[] array;

        public ArrayStack(int maxSize) {
            this.top = -1;
            this.array = new int[maxSize];
        }

        public void push(int x) {
            array[++top] = x;
        }

        public int pop() {
            if (this.top == -1) return -1;
            else {
                int result = array[top];
                top--;
                return result;
            }
        }

        public int empty() {
            if (this.top == -1) return 1;
            else return 0;
        }

        public int top() {
            if(this.top == -1) return -1;
            else return array[top];
        }

        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) throws IOException, NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayStack as = new ArrayStack(n);

        for (int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            switch (command[0]) {
                case "push":
                    as.push(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    bw.write(as.pop() + "\n");
                    break;
                case "top":
                    bw.write(as.top() + "\n");
                    break;
                case "empty":
                    bw.write(as.empty() + "\n");
                    break;
                case "size":
                    bw.write(as.size() + "\n");
                    break;
            }
            bw.flush();
        }
        bw.close();
    }
}

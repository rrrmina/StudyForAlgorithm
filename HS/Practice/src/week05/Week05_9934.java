package week05;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 완전 이진 트리, 9934
public class Week05_9934 {
    static int k;
    static List<Integer> input;
    static List<List<Integer>> result;

    public static void main(String[] args) throws IOException {
        makeInput();
        inOrder(0, input.size() - 1, 0);
        makeOutput();
    }

    private static void makeOutput() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (List<Integer> list : result) {
            for (int i : list) {
                bw.write(i+" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    private static void inOrder(int start, int end, int level) {
        if (level == k) {
            return;
        }
        int mid = (start + end) / 2;
        result.get(level).add(input.get(mid));
        inOrder(start, mid - 1, level + 1);
        inOrder(mid + 1, end, level + 1);
    }

    private static void makeInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        input = new ArrayList<>();
        while (st.hasMoreTokens()) {
            input.add(Integer.valueOf(st.nextToken()));
        }

        result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(new ArrayList<>());
        }
    }
}

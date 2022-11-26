package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Week06_1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<List<String>> input = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            input.add(new ArrayList<>());
        }

        for (int i = 0; i < n + 1; i++) {
            input.add(Arrays.asList(br.readLine().split(" ")));
        }
    }
}

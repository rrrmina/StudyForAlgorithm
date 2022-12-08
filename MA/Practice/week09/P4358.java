package MA.Practice.week09;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class P4358 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int cnt = 0;
        Map<String, Integer> tree = new HashMap<>();
        while ((s = br.readLine()) != null) {
            cnt++;
            if (tree.containsKey(s)) tree.put(s, tree.get(s) + 1);
            else tree.put(s, 1);
        }
        List<String> result = tree.keySet().stream().collect(Collectors.toList());
        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for (String str : result) {
            int count = tree.get(str) * 100;
            sb.append(str).append(" ").append(String.format("%.4f", (double) count / (double) cnt)).append('\n');
        }
        System.out.print(sb);
    }
}


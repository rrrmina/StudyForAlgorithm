package week02;

import java.io.*;
import java.util.*;

// 듣보잡 1764
public class Week02_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            list.add(a);
            set.add(a);
        }
        for (int i = 0; i < m; i++) {
            String b = br.readLine();
            list.add(b);
            set.add(b);
        }

        List<String> list_set = new ArrayList<>(set);
        Collections.sort(list_set);
        Collections.sort(list);

        bw.write(list.size() - list_set.size() + "\n");
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                bw.write(list.get(i)+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

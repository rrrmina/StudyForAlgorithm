package week09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 정보 상인 호석
public class Week09_22252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        long q = Integer.parseInt(br.readLine());
        long sum = 0;
        HashMap<String, PriorityQueue<Integer>> monkey = new HashMap<>();

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            int count = Integer.parseInt(st.nextToken());

            if (type == 1) {
                for (int j = 0; j < count; j++) {
                    if (!monkey.containsKey(name)) {
                        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                        pq.add(Integer.valueOf(st.nextToken()));
                        monkey.put(name, pq);
                    } else {
                        monkey.get(name).add(Integer.parseInt(st.nextToken()));
                    }
                }
            } else {
                if (monkey.get(name) == null) {
                    continue;
                }
                while(!monkey.get(name).isEmpty() && count > 0) {
                    sum += monkey.get(name).poll();
                    count--;
                }

            }
        }
        System.out.println(sum);
    }
}

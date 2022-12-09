package MA.Practice.week09;

import java.io.*;
import java.util.*;

public class P22252 {
    static int code;
    static String name;
    static int cnt;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        Map<String, PriorityQueue<Integer>> map = new HashMap<>();
        long result = 0;

        for(int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            code = Integer.parseInt(st.nextToken());
            name = st.nextToken();
            cnt = Integer.parseInt(st.nextToken());
            if(code == 1) {
                for(int j = 0; j < cnt; j++) {
                    if(!map.containsKey(name)) { // 새로운 고릴라 경우
                        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                        pq.add(Integer.parseInt(st.nextToken()));
                        map.put(name, pq);
                    } else {
                        map.get(name).add(Integer.parseInt(st.nextToken()));
                    }
                }
            } else {
                if(map.get(name) == null) continue;
                while(!map.get(name).isEmpty() && cnt > 0) {
                    result += map.get(name).poll();
                    cnt--;
                }
            }
        }
        System.out.println(result);
    }
}

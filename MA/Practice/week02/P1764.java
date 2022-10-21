package MA.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;
// 듣보잡 https://www.acmicpc.net/submit/1764
public class P1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> listen = new HashSet<>();
        for (int i = 0; i < n; i++) listen.add(br.readLine());


        ArrayList<String> ls = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String see = br.readLine();
            if(listen.contains(see)) ls.add(see);
        }

        Collections.sort(ls);

        System.out.println(ls.size());
        for (String s : ls) System.out.println(s);


// HashSet의 contains()는 O(1), ArrayList의 contains()는 O(n)
        /*String[] listen = new String[n];
        String[] see = new String[m];

        for(int i=0; i<n; i++) listen[i] = br.readLine();
        for(int i=0; i<m; i++) see[i] = br.readLine();
        ArrayList<String> ls = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(listen[i].equals(see[j])) ls.add(listen[i]);
            }
        }
        Collections.sort(ls);
        System.out.println(ls.size());
        for(String s : ls) System.out.println(s);*/
    }
}

package MA.Practice.week04;
// 문자열 집합 https://www.acmicpc.net/problem/14425
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> s = new HashSet<>();
        for(int i=0; i<n; i++) s.add(br.readLine());
        String[] strings = new String[m];
        for(int i=0; i<m; i++) strings[i] = br.readLine();
        int cnt = 0;
        for(String str : strings){
            if(s.contains(str)) cnt++;
        }
        System.out.println(cnt);
    }
}

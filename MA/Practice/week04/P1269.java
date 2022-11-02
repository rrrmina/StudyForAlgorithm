package MA.Practice.week04;
// 대칭 차집합 https://www.acmicpc.net/problem/1269
import java.util.*;
import java.io.*;

public class P1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        HashSet<String> mapA = new HashSet<>();
        HashSet<String> mapB = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++) mapA.add(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++) mapB.add(st.nextToken());

        int cnt = 0;

        for(String s : mapA){
            if(!mapB.contains(s)) cnt++;
        }
        for(String s : mapB){
            if(!mapA.contains(s)) cnt++;
        }
        System.out.println(cnt);
    }
}

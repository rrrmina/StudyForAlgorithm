package MA.Practice.week02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
// 포켓몬 마스터 https://www.acmicpc.net/problem/1620
public class P1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> pokemon_int = new HashMap<>();
        HashMap<String, Integer> pokemon_str = new HashMap<>();

        for (int i=1; i<n+1; i++) {
            String s = br.readLine();
            pokemon_str.put(s, i);
            pokemon_int.put(i, s);
        }

        StringBuilder sb = new StringBuilder();

        for (int i=1; i<m+1; i++) {
            String str = br.readLine();
           if(checkType(str)) sb.append(pokemon_int.get(Integer.parseInt(str))).append('\n');
           else sb.append(pokemon_str.get(str)).append('\n');
        }
        System.out.println(sb);
    }

    public static boolean checkType(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
// https://minaminaworld.tistory.com/m/80
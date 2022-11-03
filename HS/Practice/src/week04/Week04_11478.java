package week04;

import java.io.*;
import java.util.HashSet;

// 서로 다른 부분 문자열의 개수
public class Week04_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();

        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            String name = "";
            for (int j = i; j < input.length(); j++) {
                name += (input.substring(j, j + 1));
                hs.add(name);
            }
        }
        bw.write(hs.size() + "");
        bw.flush();
        bw.close();
    }
}

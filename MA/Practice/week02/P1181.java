package MA.Practice.week02;

import java.io.*;
import java.util.*;
// 단어 정렬 https://www.acmicpc.net/problem/1181
public class P1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strings = new String[n];
        for(int i=0; i<n; i++) strings[i] = br.readLine();
        String temp = "";

        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing(String::length));
        for(int i = 0; i<strings.length; i++) {
            if(temp.equals(strings[i])) {
            }
            else {
                System.out.println(strings[i]);
                temp = strings[i];
            }
        }
    }
}
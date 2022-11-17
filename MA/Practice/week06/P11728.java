package MA.Practice.week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr1.add(Integer.valueOf(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) arr2.add(Integer.valueOf(st.nextToken()));

        arr1.addAll(arr2);
        Collections.sort(arr1);

        for(int i : arr1) sb.append(i).append(" ");

        System.out.println(sb);

    }
}
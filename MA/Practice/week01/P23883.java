package MA.Practice.week01;

import java.io.*;
import java.util.*;

// 알고리즘 수업 - 선택 정렬 3 https://www.acmicpc.net/problem/23883
public class P23883 {
    static int n,k,count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        long[] A = new long[n];
        st = new StringTokenizer(br.readLine());
        HashMap<Long, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(st.nextToken());
            map.put(A[i], i);
        }

        long[] sortedA = A.clone();
        Arrays.sort(sortedA);
        sort(A, sortedA, map);
    }

    private static void sort(long[] A, long[] S, HashMap map) {
        for(int i=n-1; i>0; i--){
            int max = (int)map.get(S[i]);
            if(max<i){
                long temp = A[max];
                A[max] = A[i];
                A[i] = temp;
                map.put(A[max], max);
                count++;
                if(k==count) {
                    System.out.println(A[max]+" "+A[i]);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
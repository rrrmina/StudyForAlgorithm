package MA.Practice.week01;

import java.util.LinkedList;
import java.util.Scanner;

// 회전하는 큐 https://www.acmicpc.net/problem/1021
public class P1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            list.add(i);
        }

        int[] select = new int[m];
        for(int i = 0; i < m; i++) {
            select[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < m; i++) {
            int target_idx = list.indexOf(select[i]);
            int half_idx;
            if(list.size() % 2 == 0) half_idx = list.size()/2 - 1;
            else half_idx = list.size()/2;
            if(target_idx <= half_idx) {
                for(int j = 0; j < target_idx; j++) {
                    int temp = list.pollFirst();
                    list.offerLast(temp);
                    count++;
                }
            } else {
                for(int j = 0; j < list.size() - target_idx; j++) {
                    int temp = list.pollLast();
                    list.offerFirst(temp);
                    count++;
                }

            }
            list.pollFirst();
        }
        System.out.println(count);
    }
}

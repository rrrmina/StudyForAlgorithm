package Baekjoon.week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * week2_23968
 */
public class week2_23968 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nk = sc.nextLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] list = Arrays.stream(sc.nextLine().split(" "))
            .mapToInt(i -> Integer.parseInt(i)).toArray();

        int cnt = 0;

        for (int i = 0; i + 1 < n; i++) {
            for (int j = 0 ; j + 1 < n; j++) {
                if (list[j] > list[j + 1]) {
                    cnt++;
                    if (cnt == k) {
                        System.out.println(list[j + 1] + " " + list[j]);
                    }
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        if (cnt < k) {
            System.out.println(-1);
        }


    }


}
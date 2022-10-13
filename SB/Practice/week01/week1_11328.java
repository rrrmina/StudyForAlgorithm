package Baekjoon.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * week2_11328
 * Strfry
 */
public class week2_11328 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Boolean eq = true;

        int n = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] strs = sc.nextLine().split(" ");

            String[] s1 = strs[0].split("");
            String[] s2 = strs[1].split("");

            Arrays.sort(s1);
            Arrays.sort(s2);

            for (int j = 0; j < s1.length; j++) {
                if (!s1[j].equals(s2[j])) {
                    eq = false;
                    break;
                }
            }
            if (eq)
                System.out.println("Possible");
            else
                System.out.println("Impossible");

            eq = true;
        }
        sc.close();
    }
    
}
package Baekjoon.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * week2_5597
 * 과제 안 내신 분..?
 */
public class week2_5597 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList list = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            list.add(i);
        }

        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            list.remove(Integer.valueOf(num));
        }

        Collections.sort(list);

        list.forEach(i -> System.out.println(i));
    }

}
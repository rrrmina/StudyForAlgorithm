package MA.Practice.week00;

import java.util.Scanner;
// 나는 요리사다 https://www.acmicpc.net/problem/2953
public class P2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0;
        int winner = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i] += sc.nextInt();
            }
            if (arr[i] > max) {
                max = arr[i];
                winner = i;
            }
        }
        System.out.println((winner+1) + " " + max);
    }
}

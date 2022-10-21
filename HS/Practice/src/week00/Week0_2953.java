package week00;

import java.util.Scanner;

public class Week0_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][4];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 4; j++)
                arr[i][j] = sc.nextInt();

        int max = 0;
        int winner = -1;
        for (int i = 0; i < 5; i++) {
            int score = 0;
            for (int j = 0; j < 4; j++) {
                score += arr[i][j];
            }
            if(score > max) {
                max = score;
                winner = i + 1;
            }
        }
        System.out.println(winner+"\n"+max);
    }
}

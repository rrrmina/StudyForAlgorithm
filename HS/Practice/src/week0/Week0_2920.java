package week0;

import java.util.Arrays;
import java.util.Scanner;

public class Week0_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ascArr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] descArr = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] inputArr = new int[8];
        for (int i = 0; i < 8; i++)
            inputArr[i] = sc.nextInt();
        if(Arrays.equals(ascArr, inputArr)) System.out.println("ascending");
        else if(Arrays.equals(descArr, inputArr)) System.out.println("descending");
        else System.out.println("mixed");
    }
}

package week0;

import java.util.Arrays;
import java.util.Scanner;

public class Week0_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        System.out.println(max +"\n"+ index);
    }
}

package week1;

import java.util.Arrays;
import java.util.Scanner;

public class Week1_24053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        for (int i = 0; i < n; i++)
            aArr[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            bArr[i] = sc.nextInt();

        int a = -1;
        for (int i = 1; i < n; i++) {
            int target = aArr[i];
            int j = i-1;

            while (j >= 0 && target < aArr[j]) {
                aArr[j + 1] = aArr[j];
                j--;
                if (Arrays.equals(aArr, bArr)){
                    a = 1;
                    break;
                }
                else a = 0;
            }
            aArr[j+1] = target;
        }
        System.out.println(a);
    }
}

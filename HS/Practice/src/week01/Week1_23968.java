package week01;

import java.util.Scanner;

public class Week1_23968 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int temp = -1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1] > arr[j]) {
                    count++;
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    if (count == limit)
                        System.out.println(arr[j - 1] + " " + arr[j]);
                }
            }
        }
        if (count < limit) System.out.println(-1);
    }
}

package week01;

import java.util.Scanner;

public class Week1_23883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int count = 0;
        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;

            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
            if(count == limit) System.out.println(arr[i]+" "+arr[min_index]);
        }
        if (count < limit)
            System.out.println(-1);
    }
}

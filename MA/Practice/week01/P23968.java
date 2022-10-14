package MA.Practice.week01;

import java.util.Scanner;

// 알고리즘 수업 - 버블 정렬 1 https://www.acmicpc.net/problem/23968
public class P23968 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    cnt++;
                    if(cnt==k) {
                        System.out.println(array[j+1]+" "+array[j]); // 비교 필요없음
                        break;
                    }
                }
            }
        }
        if(cnt<k) System.out.println(-1);
    }
        private static void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }



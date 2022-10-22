package MA.Practice.week01;

import java.util.Arrays;
import java.util.Scanner;

// 알고리즘 수업 - 삽입 정렬 3 https://www.acmicpc.net/problem/djd24053
public class P24053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long[] A = new Long[n];
        Long[] B = new Long[n];
        boolean check = false;

        for (int i = 0; i < n; i++) A[i] = sc.nextLong();
        for (int i = 0; i < n; i++) B[i] = sc.nextLong();

        for(int i = 1; i < n; i++) {
            if(Arrays.equals(A,B)) {
                check = true;
                System.out.println(1);
                break;
            }
            Long target = A[i];
            int j = i - 1;
            while(j >= 0 && target < A[j]) {
                A[j + 1] = A[j];
                j--;
                if(Arrays.equals(A,B)) {
                    check = true;
                    System.out.println(1);
                    break;
                }
            }
            A[j + 1] = target;
            if(Arrays.equals(A,B)) {
                check = true;
                System.out.println(1);
                break;
            }

        }
        if(!check) System.out.println(0);
    }
}

   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        boolean check = false;

        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        for (int i = 0; i < n; i++) B[i] = sc.nextInt();

        for(int i = 1; i < n; i++) {
            int target = A[i];
            int j = i - 1;
            while(j >= 0 && target < A[j]) {
                A[j + 1] = A[j];
                j--;
                check = check(A, B);
                if(check){
                    System.out.println(1);
                    break;
                }
            }
            A[j + 1] = target;

        }
         if(!check) System.out.println(0);
    }
    private static boolean check(int[] a, int[] b){
        if(Arrays.equals(a,b)) return true;
        else return false;
    }
}
*/


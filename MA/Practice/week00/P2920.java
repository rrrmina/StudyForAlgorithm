package MA.Practice.week00;

import java.util.*;
// 음계 https://www.acmicpc.net/problem/2920
public class P2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i=0; i<8; i++) arr[i] = sc.nextInt();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] d = {8, 7, 6, 5, 4, 3, 2, 1};
        if(Arrays.equals(arr, a)) System.out.println("ascending");
        else if(Arrays.equals(arr, d)) System.out.println("descending");
        else System.out.println("mixed");
        /*String str = "";
        for(int i=0; i<8; i++) str += sc.nextInt();
        System.out.println(str);
        if (str.equals("12345678")) System.out.println("ascending");
        else if(str.equals("87654321")) System.out.println("descending");
        else System.out.println("mixed");*/
        }
    }

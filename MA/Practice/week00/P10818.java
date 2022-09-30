package MA.Practice.week00;

import java.util.Scanner;
// 최소, 최대 https://www.acmicpc.net/problem/10818
public class P10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        sc.close();
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println(min +" "+max);
    }
}

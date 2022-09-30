package MA.Practice.week00;

import java.util.Scanner;
// 최댓값 https://www.acmicpc.net/problem/2562
public class P2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0; i<9; i++) arr[i] = sc.nextInt();
        int idx = 0;
        int max = arr[0];
        for(int i=0; i<9; i++){
            if(arr[i]>max){
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
        }
}

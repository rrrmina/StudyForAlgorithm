package MA.Practice.week00;

import java.util.Scanner;
// 알파벳 찾기 https://www.acmicpc.net/problem/10809
public class P10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++) arr[i]=-1;
        String str = sc.next();
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(arr[chars[i]-'a']==-1){
                arr[chars[i]-'a'] = i;
            }
        }
        for(int a : arr) {
            System.out.print(a + " "); // 마지막 공백 여부 조심
        }
    }
}

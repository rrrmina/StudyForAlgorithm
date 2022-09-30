package MA.Practice.week00;

import java.util.Scanner;
// OX퀴즈 https://www.acmicpc.net/problem/8958
public class P8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = new String[sc.nextInt()];
        for(int i=0; i<strs.length; i++) {
            strs[i] = sc.next();
        }
        for(int i=0; i<strs.length; i++) {
            int sum = 0;
            int score = 0;
            for(int j=0; j<strs[i].length(); j++){
                if(strs[i].charAt(j) == 'O'){
                    score++;
                    sum += score;
                }else {
                    score = 0;
                }
            }
            System.out.println(sum);
        }
    }
}

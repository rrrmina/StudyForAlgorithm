package MA.Practice.week01;
// 과제 안 내신 분..? https://www.acmicpc.net/problem/5597

import java.util.*;

public class P5997 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[28];
        for(int i=0; i<students.length; i++){
            students[i] = sc.nextInt();
        }
        boolean[] check = new boolean[30];
        for(int student : students){
            check[student-1] = true;
        }
        for(int i=0; i<check.length; i++){
            if(!check[i]) System.out.println(i+1);
        }
    }
}

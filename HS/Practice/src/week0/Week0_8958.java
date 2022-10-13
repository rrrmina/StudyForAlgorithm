package week0;

import java.util.Scanner;

public class Week0_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            int num = 1;
            int sum = 0;
            char[] charArr = arr[i].toCharArray();
            for (int j = 0; j < charArr.length; j++) {
                if (charArr[j] == 'O') {
                    sum += num;
                    num++;
                } else num = 1;
            }
            System.out.println(sum);
        }
    }
}

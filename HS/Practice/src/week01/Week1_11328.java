package week01;

import java.util.*;

public class Week1_11328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[sc.nextInt()][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.next();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            List<String> list1 = Arrays.asList(arr[i][0].split(""));
            List<String> list2 = Arrays.asList(arr[i][1].split(""));
            Collections.sort(list1);
            Collections.sort(list2);

            if (list1.equals(list2)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }

    }
}

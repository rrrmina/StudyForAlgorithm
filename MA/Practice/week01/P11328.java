package MA.Practice.week01;
// Strfry https://www.acmicpc.net/problem/11328

import java.util.*;

public class P11328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] check = new boolean[n];
        for(int i=0; i<n; i++) {
            //strings = sc.nextLine().split(" ", 2);
            String string1 = sc.next();
            String string2 = sc.next();
            char[] c1 = string1.toCharArray();
            char[] c2 = string2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            string1 = String.valueOf(c1);
            string2 = String.valueOf(c2);
            if (string1.equals(string2)) check[i] = true;
        }
        for(boolean b : check) System.out.println(b ? "Possible" : "Impossible");
    }
}

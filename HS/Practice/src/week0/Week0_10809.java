package week0;

import java.util.Scanner;

public class Week0_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        String s = sc.next();
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (alphabet[i] == s.charAt(j)) {
                    System.out.print(j + " ");
                    break;
                }
                if (j == s.length() - 1 && alphabet[i] != s.charAt(j))
                    System.out.print(-1 + " ");
            }
        }
    }
}

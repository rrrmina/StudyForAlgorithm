package week01;

import java.util.*;

public class Week1_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> student = new ArrayList<>();
        for (int i = 0; i < 28; i++)
            student.add(sc.nextInt());
        Collections.sort(student);
        for (int i = 1; i <= 30; i++)
            if (student.contains(i) == false)
                System.out.println(i);
    }
}

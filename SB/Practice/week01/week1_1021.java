package SB.Practice.week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * week2_1021
 * 회전하는 큐
 */
public class week2_1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // list : 뽑아내려고 하는 수의 위치 리스트
        List<Integer> list = new ArrayList<>();

        //n : 큐의 크기, m : 뽑아내려고 하는 수의 개수
        String[] str = sc.nextLine().split(" ");
        int n = Integer.valueOf(str[0]);
        int m = Integer.valueOf(str[1]);

        Arrays.stream(sc.nextLine().split(" "))
            .forEach(s -> list.add(Integer.valueOf(s)));

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        for (int j = 1; j <= n; j++)
            linkedList.add(j);

        int count = 0;

        for (int i = 0; i < m; i++) {

            int index = linkedList.indexOf(list.get(i));

            //index가 n/2보다 크면 3번, 작으면 2번
            float size = linkedList.size() / 2;
            if (index > size)
            {
                while (linkedList.getFirst() != list.get(i)) {
                    linkedList.addFirst(linkedList.removeLast());
                    count++;
                }
            }
            else {
                while (linkedList.getFirst() != list.get(i)) {
                    linkedList.addLast(linkedList.removeFirst());
                    count++;
                }
            }
            linkedList.pop();
        }

        System.out.println(count);
        sc.close();
    }
}
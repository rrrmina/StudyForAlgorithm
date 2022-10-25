package MA.Practice.week03;
// 카드2 https://www.acmicpc.net/problem/2164

import java.util.*;

public class P2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> card = new LinkedList<>();
        for(int i=1; i<=n; i++){
            card.add(i);
        }
        while (card.size()>1){
            card.poll();
            card.add(card.poll());
        }
        System.out.println(card.element());
    }
}

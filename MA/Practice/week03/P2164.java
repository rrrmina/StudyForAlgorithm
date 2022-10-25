package MA.Practice.week03;

import java.util.*;

public class P2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> card = new LinkedList<>();

        //if(n==1) System.out.println(1);

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

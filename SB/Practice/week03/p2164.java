package SB.Practice.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class p2164 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int num = Integer.parseInt(br.readLine());

    List cards = new LinkedList<Integer>();

    for (int i = 1; i <= num; i++) {
      cards.add(i);
    }

    while (cards.size() > 1){
      cards.remove(0);
      int card = (Integer) cards.remove(0);
      cards.add(card);
    }
    System.out.println(cards.get(0));
  }

}

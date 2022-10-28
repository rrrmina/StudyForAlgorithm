package SB.Practice.week03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p10845 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());

    List queue = new ArrayList<Integer>();

    for (int i = 0; i < n; i++) {
      String line = br.readLine();

      try {
        // split 가능할 시 무조건 push 명령
        int pushNum = Integer.parseInt(line.split(" ")[1]);
        queue.add(pushNum);
        // split 안 되면 나머지 명령 실행
      } catch (ArrayIndexOutOfBoundsException e) {
        if (line.equals("pop")){
          if (!queue.isEmpty()) {
            sb.append(queue.remove(0));
          }
          else {
            sb.append("-1");
          }
        } else if (line.equals("size")) {
          sb.append(queue.size());
        } else if (line.equals("empty")) {
          if (queue.isEmpty()) {
            sb.append("1");
          } else {
            sb.append("0");
          }
        } else if (line.equals("front")) {
          if (!queue.isEmpty()) {
            sb.append(queue.get(0));
          } else {
            sb.append("-1");
          }
        } else if (line.equals("back")) {
          if (!queue.isEmpty()) {
            sb.append(queue.get(queue.size() - 1));
          } else {
            sb.append("-1");
          }
        }
        sb.append("\n");
      }
    }
    System.out.println(sb.toString());
  }

}

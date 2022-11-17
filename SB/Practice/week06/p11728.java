package SB.Practice.week06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class p11728 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] NMs = br.readLine().split(" ");
    int N = Integer.parseInt(NMs[0]);
    int M = Integer.parseInt(NMs[1]);

    int[] result = new int[N+M];

    String[] A = br.readLine().split(" ");

    int index = 0;

    for (int i = 0; i < N; i++) {
      result[index++] = Integer.parseInt(A[i]);
    }

    String[] B = br.readLine().split(" ");
    for (int j = 0; j < M; j++) {
      result[index++] = Integer.parseInt(B[j]);
    }

    Arrays.sort(result);

    for (Integer i : result) {
      bw.write(String.valueOf(i) + " ");
    }
    bw.flush();
    bw.close();
  }

}

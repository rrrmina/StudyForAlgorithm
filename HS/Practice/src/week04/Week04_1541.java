package week04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// 잃어버린 괄호
public class Week04_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        String[] arr = br.readLine().split("-");
        for (int i = 0; i < arr.length; i++) {
            String[] subArr = arr[i].split("[+]");
            int temp = 0;
            for (int j = 0; j < subArr.length; j++) {
                temp += Integer.parseInt(subArr[j]);
            }
            list.add(temp);
        }

        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result -= list.get(i);
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}

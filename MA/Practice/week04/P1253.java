package MA.Practice.week04;
import java.util.*;
import java.io.*;
public class P1253 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(numbers);
        int result = 0;
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (true) {
                if (left == i) left++;
                else if (right == i) right--;
                if (left >= right) break;
                if (numbers[left] + numbers[right] > numbers[i]) right--;
                else if (numbers[left] + numbers[right] < numbers[i]) left++;
                else {
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}

package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 스타트와 링크
public class Week10_14889 {
    static int n;
    static boolean[] visited; // 팀을 true/false 로 나누기 위함
    static int[][] map;
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n];
        min = 1000000;

        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < temp.length; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }
        combi(0, 0);
        System.out.println(min);
    }

    // 조합 생성
    private static void combi(int index, int depth) {
        if (depth == n / 2) {
            diff();
            return;
        }
        for (int i = index; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combi(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    // 두 팀의 능력치 차이를 계산하는 함수
    private static void diff() {
        int start = 0;
        int link = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // true/false로 나뉘어진 조합에 따라 start/link 팀으로 나눈다
                if (visited[i] == true && visited[j] == true) {
                    start += map[i][j];
                    start += map[j][i];
                } else if (visited[i] == false && visited[j] == false) {
                    link += map[i][j];
                    link += map[j][i];
                }
            }
        }
        int val = Math.abs(start - link);
        if (val == 0) {
            System.out.println(val);
            System.exit(0);
        }
        min = Math.min(val, min);
    }
}

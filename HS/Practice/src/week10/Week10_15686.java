package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 치킨 배달
// 치킨집 m개를 골라 도시의 치킨 거리가 가장 작게 되게 하는 프로그램
public class Week10_15686 {
    static int n;
    static int m;
    static int[][] map;
    static ArrayList<Node> person;
    static ArrayList<Node> chicken;
    static int min = Integer.MAX_VALUE;
    static boolean[] open;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        person = new ArrayList<>();
        chicken = new ArrayList<>();

        // 집과 치킨집의 좌표를 각각 list에 저장한다.
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 1) {
                    person.add(new Node(i, j));
                } else if (map[i][j] == 2) {
                    chicken.add(new Node(i, j));
                }
            }
        }
        open = new boolean[chicken.size()];

        dfs(0, 0);
        System.out.println(min);

    }

    private static void dfs(int start, int count) {
        if (count == m) {
            int result = 0;
            for (int i = 0; i < person.size(); i++) {
                int temp = Integer.MAX_VALUE;
                // 어떤 집과 open한 치킨집의 거리를 비교하여 최소 거리 구하기
                for (int j = 0; j < chicken.size(); j++) {
                    if (open[j]) {
                        int distance = Math.abs(person.get(i).x - chicken.get(j).x)
                                + Math.abs(person.get(i).y - chicken.get(j).y);
                        temp = Math.min(temp, distance);
                    }
                }
                result += temp; // 모든 집의 치킨 거리 누적
            }
            min = Math.min(min, result);
            return;
        }

        for (int i = start; i < chicken.size(); i++) {
            open[i] = true;
            dfs(i + 1, count + 1);
            open[i] = false;
        }
    }
}
class Node{
    int x;
    int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

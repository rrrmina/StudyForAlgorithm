package Baekjoon.week2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * week2_3190
 * 뱀새끼
 */
public class week2_3190 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int board_size = Integer.valueOf(sc.nextLine());
        int apple_count = Integer.valueOf(sc.nextLine());

        int[][] board = new int[board_size][board_size];

        //board 0으로 초기화
        for (int i = 0; i < board_size; i++) {
            for (int j = 0; j < board_size; j++) {
                board[i][j] = 0;
            }
        }

        //board에 사과(1) 표시
        for (int i = 0; i < apple_count; i++) {
            String[] apple = sc.nextLine().split(" ");
            board[Integer.valueOf(apple[0]) - 1][Integer.valueOf(apple[1]) - 1] = 1;
        }

        int dir_count = Integer.valueOf(sc.nextLine());

        String[][] dir_info = new String[dir_count][2];

        //dir_info 저장
        for (int i = 0; i < dir_count; i++) {
            String[] di = sc.nextLine().split(" ");
            for (int j = 0; j < 2; j++) {
                dir_info[i][j] = di[j];
            }
        }

        int sec = 0;
        int i = 0;
        int j = 0;
        int sec_count = 0;
        // j++(R), i++(D), j--(L), i--(U)
        int flag[] = {1, 1, -1, -1};
        int flag_index = 0;
        int max_sec;

        LinkedList<int[]> snake = new LinkedList<>();
        // 첫 시작 0,0
        snake.add(new int[]{i,j});

        // 벽에 부딪힐 때까지
        while (i < board_size && j < board_size && i > -1 && j > -1)
        {
            if (sec_count < dir_info.length)
                max_sec = Integer.valueOf(dir_info[sec_count][0]);
            else
                max_sec = 0;

            if (flag_index == 0 || flag_index == 2) {
                while (j < board_size && max_sec != sec) {
                    //j 증감
                    j = j + flag[flag_index];
                    if (j == -1 || j == board_size)
                        break;
                    //뱀에 닿았는지 체크
                    if (is_in_snake(i, j, snake)) {
                        j = board_size;
                        break;
                    }
                    else {
                        if (board[i][j] == 1) {
                            //사과 냠냠 + snake size 증가
                            board[i][j] = 0;
                            snake.add(new int[]{i, j});
                        } else {
                            snake.add(new int[]{i, j});
                            snake.removeFirst();
                        }
                        sec++;
                    }
                }
            } else if (flag_index == 1 || flag_index == 3) {
                // i 증감
                while (i < board_size && max_sec != sec) {
                    i = i + flag[flag_index];
                    if (i == -1 || i == board_size)
                        break;
                    // 뱀에 닿았는지 체크
                    if (is_in_snake(i, j, snake)) {
                        i = board_size;
                        break;
                    }
                    else {
                        if (board[i][j] == 1) {
                            //사과 냠냠 + snake size 증가
                            board[i][j] = 0;
                            snake.add(new int[]{i, j});
                        } else {
                            snake.add(new int[]{i, j});
                            snake.removeFirst();
                        }
                        sec++;
                    }
                }
            }
            // dir_info의 초 정보가 sec와 같으면
            while (sec_count < dir_info.length
                && Integer.valueOf(dir_info[sec_count][0]) == sec)
            {
                if (dir_info[sec_count][1].equals("L")) {
                    // 왼쪽으로 turn
                    if (flag_index == 0)
                        flag_index = 3;
                    else
                        flag_index -= 1;
                }
                else if (dir_info[sec_count][1].equals("D")) {
                    // 오른쪽으로 turn
                    if (flag_index == 3)
                        flag_index = 0;
                    else
                        flag_index += 1;
                }
                sec_count++;
            }
        }
        System.out.println(sec + 1);
    }

    private static boolean is_in_snake(int i, int j, LinkedList<int[]> snake) {
        for (int[] iarray : snake) {
            if (iarray[0] == i && iarray[1] == j) {
                return true;
            }
        }
        return false;
    }

}
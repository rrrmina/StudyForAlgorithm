from collections import deque


_ = None
N = _
K = _
L = _
time_count = 0
empty = 0
apple_exist = 1
board = list()
rotate_info = list()
rotate_info_index = 0
right, bottom, left, top = 1, 2, 3, 4

class snake_info:
    def __init__(self):
        global rows, cols, right
        self.head_rows = 1
        self.head_cols = 1
        self.direction = right
        self.body = deque(list())

    def move(self):
        global right, left, top, apple_exist, time_count, rotate_info, rotate_info_index
        crashed = False
        temp_rows = self.head_rows
        temp_cols = self.head_cols
        try:
            if time_count == rotate_info[rotate_info_index][0]:
                self.change_direction()
                rotate_info_index += 1
        except IndexError:
            pass
        if self.direction == right:
            self.head_cols += 1
        elif self.direction == left:
            self.head_cols -= 1
        elif self.direction == top:
            self.head_rows -= 1
        else:#bottom
            self.head_rows += 1
        if self.check_crash():
            return crashed
        if board[self.head_rows][self.head_cols] == apple_exist:
            self.sizeup(temp_rows, temp_cols)
            board[self.head_rows][self.head_cols] = 0
        elif self.body:
            temp = self.body.popleft()
            del temp
            self.body.append([temp_rows, temp_cols])
        return True

    def sizeup(self, temp_rows, temp_cols):
        self.body.append([temp_rows, temp_cols])

    def check_crash(self):
        global N
        if self.head_cols == N + 1 or self.head_rows == N + 1 or self.head_cols == 0 or self.head_rows == 0:
            return True
        if [self.head_rows, self.head_cols] in self.body:
            return True

    def change_direction(self):
        global right, bottom, left, top, rotate_info, rotate_info_index
        if rotate_info[rotate_info_index][1] == 'D':
            if self.direction == top:
                self.direction = right
            else:
                self.direction += 1
        else:
            if self.direction == right:
                self.direction = top
            else:
                self.direction -= 1

def board_input():
    global board, N, K, L, empty, apple_exist, rotate_info
    N = int(input())
    for _ in range(N + 1):
        board.append([empty] * (N + 1))    
    K = int(input())
    for _ in range(K):
        temp_list = list(map(int, input().split()))
        board[temp_list[0]][temp_list[1]] = apple_exist
    L = int(input())
    for i in range(L):
        rotate_info.append(list(input().split()))
        rotate_info[i][0] = int(rotate_info[i][0])

def run_dummy():
    global time_count
    snake = snake_info()
    while snake.move():
        time_count += 1
    print(time_count + 1)

def main():
    board_input()
    run_dummy()

if __name__ == '__main__':
    main()
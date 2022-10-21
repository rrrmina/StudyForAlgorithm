
_ = None
board = list()
N = _
K = _
L = _
apple_position = list()
rotate_info = list()
rotate_info_index = 0
time_count = 0

empty = 0
apple_exist = 1

class snake_info:
    def __init__(self):
        self.direction = 'r'
        self.direction_list = ['r', 'd', 'l', 'u']
        self.size = 0
        self.head_position = [1, 1]
        self.tail_position = [1, 1]
        self.body = list()

    def move(self, apple_flag):
        global time_count, rotate_info_index
        try:
            if time_count == rotate_info[rotate_info_index][0]:
                self.rotateDirection(rotate_info[rotate_info_index][1])
                rotate_info_index += 1
        except IndexError:
            pass
        if self.direction == 'r':
            self.head_position[1] += 1
            if apple_flag:
                self.sizeup([self.head_position[0], self.head_position[1] - 1])
            else:
                self.move_body([self.head_position[0], self.head_position[1] - 1])
                self.tail_position[1] += 1
        elif self.direction == 'l':
            self.head_position[1] -= 1
            if apple_flag:
                self.sizeup([self.head_position[0], self.head_position[1] + 1])
            else:
                self.move_body([self.head_position[0], self.head_position[1] + 1])
                self.tail_position[1] -= 1
        elif self.direction == 'u':
            self.head_position[0] -= 1
            if apple_flag:
                self.sizeup([self.head_position[0] + 1, self.head_position[1]])
            else:
                self.move_body([self.head_position[0] + 1, self.head_position[1]])
                self.tail_position[0] -= 1
        else:
            self.head_position[0] += 1
            if apple_flag:
                self.sizeup([self.head_position[0] - 1, self.head_position[1]])
            else:
                self.move_body([self.head_position[0] - 1, self.head_position[1]])
                self.tail_position[0] += 1

        time_count += 1

    def move_body(self, to_append_list):
        if self.body:
            del self.body[0]
            self.body.append(to_append_list)

    def sizeup(self, to_append_list):
        self.size += 1
        self.body.append(to_append_list)

    def rotateDirection(self, direction):
        if direction == 'D':
            try:
                if self.body:
                    del self.body
                    self.body = list()
                self.direction = self.direction_list[self.direction_list.index(self.direction) + 1]
                self.head_position[0] = self.tail_position[0]
                self.head_position[1] = self.tail_position[1]
                if self.direction == 'r':
                    self.head_position[1] += self.size
                elif self.direction == 'l':
                    self.head_position[1] -= self.size
                elif self.direction == 'd':
                    self.head_position[0] += self.size
                else:
                    self.head_position[0] += self.size
                if self.head_position[1] == self.tail_position[1]:
                    if self.tail_position[0] < self.head_position[0]:
                        for i in range(self.tail_position[0], self.head_position[0]):
                            self.body.append([i, self.head_position[1]])
                    else:
                        for i in range(self.tail_position[0], self.head_position[0], -1):
                            self.body.append([i, self.head_position[1]])     
                else:
                    if self.tail_position[1] < self.head_position[1]:
                        for i in range(self.tail_position[1], self.head_position[1]):
                            self.body.append([self.head_position[0], i])
                    else:
                        for i in range(self.tail_position[1], self.head_position[1], -1):
                            self.body.append([self.head_position[0], i])                   
            except IndexError:
                self.direction = 'r'
        else:
            try:
                if self.body:
                    del self.body
                    self.body = list()
                self.direction = self.direction_list[self.direction_list.index(self.direction) + 1]
                self.head_position = self.tail_position
                if self.direction == 'r':
                    self.head_position[1] += self.size
                elif self.direction == 'l':
                    self.head_position[1] -= self.size
                elif self.direction == 'd':
                    self.head_position[0] += self.size
                else:
                    self.head_position[0] += self.size
                if self.head_position[1] == self.tail_position[1]:
                    if self.tail_position[0] < self.head_position[0]:
                        for i in range(self.tail_position[0], self.head_position[0]):
                            self.body.append([i, self.head_position[1]])
                    else:
                        for i in range(self.tail_position[0], self.head_position[0], -1):
                            self.body.append([i, self.head_position[1]])     
                else:
                    if self.tail_position[1] < self.head_position[1]:
                        for i in range(self.tail_position[1], self.head_position[1]):
                            self.body.append([self.head_position[0], i])
                    else:
                        for i in range(self.tail_position[1], self.head_position[1], -1):
                            self.body.append([self.head_position[0], i])  
            except IndexError:
                self.direction = 'r'

def board_input():
    global board, N, K, L, empty, apple_exist, rotate_info, apple_position
    N = int(input())
    for _ in range(N):
        board.append([empty] * (N + 1))
    K = int(input())
    for _ in range(K):
        apple_position.append(list(map(int, input().split())))
    for i in apple_position:
        board[i[0]][i[1]] = apple_exist
    L = int(input())
    for _ in range(L):
        temp_list = input().split()
        temp_list[0] = int(temp_list[0])
        rotate_info.append(temp_list)

def set_apple_flag(snake_head_position):
    global apple_position
    if snake_head_position in apple_position:
        return apple_exist
    else:
        return empty

def check_body_crash(snake):
    if snake.head_position in snake.body and snake.size != 0:
        return False
    else:
        return True

def get_answer():
    global N, time_count
    snake = snake_info()
    while snake.head_position[0] != N + 1 and snake.head_position[1] != N + 1 and check_body_crash(snake):
        apple_flag = set_apple_flag(snake.head_position)
        snake.move(apple_flag)
    print(time_count)


def main():
    board_input()
    get_answer()


if __name__ == '__main__':
    main()
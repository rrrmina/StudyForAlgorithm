from collections import deque

class calQueue:
    def __init__(self):
        self.N, self.M = map(int, input().split())
        del self.M
        self.number_to_extract_list = list(map(int, input().split()))
        self.deque_from_input = deque(list(range(1, self.N + 1)))
    
    def rotateRight(self, to_find_num):
        return_num = 0
        while self.deque_from_input[0] != to_find_num:
            self.deque_from_input.rotate(1)
            return_num += 1
        temp = self.deque_from_input.popleft()
        del temp
        return return_num
    
    def rotateLeft(self, to_find_num):
        return_num = 0
        while self.deque_from_input[0] != to_find_num:
            self.deque_from_input.rotate(-1)
            return_num += 1
        temp = self.deque_from_input.popleft()
        del temp
        return return_num

    def setRotateDirection(self, to_find_num):
        if self.deque_from_input.index(to_find_num) > len(self.deque_from_input) / 2:
            return 'r'
        else:
            return 'l'

    def calAnswer(self):
        answer = 0
        for i in self.number_to_extract_list:
            if self.setRotateDirection(i) == 'r':
                answer += self.rotateRight(i)
            else:
                answer += self.rotateLeft(i)
        return print(answer)


def main():
    queue_clase = calQueue()
    queue_clase.calAnswer()


if __name__ == '__main__':
    main()
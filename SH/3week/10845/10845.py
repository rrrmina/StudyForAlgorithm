from collections import deque

class Queue:
    def __init__(self):
        self.queue = deque()

    def push(self, x):
        self.queue.append(x)

    def pop(self):
        try: print(self.queue.popleft())
        except IndexError: print(-1)

    def size(self):
        print(len(self.queue))

    def empty(self):
        if len(self.queue) == 0: print(1)
        else: print(0)

    def front(self):
        try: print(self.queue[0])
        except IndexError: print(-1)

    def back(self):
        try: print(self.queue[-1])
        except IndexError: print(-1)

def main():
    from sys import stdin
    r_line = stdin.readline
    N = int(r_line())
    queue = Queue()
    for _ in range(N):
        cmd_list = r_line().split()
        try: # 명령어가 push인 경우
            eval(f"queue.{cmd_list[0]}({cmd_list[1]})")
        except IndexError: # 그외 경우
            eval(f"queue.{cmd_list[0]}()")

if __name__ == '__main__':
    main()
class Stack:
    def __init__(self):
        self.stack = list()

    def push(self, num):
        self.stack.append(num)
    
    def pop(self):
        try:
            print(self.stack.pop())
        except IndexError:
            print(-1)

    def size(self):
        print(len(self.stack))

    def empty(self):
        if len(self.stack) == 0:
            print(1)
        else:
            print(0)
    
    def top(self):
        try:
            print(self.stack[-1])
        except IndexError:
            print(-1)

def main():
    from sys import stdin
    r_line = stdin.readline #역시나 input()으로 받으면 시간초과
    N = int(r_line())
    stack = Stack()
    for _ in range(N):
        cmd_list = r_line().split()
        try: # 명령어가 push인 경우
            eval(f"stack.{cmd_list[0]}({cmd_list[1]})")
        except IndexError: # 그외 경우
            eval(f"stack.{cmd_list[0]}()")

if __name__ == '__main__':
    main()
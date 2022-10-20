from sys import stdin, stdout
from time import perf_counter #delete
import cProfile



def find_bigger_num(N, NumStack):
    w_line = stdout.write
    for i in range(N):
        flag = 0
        for j in range(i + 1, N):
            if NumStack[j] > NumStack[i]:
                w_line(f'{NumStack[j]} ')
                flag = 1
                break
        if not flag:
            w_line(str(-1) + ' ')

def main():
    r_line = stdin.readline
    N = int(r_line())
    NumStack = list(map(int, r_line().split()))
    find_bigger_num(N, NumStack)

start = perf_counter()
# cProfile.run('main()')
main()
print(f"\n{perf_counter() - start}")
# cProfile.run('main()')
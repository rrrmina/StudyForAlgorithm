from sys import stdin
from collections import deque
from time import perf_counter #delete
from cProfile import run

def main():
    start = perf_counter() #delete
    r_line = stdin.readline
    N, K = map(int, r_line().split())
    firstInputList = list()

    for _ in range(N):
        firstInputList.append(r_line().strip())
    nameLenQueue = deque(len(firstInputList[i]) for i in range(K))
    count = 0
    i = K
    while nameLenQueue:
        try:
            nameLenQueue.append(len(firstInputList[i]))
        except IndexError:
            pass
        to_pop_len = nameLenQueue.popleft()
        for j in nameLenQueue:
            if to_pop_len == j:
                count += 1
        i += 1
    print(count)
    print(f'time : {perf_counter() - start}')

if __name__ == '__main__':
    # main()
    run('main()') #delete
from sys import stdin
from time import process_time
from time import perf_counter
import cProfile

def main():
    r_line = stdin.readline
    N, K = map(int, r_line().split())
    # A = list(map(int, r_line().split()))

    read_file = open('C:\\Pig30nidaE\\SFA\\Pig30nidaE\\week1\\code\\test_case.txt') #delete
    # # read_file = open('C:\\Pig30nidaE\\SFA\\Pig30nidaE\\week1\\code\\result.txt') #delete
    A = list(map(int, read_file.read().split())) #delete

    count = 0
    start = perf_counter() #delete

    for _ in range(K + 1):
        try:
            index = A.index(N)
            print(f"{N} : {perf_counter()  - start}") #delete
            if A[index] != A[N - 1]:
                A[N - 1], A[index] = N, A[N - 1]
                count += 1
                if count == K:
                    print(perf_counter() - start) #delete
                    return print(f"{A[index]} {N}")
            N -= 1
        except Exception:
            pass
    print(perf_counter() - start) #delete
    return print(-1)

if __name__ == '__main__':
    # cProfile.run('main()')
    main()
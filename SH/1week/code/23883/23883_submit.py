import sys

def selection_sort(N, K, A):
    count = 0
    for _ in range(K + 1):
        index = A.index(N)
        if A[index] != A[N - 1]:
            A[N - 1], A[index] = N, A[N - 1]
            count += 1
            if count == K:
                return print(f"{A[index]} {N}")
        N -= 1
    return print(-1)

def main():
    r_line = sys.stdin.readline
    N, K = map(int, r_line().split())
    A = list(map(int, r_line().split()))
    selection_sort(N, K, A)

main()
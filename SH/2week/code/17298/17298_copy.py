import sys
from time import perf_counter
input = sys.stdin.readline

n = int(input())
start = perf_counter()
arr = list(map(int, input().split()))
stack = []
answer = [-1 for i in range(n)]

for i in range(len(arr)):
    while stack and arr[stack[-1]] < arr[i]:
        answer[stack.pop()] = arr[i]
    stack.append(i)
print(*answer)
print(perf_counter() - start)
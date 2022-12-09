from sys import stdin, setrecursionlimit
setrecursionlimit(10**9)

memo = dict()
def getRoute(square: list, row, col, n)->int:
    global memo
    if row >= n or col >= n or square[row][col] == 0: # return 조건
        if row == n - 1 and col == n - 1: # 만약 목적지 도달시
            return 1 # count 1 return
        return 0 # 아닌 경우는 조건 충족X
    if (row, col) in memo.keys(): # 이미 거쳐간 경로였다면
        return memo[(row, col)] # 메모해둔 값 return
    else: # 재귀를 돌릴건데, 돌리면서 나온 값 메모해두기
        temp = getRoute(square, row, col + square[row][col], n) + getRoute(square, row + square[row][col], col, n)
        memo[(row, col)] = temp
        return temp # 해당 값 리턴

def main():
    input = stdin.readline
    n = int(input())
    square = [0] * n
    for i in range(n):
        square[i] = list(map(int, input().split()))
    print(getRoute(square, 0, 0, n))

if __name__ == '__main__':
    main()
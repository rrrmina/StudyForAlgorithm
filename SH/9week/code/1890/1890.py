from sys import stdin, setrecursionlimit
setrecursionlimit(10**9)

memo = dict()
def getRoute(square: list, row, col, n)->int:
    global memo
    if row >= n or col >= n or square[row][col] == 0:
        if row == n - 1 and col == n - 1:
            return 1
        return 0
    if (row, col) in memo.keys():
        return memo[(row, col)]
    else:
        temp = getRoute(square, row, col + square[row][col], n) + getRoute(square, row + square[row][col], col, n)
        memo[(row, col)] = temp
        return temp

def main():
    input = stdin.readline
    n = int(input())
    square = [0] * n
    for i in range(n):
        square[i] = list(map(int, input().split()))
    print(getRoute(square, 0, 0, n))

if __name__ == '__main__':
    main()
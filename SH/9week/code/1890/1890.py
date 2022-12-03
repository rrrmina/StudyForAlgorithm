count = 0
def getRoute(square: list, row, col, n):
    global count
    try:
        if not square[row][col]:
            count += 1
            return
    except IndexError:
        return
    if row >= n or col >= n:
        return
    getRoute(square, row + square[row][col], col, n)
    getRoute(square, row, col + square[row][col], n)

def main():
    n = int(input())
    square = [0] * 4
    for i in range(n):
        square[i] = list(map(int, input().split()))
    getRoute(square, 0, 0, n)
    global count
    print(count)

if __name__ == '__main__':
    main()
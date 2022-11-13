def main():
    n, m = map(int, input().split())
    firstMatrix = list()
    for _ in range(n):
        firstMatrix.append(list(map(int, input().split())))
    m, k = map(int, input().split())
    secondMatrix = list()
    for _ in range(m):
        secondMatrix.append(list(map(int, input().split())))
    for rows in firstMatrix: # 첫번째 행렬의 행 (1,2) - (3,4)...
        for j in range(len(secondMatrix[0])): # 두번째 행렬의 길이 : 2 (제출하고 보니 m이랑 똑같음.)
            sum = 0
            for i in range(len(rows)): # 두번째 첫번째 행렬의 열의 길이 (2)
                sum += (rows[i] * secondMatrix[i][j]) # rows[i]->1,2 / 3,4 ... secondeMatrix[i][j]->-1,0 / -2,0 ....
            print(sum, end=" ")
        print()

if __name__ == '__main__':
    main()

# -1+0  -2+0  0+6
# -3+0  -6+0  0+12
# -5+0  -10+0 0+18
from sys import stdin


blueCount, whiteCount = 0, 0
_ = None

def getSum(square):
    result = 0
    for i in square:
        result += sum(i)
    return result

def checkAllSameColor(croppedRec, n):
    if getSum(croppedRec) == (n * n): # 만약 모든 종이의 합이 n * n 이면 모두 파란종이
        return 'b'
    if getSum(croppedRec) == 0: # 모든 종이의 합이 0이면 하얀종이
        return 'w'
    return False # 둘다 아니면 섞여있음.

def cuttingPaper(paperSquare, n):
    global blueCount, whiteCount, _
    isAllSame = checkAllSameColor(paperSquare, n)
    if isAllSame: # 먼저 모든 종이가 같은 색깔인지 구분 : 모든 종이의 합
        if isAllSame == 'b':
            blueCount += 1
            return _
        else:
            whiteCount += 1
            return _
    # 4분할해서 각각 재귀 돌려줌.
    cuttingPaper([row[0:int(n/2)] for row in paperSquare[0:int(n/2)]], int(n/2))
    cuttingPaper([row[0:int(n/2)] for row in paperSquare[int(n/2):]], int(n/2))
    cuttingPaper([row[int(n/2):] for row in paperSquare[0:int(n/2)]], int(n/2))
    cuttingPaper([row[int(n/2):] for row in paperSquare[int(n/2):]], int(n/2))

def main():
    global blueCount, whiteCount
    r_line = stdin.readline
    n = int(r_line())
    paperSquare = [list(map(int, r_line().split())) for _ in range(n)]
    cuttingPaper(paperSquare, n) # 재귀 시작
    print(whiteCount, blueCount)

if __name__ == '__main__':
    main() 
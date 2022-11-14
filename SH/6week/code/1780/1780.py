from sys import stdin, setrecursionlimit
recurLimit = 2147483647
setrecursionlimit(recurLimit)
from itertools import chain


zeroCount, oneCount, minusCount = 0, 0, 0
_ = None

def checkAllSameColor(paperSquare, start, end, start2, end2):
    checkSet = set()
    for i in range(start, end):
        for j in range(start2, end2):
            checkSet.add(paperSquare[i][j])
            if len(checkSet) > 1: return None
    if checkSet == {1}:
        return 1
    if checkSet == {0}:
        return 0
    if checkSet == {-1}:
        return -1
    return None


def cuttingPaper(paperSquare, n):
    global zeroCount, oneCount, minusCount, _
    isAllSame = checkAllSameColor(paperSquare, n)
    if isAllSame != _:
        if isAllSame == 1:
            oneCount += 1
            return _
        if isAllSame == 0:
            zeroCount += 1
            return _
        if isAllSame == -1:
            minusCount += 1
            return _
    

def main():
    global zeroCount, oneCount, minusCount
    r_line = stdin.readline
    n = int(r_line())
    paperSquare = [list(map(int, r_line().split())) for _ in range(n)]
    cuttingPaper(paperSquare, n)
    print(minusCount)
    print(zeroCount)
    print(oneCount)

if __name__ == '__main__':
    main() 
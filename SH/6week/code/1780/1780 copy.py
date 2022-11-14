from sys import stdin, setrecursionlimit
recurLimit = 2147483647
setrecursionlimit(recurLimit)
from itertools import chain


zeroCount, oneCount, minusCount = 0, 0, 0
_ = None

def checkAllSameColor(croppedRec):
    to_check_set = set(chain(*croppedRec))
    if to_check_set == {1}:
        return '1'
    if to_check_set == {0}:
        return '0'
    if to_check_set == {-1}:
        return '-1'
    return False

def cuttingPaper(paperSquare, n):
    global zeroCount, oneCount, minusCount, _
    isAllSame = checkAllSameColor(paperSquare)
    if isAllSame:
        if isAllSame == '0':
            zeroCount += 1
            return _
        elif isAllSame == '1':
            oneCount += 1
            return _
        elif isAllSame == '-1':
            minusCount += 1
            return _
    cuttingPaper([row[0:int(n/3)] for row in paperSquare[0:int(n/3)]], int(n/3))
    cuttingPaper([row[0:int(n/3)] for row in paperSquare[int(n/3):int(2*n/3)]], int(n/3))
    cuttingPaper([row[0:int(n/3)] for row in paperSquare[int(2*n/3):]], int(n/3))
    cuttingPaper([row[int(n/3):int(2*n/3)] for row in paperSquare[0:int(n/3)]], int(n/3))
    cuttingPaper([row[int(n/3):int(2*n/3)] for row in paperSquare[int(n/3):int(2*n/3)]], int(n/3))
    cuttingPaper([row[int(n/3):int(2*n/3)] for row in paperSquare[int(2*n/3):]], int(n/3))
    cuttingPaper([row[int(2*n/3):] for row in paperSquare[0:int(n/3)]], int(n/3))
    cuttingPaper([row[int(2*n/3):] for row in paperSquare[int(n/3):int(2*n/3)]], int(n/3))
    cuttingPaper([row[int(2*n/3):] for row in paperSquare[int(2*n/3):]], int(n/3))

def main():
    global zeroCount, oneCount, minusCount
    r_line = stdin.readline
    n = int(r_line())
    paperSquare = [list(map(int, r_line().split())) for _ in range(n)]
    from time import perf_counter
    start = perf_counter()
    cuttingPaper(paperSquare, n)
    print(perf_counter() - start)
    print(minusCount)
    print(zeroCount)
    print(oneCount)

if __name__ == '__main__':
    main() 
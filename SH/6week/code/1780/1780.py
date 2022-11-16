from sys import stdin, setrecursionlimit
recurLimit = 2147483647
setrecursionlimit(recurLimit)


zeroCount, oneCount, minusCount = 0, 0, 0
def cuttingPaper(paperSquare, n):
    global zeroCount, oneCount, minusCount
    flag = 1
    for i in paperSquare:
        for j in i:
            if j != paperSquare[0][0]:
                flag = 0
                break
        else:
            continue
        break
    if flag:
        if paperSquare[0][0] == 1:
            oneCount += 1
        if paperSquare[0][0] == 0:
            zeroCount += 1
        if paperSquare[0][0] == -1:
            minusCount += 1
        return None
    else:
        cuttingPaper([row[0:n//3] for row in paperSquare[0:n//3]], n//3)
        cuttingPaper([row[0:n//3] for row in paperSquare[n//3:(2*n)//3]], n//3)
        cuttingPaper([row[0:n//3] for row in paperSquare[(2*n)//3:]], n//3)
        cuttingPaper([row[n//3:(2*n)//3] for row in paperSquare[0:n//3]], n//3)
        cuttingPaper([row[n//3:(2*n)//3] for row in paperSquare[n//3:(2*n)//3]], n//3)
        cuttingPaper([row[n//3:(2*n)//3] for row in paperSquare[(2*n)//3:]], n//3)
        cuttingPaper([row[(2*n)//3:] for row in paperSquare[0:n//3]], n//3)
        cuttingPaper([row[(2*n)//3:] for row in paperSquare[n//3:(2*n)//3]], n//3)
        cuttingPaper([row[(2*n)//3:] for row in paperSquare[(2*n)//3:]], n//3)

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
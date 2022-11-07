from sys import stdin


toPrintStack = list('')
def checkFirstBracketFlag(flag):
    global toPrintStack
    if flag:
        toPrintStack.append('(')

def getSum(square):
    result = 0
    for i in square:
        result += sum(i)
    return result

def loopQuadTree(square, n, first_flag):
    global toPrintStack
    sum_result = getSum(square)
    checkFirstBracketFlag(first_flag) # 처음 square(왼쪽 위)인지 확인
    ## return 조건 체크
    if sum_result == n * n:
        toPrintStack.append('1')
        return None
    if sum_result == 0:
        toPrintStack.append('0')
        return None
    ## return 조건에서 걸리지 않았다면 4분할 후 loop시작
    loopQuadTree([row[0:int(n/2)] for row in square[0:int(n/2)]], int(n/2), 1)
    loopQuadTree([row[int(n/2):] for row in square[0:int(n/2)]], int(n/2), 0)
    loopQuadTree([row[0:int(n/2)] for row in square[int(n/2):]], int(n/2), 0)
    loopQuadTree([row[int(n/2):] for row in square[int(n/2):]], int(n/2), 0)
    toPrintStack.append(')') #마지막 square(오른쪽 아래)는 무조건 괄호를 붙임

def main():
    global toPrintStack
    r_line = stdin.readline
    n = int(r_line())
    square = list()
    for _ in range(n):
        square.append(list(map(int, r_line().strip())))
    loopQuadTree(square, n, 0) #loop시작
    print(''.join(toPrintStack))

if __name__ == '__main__':
    main()
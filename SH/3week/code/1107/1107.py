from sys import stdin


def getCloserChannel(N, brokenButton):
    index = 0
    while True:
        Nplus = N + index
        Nminus = N - index 
        plusFlag = 0
        minusFlag = 0
        # 각각 1씩 더하고 빼가면서 조건을 만족하는 순간 while문 멈춤, return.
        for j in str(Nplus):
            if int(j) in brokenButton:
                plusFlag = 1
                break
        if Nminus >= 0:
            for j in str(Nminus):
                if int(j) in brokenButton:
                    minusFlag = 1
                    break
        else:
            for j in range(1, len(str(Nminus))):
                if int(str(Nminus)[j]) in brokenButton:
                    minusFlag = 1
                    break
        # Flag가 없는 경우는 조건을 만족하는 경우임.
        if not plusFlag and not minusFlag: # 그런데 플러스하고 마이너스 둘 다 Flag가 없는(둘다 조건을 만족하는) 경우가 있음.
            if len(str(Nplus)) > len(str(Nminus)): # 반례3 : 이 때 각각 글자길이(채널입력횟수)를 구해서 더 짧은 것을 구해야함.
            ## 추가. 생각해보니 굳이 누가 더 짧은지 구할 필요가 없음. Nminus가 무조건 더 채널입력횟수가 짧은 숫자임.
                return Nminus
            else:
                return Nplus
        if not plusFlag:
            return Nplus
        elif not minusFlag:
            return Nminus
        else:
            index += 1

def getMoveOneChannelCount(src, dst):
    return abs(src - dst)

def main():
    r_line = stdin.readline
    default_channel = 100
    N = int(r_line())
    M = int(r_line())
    dstChannelLen = len(str(N))
    moveCount = getMoveOneChannelCount(default_channel, N)

    if not M: # 반례 1 : 고장난 버튼이 없는 경우
        if moveCount <= dstChannelLen: # +, - 버튼 누르는 횟수랑 채널번호 누르는 횟수 비교
            return print(moveCount)
        else:
            return print(dstChannelLen)
    elif M == 10: #반례 2 : 모든 버튼이 고장난 경우
        brokenButton = set(map(int, r_line().split()))
        return print(moveCount)
    else: brokenButton = set(map(int, r_line().split()))
    startChannel = getCloserChannel(N, brokenButton)
    startChannelLen = len(str(startChannel))
    startChannelMoveCount = getMoveOneChannelCount(startChannel, N) # 주어진 채널번호까지 가장 가까운 조건을 만족하는 채널 구함.
    if moveCount <= startChannelLen + startChannelMoveCount: # 그냥 채널번호까지 +,-로 가는 것보다 채널번호 누른 후에 +,-로 이동하는게 많으면
        return print(moveCount) # 그냥 +,-로 이동
    else:
        return print(startChannelLen + startChannelMoveCount) # 아니면 채널입력후 +,-로 이동.

main()
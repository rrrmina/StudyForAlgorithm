def getCloserChannel(N, brokenButton, plusIndex, minusIndex, i):
    try: N[i]
    except IndexError: return int(''.join(N))
    plusFlag = 0
    minusFlag = 0
    temp = 0

    if int(N[i]) + plusIndex >= 10:
        temp = (int(N[i]) + plusIndex) - 10
    else: temp = int(N[i]) + plusIndex
    if temp in brokenButton:
        plusIndex += 1
    else: plusFlag = 1

    if int(N[i]) - minusIndex < 0:
        temp = 10 + (int(N[i]) - minusIndex)
    else: temp = int(N[i]) - minusIndex
    if temp in brokenButton:
        minusIndex += 1
    else: minusFlag = 1

    if plusFlag:
        N[i] = str(int(N[i]) + plusIndex)
        return getCloserChannel(N, brokenButton, 0, 0, i - 1)
    elif minusFlag:
        N[i] = str(int(N[i]) - minusIndex)
        return getCloserChannel(N, brokenButton, 0, 0, i - 1)
    else:
        return getCloserChannel(N, brokenButton, plusIndex, minusIndex, i)
        
    


def getMoveOneChannelCount(src, dst):
    return abs(src - dst)

def main():
    default_channel = 100
    N = int(input())
    M = int(input())
    if not M:
        brokenButton = set()
    else: brokenButton = set(map(int, input().split()))
    dstChannelLen = len(str(N))
    moveCount = getMoveOneChannelCount(default_channel, N)
    startChannel = getCloserChannel(list(str(N)), brokenButton, 0, 0, -1)
    if moveCount <= getMoveOneChannelCount(startChannel, N):
        print(moveCount)
    else:
        print(dstChannelLen + getMoveOneChannelCount(startChannel, N))



if __name__ == '__main__':
    main()
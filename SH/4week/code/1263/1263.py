from sys import stdin


def main():
    r_line = stdin.readline
    n = int(r_line())
    tempInputList = list(map(int, r_line().split()))
    numbersDict = dict()
    for i in range(n):
        try:
            numbersDict[tempInputList[i]].add(i)
        except KeyError:
            numbersDict[tempInputList[i]] = set()
            numbersDict[tempInputList[i]].add(i)
    dictKeysList = list(numbersDict.keys())
    count = 0
    OutLoopVisited = set()
    InLoopVisited = set()
    answerVisitedDict = dict()
    for i in range(len(dictKeysList)):
        for j in range(i + 1, len(dictKeysList)):
            if numbersDict[dictKeysList[i]] not in OutLoopVisited or numbersDict[dictKeysList[j]] not in InLoopVisited: 
                if dictKeysList[i] + dictKeysList[j] in set(dictKeysList):
                    try:
                        if answerVisitedDict[dictKeysList[i] + dictKeysList[j]]:
                            pass
                    except KeyError:
                        count += len(numbersDict[dictKeysList[i]]) * len(numbersDict[dictKeysList[j]])
                        OutLoopVisited.update(numbersDict[dictKeysList[i]])
                        InLoopVisited.update(numbersDict[dictKeysList[j]])
                        answerVisitedDict[dictKeysList[i] + dictKeysList[j]] = True
    print(count)

if __name__ == '__main__':
    main()
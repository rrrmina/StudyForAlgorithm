from sys import stdin

r_line = stdin.readline
N = int(r_line())
NumStack = list(map(int, r_line().split()))
SortedNumStack = sorted(NumStack, reverse=True)
max_num = SortedNumStack[-1]
SortedNumStackDict = dict()
for i in range(N):
    SortedNumStackDict[SortedNumStack[i]] = i
toPrintStack = list(0 for i in range(N))

toPrintStack[-1] = -1
for i in range(N - 1):
    if NumStack[i + 1] > NumStack[i]:
        toPrintStack[i] = NumStack[i + 1]
        SortedNumStack[SortedNumStackDict[NumStack[i]]] = 0

for i in range(len(SortedNumStack) - 1, -1, -1):
    if SortedNumStack[i] == 0:
        del SortedNumStack[i]
del SortedNumStack[0]

SortedNumStackIndex = 0
for i in range(len(toPrintStack)):
    if toPrintStack[i] == 0:
        toPrintStack[i] = SortedNumStack[SortedNumStackIndex]
        SortedNumStackIndex += 1

print(SortedNumStack)
print(toPrintStack)

from sys import stdin
from time import perf_counter #delete

def main():
    r_line = stdin.readline
    N = int(r_line())
    NumStack = list(map(int, r_line().split())) # O(n)
    NumStackDict = dict()
    for i in range(N): #O(2n)
        NumStackDict[i] = NumStack[i]
    SortedNumStack = sorted(NumStack) # O(3n)
    SortedDict = dict()
    for i in range(N): #O(4n)
        SortedDict[SortedNumStack[i]] = i
    max_num = SortedNumStack[-1]
    del SortedNumStack
    del NumStack

    for i in range(N): # O(2n + n)
        print(NumStackDict[SortedDict[NumStackDict[i + 1]]], end=" ")

if __name__ == '__main__':
    start = perf_counter() #delete
    main()
    print("")
    print(perf_counter() - start) #delete
from sys import stdin
from time import process_time
from time import perf_counter
import cProfile

def main():
    r_line = stdin.readline
    N, K = map(int, r_line().split())
    # A = list(map(int, r_line().split()))

    read_file = open('/Users/pig30nidae/Pig30nidaE/SFA/Pig30nidaE/week1/code/test_case.txt')
    # read_file = open('C:\\Pig30nidaE\\SFA\\Pig30nidaE\\week1\\code\\test_case.txt') #delete
    # # read_file = open('C:\\Pig30nidaE\\SFA\\Pig30nidaE\\week1\\code\\result.txt') #delete

    start = perf_counter() #delete
    #O(n)
    A = list(map(int, read_file.read().split())) #delete

    CopyAList = A
    DictIndex = 0
    CopyDict = dict()
    
    count = 0
    
    print(f"{N} : {perf_counter()  - start}") #delete
    DictIndex = 0
    CopyDict = dict()
    SortedList = sorted(A, reverse=True)

    for i in A:
        CopyDict[f'{i}'] = DictIndex
        DictIndex += 1
    
    count = 0
    for i in SortedList:
        try:
            index = CopyDict[f'{i}']
            if A[index] != A[-1]:
                A[-1], A[index] = i, A[-1]
                CopyDict[f'{A[-1]}'], CopyDict[f'{A[index]}'] = CopyDict[f'{A[index]}'], CopyDict[f'{A[-1]}']
                count += 1
            del CopyDict[f'{A[-1]}']
            A.pop()
            if count == K:
                return print(f"{A[index]} {i}")
        except Exception:
            pass
    return print(-1)
    print(perf_counter() - start) #delete
    return print(-1)

if __name__ == '__main__':
    # cProfile.run('main()')
    main()
from sys import stdin

def main():
    r_line = stdin.readline
    N, K = map(int, r_line().split())
    A = list(map(int, r_line().split()))#O(n)
    del N
    DictIndex = 0
    CopyDict = dict()
    SortedList = sorted(A, reverse=True) #O(2n)

    for i in A: #O(3n)
        CopyDict[f'{i}'] = DictIndex
        DictIndex += 1
    
    count = 0
    for i in SortedList:#O(4n)
        index = CopyDict[f'{i}']
        if A[index] != A[-1]:
            A[-1], A[index] = i, A[-1]
            CopyDict[f'{A[-1]}'], CopyDict[f'{A[index]}'] = CopyDict[f'{A[index]}'], CopyDict[f'{A[-1]}']
            count += 1
        A.pop()
        if count == K:
            return print(f"{A[index]} {i}")
    return print(-1)

if __name__ == '__main__':
    main()
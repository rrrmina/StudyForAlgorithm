from sys import stdin
from time import perf_counter #delete
import cProfile
from nbformat import read
import numpy as np
import numba

def main():
    # r_line = stdin.readline
    # A = list(map(int, r_line().split()))
    read_file = open('/Users/pig30nidae/Pig30nidaE/SFA/Pig30nidaE/1week/code/24053/test_case.txt') #delete
    read_file_line = read_file.readline
    N = int(read_file.readline())
    del N
    A = list(map(int, read_file_line().split())) #delete
    B = list(map(int, read_file_line().split()))
    CopyDict = dict()
    DictIndex = 0
    start = perf_counter() #delete
    
    for i in A:
        CopyDict[f'{i}'] = DictIndex
        DictIndex += 1

    remem_index = 0
    for i in range(0, len(B) - 1):
        print(perf_counter() - start)    
        temp, temp2 = A[i], A[CopyDict[f'{B[i]}']]
        A[i], A[CopyDict[f'{B[i]}']] = B[i], A[i]
        CopyDict[f'{temp}'], CopyDict[f'{temp2}'] = CopyDict[f'{temp2}'], CopyDict[f'{temp}']
        if B[i] < B[i + 1]:
            remem_index += 1
        else:
            break
    print(perf_counter() - start)
    # print(remem_index)
    for i in range(remem_index, len(A)):
        print(perf_counter() - start)
        to_in = A[i]
        # for j in range(i - 1, -1, -1):
        #     if A[j] > to_in:
        #         A[j + 1] = A[j]
        #         index = j
        #     if A == B:
        #         return print(1)
        #     if A[j] <= to_in:
        #         break
        for j in range(i - 1, -1, -1):
            if A == B:
                print(perf_counter() - start)
                return print(1) 
            if A[j] > to_in:
                A[j + 1] = A[j]
                index = j
            else:
                break
        try:
            A[index] = to_in
        except UnboundLocalError:
            pass
    print(perf_counter() - start)
    return print(0)

            

if __name__ == '__main__':
    main()
    # cProfile.run('main()')
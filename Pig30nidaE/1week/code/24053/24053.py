from sys import stdin
from time import perf_counter #delete
import cProfile
import numpy as np

def main():
    # r_line = stdin.readline
    # A = list(map(int, r_line().split()))
    read_file = open('/Users/pig30nidae/Pig30nidaE/SFA/Pig30nidaE/1week/24053/test_case.txt') #delete
    N = int(read_file.readline())
    del N
    A = np.array(list(map(int, read_file.readline().split()))) #delete
    B = np.array(list(map(int, read_file.readline().split())))
    start = perf_counter() #delete
    for i in range(1, A.size): #O(n) 
        temp = A[0:i + 1]
        index = np.where(temp < i)
        try:
            for i in index:
                A[i] = A[i - 1]
                temp[i] = temp[i - 1]
                if np.array_equal(A, B):
                    print("!")
        except:
            print(A)
            print(temp)
            if np.array_equal(A, B):
                print("!")
        print(index)

if __name__ == '__main__':
    main()
    # cProfile.run('main()')
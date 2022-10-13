from sys import stdin
import numpy as np

def main():
    r_line = stdin.readline
    N = int(r_line())
    del N
    A = np.array(list(map(int, r_line().split())))
    B = np.array(list(map(int, r_line().split())))
    for i in range(1, A.size): 
        temp = A[0:i + 1]
        to_in = A[i]
        flag = 0
        for j in range(temp.size - 2, -1, -1):
            if temp[j] > to_in:
                A[j + 1] = A[j]
                temp[j + 1] = temp[j]
                flag = 1
                index = j
            else:
                if np.array_equal(A, B):
                    return print(1)
                break
            if np.array_equal(A, B):
                return print(1)
        if flag:
            A[index] = to_in
            temp[index] = to_in
            if np.array_equal(A, B):
                return print(1)
        del temp
    return print(0)

if __name__ == '__main__':
    main()
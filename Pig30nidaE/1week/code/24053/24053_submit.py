from sys import stdin

def main():
    r_line = stdin.readline
    N = int(r_line())
    del N
    A = list(map(int, r_line().split()))
    B = list(map(int, r_line().split()))

    CopyDict = dict()
    DictIndex = 0
    remem_index = 0

    for i in A:
        CopyDict[f'{i}'] = DictIndex
        DictIndex += 1

    for i in range(0, len(B) - 1):
        temp, temp2 = A[i], A[CopyDict[f'{B[i]}']]
        A[i], A[CopyDict[f'{B[i]}']] = B[i], A[i]
        CopyDict[f'{temp}'], CopyDict[f'{temp2}'] = CopyDict[f'{temp2}'], CopyDict[f'{temp}']
        if B[i] < B[i + 1]:
            remem_index += 1
        else:
            break

    for i in range(remem_index, len(A)): 
        to_in = A[i]
        for j in range(i - 1, -1, -1):
            if A == B:
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
    return print(0)

main()
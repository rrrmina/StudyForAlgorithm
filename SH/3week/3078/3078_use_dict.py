from sys import stdin
from itertools import combinations
from time import perf_counter
from cProfile import run

def main():
    start = perf_counter()
    r_line = stdin.readline
    N, K = map(int, r_line().split())
    nameList = list()
    for _ in range(N):
        nameList.append(r_line().strip())
    lenDict = dict()
    for i in range(N):
        try:
            lenDict[f'{len(nameList[i])}'].append(i)
        except KeyError:
            lenDict[f'{len(nameList[i])}'] = list()
            lenDict[f'{len(nameList[i])}'].append(i)
    count = 0
    for values in lenDict.values():
        count += len(list(i for i in list(combinations(values, 2)) if abs(i[0] - i[1]) < K))
    print(count)
    print(f'time : {perf_counter() - start}')


if __name__ == '__main__':
    # main()
    run('main()')

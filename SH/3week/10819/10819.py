from itertools import permutations
from sys import stdin 

def givenFormula(comb_list, N):
    sum = 0
    for i in range(N - 1):
        sum += abs(comb_list[i] - comb_list[i + 1])
    return sum

def main():
    r_line = stdin.readline
    N = int(r_line())
    A = list(map(int, r_line().split()))
    get_all_cases = list(permutations(A, N))
    max = 0

    for i in get_all_cases:
        result = givenFormula(i, N)
        if max < result:
            max = result
    print(result)
            

if __name__ == '__main__':
    main()

#순서대로 제일큰수, 제일작은수,그다음 큰수, 그다음 작은수 .... 이런식으로 하면..?
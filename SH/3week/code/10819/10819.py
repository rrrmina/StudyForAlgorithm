from itertools import permutations
from sys import stdin 

def givenFormula(comb_list, N): # 주어진 식을 함수로 표현한 것.
    sum = 0
    for i in range(N - 1):
        sum += abs(comb_list[i] - comb_list[i + 1]) # N - 2까지 해당식을 돌려주고 return.
    return sum

def main():
    r_line = stdin.readline
    N = int(r_line())
    A = list(map(int, r_line().split()))
    get_all_cases = list(permutations(A, N)) # 구할 수 있는 모든 케이스 : 주어진 배열의 순열을 모두 구하면 됨.
    max = 0

    for i in get_all_cases:
        result = givenFormula(i, N)
        if max < result: # 만약 주어진 식의 결과가 최댓값보다 크다면 최댓값을 결과로 바꿈.
            max = result
    print(max)

if __name__ == '__main__':
    main()
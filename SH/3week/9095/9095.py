from itertools import product
from sys import stdin

def main():
    r_line = stdin.readline
    T = int(r_line())
    for _ in range(T):
        n = int(r_line())
        count = 0
        for i in range(1, n + 1): # 자리수를 제어하는 반복문
            for j in product(range(1, 4), repeat=i): # 주어진 자리수(i)를 토대로 주어진 범위(1 ~ 3)까지 중복조합의 경우를 구함.
                if sum(j) == n: # 합이 n이면 출력
                    count += 1
        print(count)

if __name__ == '__main__':
    main()
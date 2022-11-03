from sys import stdin

def main():
    r_line = stdin.readline
    n, k = map(int, r_line().split())
    coin_list = list()
    for _ in range(n):
        coin_list.append(int(r_line()))
    count = 0
    for i in reversed(coin_list):
        if i <= k:
            count += int(k / i) # 몫을 구해서 count에 계속 더해줌.
            k %= i # 나머지를 k에다 넣음.
    print(count)

if __name__ == '__main__':
    main()

# 원래 c에 있는 로직과 똑같이 구현했으나 파이썬은 시간초과가 나옴.
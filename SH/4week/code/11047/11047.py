from sys import stdin

def main():
    r_line = stdin.readline
    n, k = map(int, r_line().split())
    coin_list = list()
    for _ in range(n):
        coin_list.append(int(r_line()))
    count = 0
    for i in reversed(coin_list):
        if i < k:
            count += int(k / i)
            k %= i
    print(count)

if __name__ == '__main__':
    main()
import sys


def main():
    r_line = sys.stdin.readline
    n = int(r_line())
    num_list = list(map(int, r_line().split()))
    for _ in range(n - 1):
        num_list.extend(list(map(int, r_line().split())))
        num_list.sort(reverse=True)
        del num_list[n:]
    print(num_list[-1])

if __name__ == '__main__':
    main()
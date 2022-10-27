from sys import stdin
from itertools import combinations

def main():
    r_line = stdin.readline
    n, m = map(int, input().split())
    num_list = list()
    for _ in range(n):
        num_list.append(list(map(int, str(input()))))
    list_rows_index = [i for i in range(n)]
    list_cows_index = [i for i in range(m)]
    print(num_list)
if __name__ == '__main__':
    main()
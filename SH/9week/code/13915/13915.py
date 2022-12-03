def main():
    from sys import stdin
    input = stdin.readline
    init_set = set()
    try:
        while True:
            n = int(input())
            for _ in range(n):
                temp_tuple = tuple(sorted(list(set(map(int, list(input().strip()))))))
                init_set.add(temp_tuple)
            print(len(init_set))
            init_set.clear()
    except:
        return

if __name__ == '__main__':
    main()
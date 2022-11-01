from sys import stdin


def main():
    r_line = stdin.readline
    n = int(r_line())
    num_list = list(map(int, r_line().split()))
    num_list.sort()
    start = 0
    end = 1
    count = 0
    find_index = set()
    while start < len(num_list) - 1 and end < len(num_list):
        for to_find in range(len(num_list)):
            if num_list[to_find] == num_list[start] + num_list[end]:
                if to_find not in find_index and to_find != start and to_find != end:
                    count += 1
                    find_index.add(to_find)
        if start < end - 1:
            start += 1
        elif end < len(num_list) - 1:
            end += 1
            start = 0
        else:
            break
    print(count)

if __name__ == '__main__':
    main()
from sys import stdin


def main():
    input = stdin.readline
    n = int(input())
    op, name = 0, 1
    info_list = list()
    name_dict = dict()
    priority = 0
    for _ in range(n):
        info_list = list(map(str, input().split()))
        if int(info_list[op]) == 1: # operation이 1이면
            try: # info추가
                name_dict[info_list[name]].extend(map(int, info_list[3:]))
            except KeyError:
                name_dict[info_list[name]] = list(map(int, info_list[3:]))
            finally: # 마지막에는 항상 정렬
                name_dict[info_list[name]].sort()
        else: # operation이 2이면
            if name_dict.get(info_list[name]): # 해당 이름이 존재할 때
                for _ in range(int(info_list[2])):
                    try: # pop할 수 있는 경우에만
                        priority += int(name_dict[info_list[name]].pop()) # pop한 후 가치에 더함.
                    except IndexError:
                        break
    print(priority)

if __name__ == '__main__':
    main()
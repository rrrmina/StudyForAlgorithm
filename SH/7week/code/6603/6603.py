def main():
    input_list = list()
    from itertools import combinations
    while True:
        input_list = list(map(int, input().split()))
        if (input_list[0] == 0):
            return
        slicing_list = input_list[1:]
        for i in list(combinations(slicing_list, 6)):
            for j in i: print(j, end=" ")
            print()
        print()
        input_list.clear()
        slicing_list.clear()

if __name__ == '__main__':
    main()
def main():
    max_num = 0
    max_sum = 0
    for i in range(5):
        input_list = list(map(int, input().split()))
        list_sum = sum(input_list)
        if max_sum < list_sum:
            max_sum = list_sum
            max_num = i + 1
    print(max_num, max_sum)

if __name__ == '__main__':
    main()
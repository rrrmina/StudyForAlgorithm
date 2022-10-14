def main():
    max_num = 0
    index = 0
    for i in range(9):
        temp_num = int(input())
        if max_num < temp_num:
            max_num = temp_num
            index = i + 1
    print(f"{max_num} {index}")

if __name__ == '__main__':
    main()
def main():
    num_list = []
    for i in range(9):
        num_list.append(int(input()))
    print(f"{max(num_list)} {num_list.index(max(num_list)) + 1}")

if __name__ == '__main__':
    main()
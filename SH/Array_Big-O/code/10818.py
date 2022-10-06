def main():
    n = input()
    del n
    num_list = list(map(int, input().split()))
    max_num = max(num_list)
    min_num = min(num_list)
    print(f"{min_num} {max_num}")

if __name__ == "__main__":
    main()
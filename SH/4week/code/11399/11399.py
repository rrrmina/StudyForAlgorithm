def main():
    n = input()
    time_list = list(map(int, input().split()))
    del n
    time_list.sort() # 각 사람마다 걸리는 시간 순으로 정렬
    sum = 0
    result = 0
    for i in time_list:
        sum += i # 각 사람의 경과시간
        result += sum # 경과시간의 합
    print(result)

if __name__ == '__main__':
    main()
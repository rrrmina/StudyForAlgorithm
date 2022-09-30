def main():
    num = int(input())
    point = 0
    sum = 0
    for i in range(num):
        temp_list = list(input())
        for j in temp_list:
            if j == 'O':
                point += 1
                sum += point
            else:
                point = 0
        print(sum)
        point = 0
        sum = 0

if __name__ == '__main__':
    main()
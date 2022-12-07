def main():
    n = int(input())
    index_dict = dict()
    temp = list(map(int, input().split()))
    for i in range(n):
        try:
            index_dict[temp[i]].append(i)
        except KeyError:
            index_dict[temp[i]] = [i]
    sorted_temp = sorted(temp)
    sorted_index = dict()
    for i in range(n):
        sorted_index[i] = sorted_temp
        

if __name__ == '__main__':
    main()
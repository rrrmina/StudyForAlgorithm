from sys import stdin


def main():
    r_line = stdin.readline
    n = int(r_line())
    num_list = list(map(int, r_line().split()))
    num_list.sort()
    num_dict = dict()
    for i in range(n): # key에는 input을 저장하고 value에는 해당 index를 저장.
        try:
            num_dict[num_list[i]].add(i)
        except KeyError:
            num_dict[num_list[i]] = set()
            num_dict[num_list[i]].add(i)
    count = 0
    keys = num_dict.keys # keys
    alreadyFinded = set() # 찾은 key들을 저장하는 집합
    for start in range(n):
        end = start + 1
        while end < n:
            to_find = num_list[start] + num_list[end] # num_list에서 두 수의 합을 찾는 수로 지정.
            if to_find in keys() and to_find not in alreadyFinded: # 찾는 수가 keys안에 없고, 이미 찾은 수도 아니면
                if num_dict[to_find] - set([start, end]): # 찾는 수가 가지고 있는 인덱스들 중 start와 end에 포함되지 않으면
                    count += len(num_dict[to_find]) # 해당 인덱스의 카운트를 모두 추가
                    alreadyFinded.add(to_find) # 이미 찾은 수에 해당 수 추가
            end += 1
    print(count)

if __name__ == '__main__':
    main()
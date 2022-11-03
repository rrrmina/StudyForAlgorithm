from sys import stdin


def main():
    r_line = stdin.readline
    n = int(r_line())
    meetingTime = list()
    for _ in range(n):
        meetingTime.append(list(map(int, r_line().split())))
    meetingTime.sort(key=lambda x:(x[1], x[0])) # 끝나는 시간을 기준으로 먼저 정렬, 끝나는 시간이 같은 경우 시작시간을 기준으로 정렬, #3 참조
    finish_time = 0
    count = 0
    for i in meetingTime:
        if i[0] >= finish_time: # 만약 시작시간이 끝나는 시간보다 크거나 같을 때 #2 참조
            finish_time = i[1] # 끝나는 시간을 현재 끝나는 시간으로 바꾸고
            count += 1 # count증가
    print(count)

if __name__ == '__main__':
    main()
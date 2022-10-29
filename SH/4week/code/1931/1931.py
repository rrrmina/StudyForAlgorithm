from sys import stdin
from time import perf_counter #delete


def main():
    start = perf_counter() #delete
    r_line = stdin.readline
    n = int(r_line())
    meeting = dict()
    for _ in range(n): # O(n)
        temp1, temp2 = map(int, r_line().split())
        if meeting.get(temp1):
            if meeting[temp1] > temp2:
                meeting[temp1] = temp2
        else:
            meeting[temp1] = temp2
    temp = sorted(meeting.items())
    max_finish_time = temp[-1][-1]
    meeting = dict(temp)

    start_time = 0
    max_count = 0
    operationCount = 0 #delete
    for i in meeting.keys(): # O(n)
        operationCount += 1
        count = 0
        start_time = i
        while start_time < max_finish_time: #O (n^2)
            operationCount += 1
            try:
                start_time = meeting[start_time] + 1
            except KeyError:
                start_time += 1
                continue
            count += 1
            if start_time >= max_finish_time:
                if count > max_count:
                    max_count = count
                break
    print(max_count)
    print(f'operation : {operationCount}')
    print(f'time : {perf_counter() - start}')

if __name__ == '__main__':
    main()
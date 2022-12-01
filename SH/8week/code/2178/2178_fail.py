import sys
from collections import deque
from math import hypot

def getDistance(src, dest):
    return abs(src[0] - dest[0]) + abs(src[1] - dest[1])

def getNext(maze: list, src: tuple, dest: tuple, priority: deque, min_init):
    min = min_init
    distance = getDistance((1, 1), dest)
    returnCol = (0, 0)
    if maze[src[0] - 1][src[1]] and (src[0] - 1, src[1]) not in priority:
        get_distance_src_dest = getDistance((src[0] - 1, src[1]), dest)
        temp = hypot(abs(src[0] - 1 - dest[0]), abs(src[1] - dest[1]))
        if get_distance_src_dest < distance:
            distance = get_distance_src_dest
            returnCol = (src[0] - 1, src[1])
            min = temp
        elif get_distance_src_dest == distance:
            temp = hypot(abs(src[0] - 1 - dest[0]), abs(src[1] - dest[1]))
            if temp < min:
                min = temp
                returnCol = (src[0] - 1, src[1])
    if maze[src[0]][src[1] + 1] and (src[0], src[1] + 1) not in priority:
        get_distance_src_dest = getDistance((src[0], src[1] + 1), dest)
        temp = hypot(abs(src[0] - dest[0]), abs(src[1] + 1 - dest[1]))
        if get_distance_src_dest < distance:
            distance = get_distance_src_dest
            returnCol = (src[0], src[1] + 1)
            min = temp
        elif get_distance_src_dest == distance:
            if temp < min:
                min = temp
                returnCol = (src[0], src[1] + 1)
    if maze[src[0] + 1][src[1]] and (src[0] + 1, src[1]) not in priority:
        get_distance_src_dest = getDistance((src[0] + 1, src[1]), dest)
        temp = hypot(abs(src[0] + 1 - dest[0]), abs(src[1] - dest[1]))
        if get_distance_src_dest < distance:
            distance = get_distance_src_dest
            returnCol = (src[0] + 1, src[1])
            temp = min
        elif get_distance_src_dest == distance:
            temp = hypot(abs(src[0] + 1 - dest[0]), abs(src[1] - dest[1]))
            if temp < min:
                min = temp
                returnCol = (src[0] + 1, src[1])
    if maze[src[0]][src[1] - 1] and (src[0], src[1] - 1) not in priority:
        get_distance_src_dest = getDistance((src[0], src[1] - 1), dest)
        temp = hypot(abs(src[0] - dest[0]), abs(src[1] - 1 - dest[1]))
        if get_distance_src_dest < distance:
            distance = get_distance_src_dest
            returnCol = (src[0], src[1] - 1)
            min = temp
        elif get_distance_src_dest == distance:
            temp = hypot(abs(src[0] - dest[0]), abs(src[1] - 1 - dest[1]))
            if temp < min:
                min = temp
                returnCol = (src[0], src[1] - 1)
    return returnCol

        
def getRouteCount(maze: list, src: tuple, dest: tuple, min_init):
    count = 1   
    priorityQueue = deque()
    current = src
    while current != dest:
        priorityQueue.append(current)
        current = getNext(maze, current, dest, priorityQueue, min_init)
        count += 1
        if len(priorityQueue) > 8:
            priorityQueue.popleft()
    return count

def main():
    r_line = sys.stdin.readline
    n, m = map(int, r_line().split())
    min_init = hypot(n, m)
    maze = [[0]*(m + 2) for _ in range(n + 2)]
    for i in range(1, n + 1):
        maze[i] = list(map(int, list('0'+str(input())+'0')))
    print(getRouteCount(maze, (1, 1), (n, m), min_init))
    
if __name__ == '__main__':
    main()
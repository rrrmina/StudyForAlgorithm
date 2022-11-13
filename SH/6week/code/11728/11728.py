import sys
r_line = sys.stdin.readline
n, m = map(int, r_line().split())
del n, m
list1 = list(map(int, r_line().split()))
list2 = list(map(int, r_line().split()))
for i in sorted(list1 + list2): print(i, end=" ")
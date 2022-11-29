from sys import stdin
from collections import deque


count = 0
toPrint = deque()
def dfs(node_dict, start, n, before: set):
	global count, toPrint
	if count == n:
		return
	toPrint.append(start)
	if node_dict[start]:
		before.add(start)
		count += 1
		for i in node_dict[start]:
			if i not in before:
				dfs(node_dict, i, n, before)

def bfs(node_dict, start):
	visited = set()
	toPrint.append(start)
	visited.add(start)
	while toPrint:
		temp = toPrint.popleft()
		print(temp, end=" ")
		for i in node_dict[temp]:
			if i not in visited:
				toPrint.append(i)
				visited.add(i)

def main():
	r_line = stdin.readline
	n, m ,v = map(int, r_line().split())
	node_dict = dict()
	for i in range(1, n + 1):
		node_dict[i] = list()
	for _ in range(m):
		tmp1, tmp2 = map(int, r_line().split())
		node_dict[tmp1].append(tmp2)
		node_dict[tmp2].append(tmp1)
	for i in range(1, n + 1):
		node_dict[i] = sorted(node_dict[i])
	global toPrint, count
	dfs(node_dict, v, n, {0})
	for i in toPrint: print(i, end=" ")
	print()
	toPrint.clear()
	count = 0
	bfs(node_dict, v)
	print()

if __name__ == '__main__':
	main()
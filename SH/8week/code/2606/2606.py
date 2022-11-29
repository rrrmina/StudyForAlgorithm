from collections import deque


def bfs(graph, start):
	count = 0
	visited = set()
	queue = deque()
	queue.append(start)
	visited.add(start)
	while queue:
		to_pop = queue.popleft()
		for i in graph[to_pop]:
			if i not in visited:
				queue.append(i)
				visited.add(i)
				count += 1
	return count

def main():
	n = int(input())
	k = int(input())
	graph = dict()
	for i in range(1, n + 1):
		graph[i] = list()
	for _ in range(k):
		tmp1, tmp2 = map(int, input().split())
		graph[tmp1].append(tmp2)
		graph[tmp2].append(tmp1)
	print(bfs(graph, 1))

if __name__ == '__main__':
	main()
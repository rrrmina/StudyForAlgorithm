from sys import stdin, setrecursionlimit
setrecursionlimit(10**6)
r_line = stdin.readline

n, m = map(int, r_line().split())
battleGround = [[0]*n for i in range(m)]
count = 1
def dfs(row, col, char):
	global n, m, battleGround, count
	if col + 1 < n and battleGround[row][col + 1] == char:
		count += 1
		battleGround[row][col + 1] = 0
		dfs(row, col + 1, char)
	if row > 0 and battleGround[row - 1][col] == char:
		count += 1
		battleGround[row - 1][col] = 0
		dfs(row - 1, col, char)
	if col > 0 and battleGround[row][col - 1] == char:
		count += 1
		battleGround[row][col - 1] = 0
		dfs(row, col - 1, char)
	if row + 1< m and battleGround[row + 1][col] == char:
		count += 1
		battleGround[row + 1][col] = 0
		dfs(row + 1, col, char)

def main():
	global n, m, battleGround, count
	for i in range(m):
		battleGround[i] = list(input())
	bluePower = 0
	whitePower = 0
	for row in range(m):
		for col in range(n):
			temp = battleGround[row][col]
			if temp:
				if temp == 'W':
					battleGround[row][col] = 0
					dfs(row, col, 'W')
					whitePower += count ** 2
					count = 1
				else:
					battleGround[row][col] = 0
					dfs(row, col, 'B')
					bluePower += count ** 2
					count = 1
	print(f"{whitePower} {bluePower}")

if __name__ == '__main__':
	main()
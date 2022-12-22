import sys
from itertools import combinations as comb


def getPlayerStats(team: tuple, teamStats: list)->int:
	sum = 0
	for i in comb(team, 2):
		sum += teamStats[i[0]][i[1]] + teamStats[i[1]][i[0]]
	return sum

def main():
	input = sys.stdin.readline
	n = int(input())
	teamStats = [[0]*(n + 1) for _ in range(n + 1)]
	players = set(range(1, n + 1)) #player정의
	result_set = set()
	for i in range(1, n + 1):
		teamStats[i] = [0] + list(map(int, input().split()))
	temp = list(comb(players, n//2))
	temp = temp[0:len(temp)//2] #어차피 뒤에서 뺄거기 때문에 반만 필요함.
	for i in temp:
		team1, team2 = i, tuple(players - set(i)) #여기서 빼줌 ({1,2,3,4} - {1,2} = {3,4})
		stat1, stat2 = getPlayerStats(team1, teamStats), getPlayerStats(team2, teamStats) # 각 팀의 능력치를 구해줌.
		result = abs(stat1 - stat2)
		if result == 0: # result가 0이면 바로 출력
			return print(0)
		else: # 아니면 result set에 담음.
			result_set.add(result)
	print(min(result_set)) # 최솟값 출력.
		
if __name__ == '__main__':
	main()
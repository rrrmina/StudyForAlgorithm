import sys


def getMinCityChickenDistance(dstCk: tuple, houses: list, city: list)->int:
	sum = 0
	for i in houses:
		sum += getDistance(dstCk, i)
	return sum

def getDistance(cor1: tuple, cor2: tuple)->int:
	return abs(cor1[0] - cor2[0]) + abs(cor1[1] - cor2[1])

def main():
	input = sys.stdin.readline
	n, m = map(int, input().split())
	city = [[0] * n for i in range(n)]
	chickenCoordinates = list()
	houseCoordinates = list()
	distances = dict()
	for i in range(n):
		city[i] = list(map(int, input().split()))
	for i in range(n):
		for j in range(n):
			if city[i][j]:
				if city[i][j] == 1:
					houseCoordinates.append((i, j))
				else:
					chickenCoordinates.append((i, j))
	sum = 0
	for i in houseCoordinates:
		min = n * n
		for j in chickenCoordinates:
			distance = getDistance(i, j)
			if distance < min:
				min = distance
		sum += distance
		print(sum)
if __name__ == '__main__':
	main()
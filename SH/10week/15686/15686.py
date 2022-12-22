import sys

def getCkPriorityCol(chickenCol: tuple, houses: list)->int:
	sum = 0
	for hsCol in houses:
		sum += getDistance(hsCol, chickenCol)
	return sum

def houseChickenDistance(hosueCol: tuple, chickens: list)->int:
	min_distance = None
	for ckCol in chickens:
		coldi = getDistance(hosueCol, ckCol)
		if min_distance == None:
			min_distance = coldi
		else:
			if min_distance > coldi:
				min_distance = coldi
	return min_distance

def getDistance(cor1: tuple, cor2: tuple)->int:
	return abs(cor1[0] - cor2[0]) + abs(cor1[1] - cor2[1])

def main():
	input = sys.stdin.readline
	n, m = map(int, input().split())
	city = [[0] * n for i in range(n)]
	chickenCoordinates = dict()
	priorityDict = dict()
	houseCoordinates = list()
	for i in range(n):
		city[i] = list(map(int, input().split()))
	for i in range(n):
		for j in range(n):
			if city[i][j]:
				if city[i][j] == 1:
					houseCoordinates.append((i, j))
				else:
					chickenCoordinates[(i, j)] = 0
	for ckCol in chickenCoordinates:
		priority = getCkPriorityCol(ckCol, houseCoordinates)
		chickenCoordinates[ckCol] = priority
		try:
			priorityDict[priority].append(ckCol)
		except KeyError:
			priorityDict[priority] = [ckCol]
	ckPriorityStack = sorted(list(chickenCoordinates.values()))
	count = len(chickenCoordinates.keys()) - 1
	while count > m - 1:
		num = n ** 2
		if count == m - 1:
			break
		for i in priorityDict[ckPriorityStack[count]]:
			temp = houseChickenDistance(i, houseCoordinates)
			if temp < num:
				target = i
				num = temp
		del priorityDict[chickenCoordinates[target]]
		del chickenCoordinates[target]
		count -= 1
	sum = 0
	for i in houseCoordinates:
		sum += houseChickenDistance(i, chickenCoordinates)
	print(sum)
if __name__ == '__main__':
	main()
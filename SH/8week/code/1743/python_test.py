import random

def main():
	n, k, m = map(int, (input().split()))
	random1 = [i for i in range(1, n + 1)]
	random2 = [i for i in range(1, k + 1)]
	existSet = set()
	count = 0
	print(f"{n} {k} {m}")
	while count < m:
		temp1 = random.choice(random1)
		temp2 = random.choice(random2)
		tempTuple = (temp1, temp2)
		if tempTuple not in existSet:
			existSet.add(tempTuple)
			print(f"{temp1} {temp2}")
			count += 1

if __name__ == '__main__':
	main()
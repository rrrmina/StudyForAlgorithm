from sys import stdin, setrecursionlimit
setrecursionlimit(100000000)


def makeDict(square: list, cordinate: tuple)->list:
	return_list = list()
	try:
		if square[cordinate[0] - 1][cordinate[1]]:
			return_list.append((cordinate[0] - 1, cordinate[1]))
	except IndexError:
		pass
	try:
		if square[cordinate[0] + 1][cordinate[1]]:
			return_list.append((cordinate[0] + 1, cordinate[1]))
	except IndexError:
		pass
	try:
		if square[cordinate[0]][cordinate[1] - 1]:
			return_list.append((cordinate[0], cordinate[1] - 1))
	except IndexError:
		pass
	try:
		if square[cordinate[0]][cordinate[1] + 1]:
			return_list.append((cordinate[0], cordinate[1] + 1))
	except IndexError:
		pass
	return return_list

visited = set()
def get_biggest(index_dict, cor: tuple):
	global visited
	if not index_dict[cor]:
		return
	else: visited.add(cor)
	for i in index_dict[cor]:
		if i not in visited:
			visited.add(i)
			get_biggest(index_dict, i)

def main():
	input = stdin.readline
	n, m, k = map(int, input().split())
	square = [[0]*(m + 1) for i in range(n + 1)]
	index_dict = dict()
	index_list = set()
	for _ in range(k):
		tmp1, tmp2 = map(int, input().split())
		index_list.add((tmp1, tmp2))
		square[tmp1][tmp2] = 1
	for i in index_list:
		try:
			index_dict[i].append(makeDict(square, i))
		except KeyError:
			index_dict[i] = makeDict(square, i)
	global visited
	max = 0
	for i in index_list:
		get_biggest(index_dict, i)
		count = len(visited)
		if count > max:
			max = count
		visited.clear()
	print(max)

if __name__ == '__main__':
	main()
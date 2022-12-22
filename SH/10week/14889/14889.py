import sys
import itertools

def main():
	input = sys.stdin.readline
	comb = itertools.combinations
	n = int(input())
	s = [[0]*(n + 1) for i in range(n + 1)]
	sqtopSgmnt = dict()
	sqdownSgmnt = dict()
	sum_dict = dict()
	for i in range(1, n + 1):
		s[i] = [0] + list(map(int, input().split()))
	col_index = col_init = 2
	row_index = 1
	while row_index < n + 1:
		while col_index < n + 1:
			try:
				sqtopSgmnt[(row_index, col_index)].append(s[row_index][col_index])
				sqdownSgmnt[(col_index, row_index)].append(s[col_index][row_index])
			except KeyError:
				sqtopSgmnt[(row_index, col_index)] = [s[row_index][col_index]]
				sqdownSgmnt[(col_index, row_index)] = [s[col_index][row_index]]
			col_index += 1
		col_init += 1
		col_index = col_init
		row_index += 1
	# print('top')
	# print(sqtopSgmnt)
	# print('down')
	# print(sqdownSgmnt)
	for key1, value1, value2 in zip(sqtopSgmnt.keys(), sqtopSgmnt.values(), sqdownSgmnt.values()):
		sum_dict[key1] = sum(value1 + value2)
	print(sum_dict)
	# for i in comb(sum_list, n//2):
	# 	sum = 0
	# 	for j in comb(i, 2):
	# 		sum += j[0] - j[1]
	# 	print(sum)
if __name__ == '__main__':
	main()
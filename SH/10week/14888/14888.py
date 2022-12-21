from itertools import permutations


def main():
	n: int = int(input())
	A: list = list(map(int, input().split()))
	operators_count: list =  list(map(int, input().split()))
	operators = ['+', '-', '*', '/']
	cal = list()
	for i in range(len(operators_count)):
		if operators_count[i]:
			for j in range(operators_count[i]):
				cal.append(operators[i])
	opComb = list(set(permutations(cal, len(cal)))) #가능한 조합 추출
	# set으로 중복제거를 안할시 '+','+','-'와 같은 조합을 다른것으로 보고 2개를 만듬.(순서)
	max_num = None
	min_num = None
	for i in opComb:
		result = A[0]
		for j, k in zip(range(1, len(A)), i):
			to_cal_str = f'{result}{k}{A[j]}' #각 조합을 숫자 사이에 끼워 넣음
			result = int(eval(to_cal_str))
		if max_num == None: # 결과 검사
			max_num = result
		else:
			if max_num > result:
				max_num = result
		if min_num == None:
			min_num = result
		else:
			if min_num < result:
				min_num = result
	print(min_num)
	print(max_num)

if __name__ == '__main__':
	main()
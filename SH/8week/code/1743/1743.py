from sys import stdin, setrecursionlimit
setrecursionlimit(10**9)


def makeDict(square: list, cordinate: tuple)->list: # 이미 이전에 한칸씩 크게 잡았기 때문에 indexerror고려X
	return_list = list()
	if square[cordinate[0] - 1][cordinate[1]]:
		return_list.append((cordinate[0] - 1, cordinate[1]))
	if square[cordinate[0] + 1][cordinate[1]]:
		return_list.append((cordinate[0] + 1, cordinate[1]))
	if square[cordinate[0]][cordinate[1] - 1]:
		return_list.append((cordinate[0], cordinate[1] - 1))
	if square[cordinate[0]][cordinate[1] + 1]:
		return_list.append((cordinate[0], cordinate[1] + 1))
	return return_list

visited = set() # 루프를 돌때 체크하기 위함
alreadyCheck = set() # main에서 반복문을 줄이기 위함
def get_biggest(index_dict, cor: tuple):
	global visited
	if not index_dict[cor]: # 만약 연결되어 있는 부분이 없으면 리턴
		return
	for i in index_dict[cor]:
		if i not in visited: # 연결되어 있는 부분중 방문하지 않은 곳이 있다면
			visited.add(i) # 방문에 추가하고
			alreadyCheck.add(i) # alreadyCheck에 추가하고
			get_biggest(index_dict, i) # 연결되어 있는 부분으로 다시 루프시작.

def main():
	input = stdin.readline
	n, m, k = map(int, input().split())
	square = [[0]*(m + 2) for i in range(n + 2)]
	index_dict = dict() # 각 좌표에서 연결되어 있는 부분을 찾기 위함
	index_set = set() # 인덱스 입력

	for _ in range(k):
		tmp1, tmp2 = map(int, input().split())
		index_set.add((tmp1, tmp2))
		square[tmp1][tmp2] = 1
	for i in index_set: # 시간을 줄이기 위해 append대신 0으로 초기화 후 리스트 입력
		index_dict[i] = 0
	for i in index_set:
		index_dict[i] = makeDict(square, i)

	global visited
	max = 0
	for i in index_set:
		if i not in alreadyCheck: # 만약 이 조건문이 없으면 3만번돌걸 약 280만번 돌음.
								  # 이미 확인한 부분은 연결이 되어있기 때문에 또 확인할 필요가 없음.
			get_biggest(index_dict, i) # 루프시작
			count = len(visited)
			if count > max: # 루프를 빠져나온 후 방문한 곳의 수가 count, count가 max보다 크면 max 바꿈.
				max = count
			visited.clear() # 다시 루프를 돌기위해 방문 초기화
	print(max)

if __name__ == '__main__':
	main()
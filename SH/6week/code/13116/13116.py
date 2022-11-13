from sys import stdin, setrecursionlimit
recurLimit = 2147483647
setrecursionlimit(recurLimit)


def getRoute(n, tree):
    route = set()
    while tree[n][0] > 0: # tree[n][0]은 해당 노드의 부모노드, 부모노드가 0보다 클때까지는, (노드[1]의 부모는 임시로 0이라고 지정해놓았기 때문, 실제로는 없음.)
        route.add(n)
        n = tree[n][0]
    route.add(1)
    return route # 해당 노드까지 가는 경로를 담은 set 리턴.

def makeTree(parent, n, tree):
    if n >= 1024: # key에러 방지를 위해 (getRoute함수에서) 한 줄기 더 만듦. (1023 : [2046, 2047]까지)
        return None
    tree[n] = [parent, 2 * n, 2 * n + 1]
    makeTree(n, 2 * n , tree)
    makeTree(n, 2 * n + 1, tree)

def main():
    r_line = stdin.readline
    tree = dict()
    makeTree(0, 1, tree) # tree 생성
    t = int(r_line())
    test_case = list()
    for _ in range(t):
        test_case.append(list(map(int, r_line().split())))
    for i in test_case:
        print(10 * max(getRoute(i[0], tree) & getRoute(i[1], tree))) # 테스트케이스의 각 노드별 경로에서 교집합 중 가장 큰 값을 구함.

if __name__ == '__main__':
    main()
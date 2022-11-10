from sys import stdin, setrecursionlimit
recurLimit = 2147483647
setrecursionlimit(recurLimit)

visited = set()
answer = dict()
def tree_loop(node, tree_dict):
    global visited, answer
    for i in tree_dict[node]: # node에 연결된 다른 node들을 순차적으로 순회
        if i not in visited: # 만약 방문을 안한 node라면
            visited.add(i) # 방문에 추가하고
            answer[i] = node # 해당 노드는 이전 node부터 왔기 때문에 답에 추가(i는 node의 자식임)
            tree_loop(i, tree_dict) # 다시 해당 노드(i)부터 loop돌림 
    return None # 끝까지 갔는데 해당 노드에 연결된 모든 노드들이 다 방문했으면 리턴.

def main():
    global answer
    r_line = stdin.readline
    n = int(r_line())
    tree_dict = dict()
    for i in range(n):
        tree_dict[i + 1] = set()
    for _ in range(n - 1): # 일단 부모,자식 신경쓰지말고 연결된 노드는 다 갖다박음.
        node1, node2 = map(int, r_line().split())
        tree_dict[node1].add(node2)
        tree_dict[node2].add(node1)
    tree_loop(1, tree_dict) # root부터 loop시작
    for i in range(2, n + 1):
        print(answer[i])

if __name__ == '__main__':
    main()
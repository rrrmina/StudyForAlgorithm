def backTour(root: str, tree: dict, stack: list):
    if tree[root][0] != '.':
        backTour(tree[root][0], tree, stack)
    if tree[root][1] != '.':
        backTour(tree[root][1], tree, stack)
    stack.append(root)

def mediumTour(root: str, tree: dict, stack: list):
    if tree[root][0] != '.':
        mediumTour(tree[root][0], tree, stack)
    stack.append(root)
    if tree[root][1] != '.':
        mediumTour(tree[root][1], tree, stack)

def potentialTour(root: str, tree: dict, stack: list):
    stack.append(root)
    if tree[root][0] != '.':
        potentialTour(tree[root][0], tree, stack)
    if tree[root][1] != '.':
        potentialTour(tree[root][1], tree, stack)

def main():
    n = int(input())
    tree = dict()
    stack = list()
    for _ in range(n):
        root, leftChild, rightChild = map(str, input().split())
        tree[root] = [leftChild, rightChild]
    # 결국 root부터 시작해서 전체를 순회하는 것은 똑같지만, 언제 답을 출력할지만 결정하면 된다.    
    potentialTour('A', tree, stack) # 전위 순회는 맨 마지막에 추가
    print(''.join(stack))
    stack.clear()
    mediumTour('A', tree, stack) # 중위 순회는 중간에 추가
    print(''.join(stack))
    stack.clear()
    backTour('A', tree, stack) # 후위 순회는 맨 처음에 추가
    print(''.join(stack))
    stack.clear()

if __name__ == '__main__':
    main()
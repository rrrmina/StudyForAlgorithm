from sys import stdin, setrecursionlimit
setrecursionlimit(100000000)


class minHeap:
    def __init__(self):
        self.tree = list()

    def determineOperation(self, n):
        if not n:
            self.printTop()
        else:
            self.insert(n)

    def printTop(self):
        try:
            self.tree[0], self.tree[-1] = self.tree[-1], self.tree[0]
            print(self.tree.pop())
            self.seep(0)
        except IndexError:
            print(0)
    
    def insert(self, n):
        self.tree.append(n)
        self.repairTree(len(self.tree) - 1)

    def repairTree(self, child):
        if not child:
            return
        parent = (child - 1) // 2
        if self.tree[child] < self.tree[parent]:
            self.tree[child], self.tree[parent] = self.tree[parent], self.tree[child]
            self.repairTree(parent)
        return
    
    def seep(self, parent):
        child1, child2 = 2 * parent + 1, 2 * parent + 2
        lastIndex = len(self.tree) - 1
        if child1 <= lastIndex and child2 > lastIndex:
            node = child1
        elif child2 <= lastIndex and child1 > lastIndex:
            node = child2
        elif child1 > lastIndex and child2 > lastIndex:
            return
        else:
            if self.tree[child1] < self.tree[child2]:
                node = child1
            else:
                node = child2
        if self.tree[node] < self.tree[parent]:
            self.tree[node], self.tree[parent] = self.tree[parent], self.tree[node]
            self.seep(node)
            return

def main():
    r_line = stdin.readline
    n = int(r_line())
    heap = minHeap()
    for _ in range(n):
        heap.determineOperation(int(r_line()))

if __name__ == '__main__':
    main()
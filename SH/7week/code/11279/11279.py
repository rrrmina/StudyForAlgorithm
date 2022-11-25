class maxHeap:
    def __init__(self):
        self.tree = dict()
        self.root = 0

    def insert(self, num):
        self.tree[num] = [0, 0]
        if self.root == 0:
            self.root = num
        else:
            self.repair_heap(num, self.root)
            if num > self.root:
                self.root = num

    def repair_heap(self, num, node):
        if num > node:
            self.tree[num], self.tree[node] = self.tree[node], self.tree[num]
            self.repair_heap(node, num)
        else:
            child1, child2 = self.tree[node][0], self.tree[node][1]
            if num > child1:
                self.tree[node][0] = num
            elif num < child2:
                self.tree[node][1] = num
            else:
                self.repair_heap(num, node)

def main():
    # n = int(input())
    heap = maxHeap()
    heap.insert(3)
    heap.insert(4)
    heap.insert(5)
    heap.insert(7)
    print(heap.tree)

if __name__ == '__main__':
    main()
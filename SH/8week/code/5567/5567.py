n = int(input())
m = int(input())
count = 0
friendsDict = dict()
for _ in range(m):
    temp1, temp2 = map(int, input().split())
    try:
        friendsDict[temp1].add(temp2)
    except KeyError:
        friendsDict[temp1] = {temp2}
    try:
        friendsDict[temp2].add(temp1)
    except KeyError:
        friendsDict[temp2] = {temp1}
visited = {1}
detph = 0
count = 0
def search(friendsDict, node, depth):
    global count
    if depth > 2:
        return
    try:
        if depth <= 2:
            visited.add(node)
            count += 1
        for i in friendsDict[node]:
            if i not in visited:
                search(friendsDict, i, depth + 1)
    except KeyError:
        return
search(friendsDict, 1, 0)
print(visited)
print(count)

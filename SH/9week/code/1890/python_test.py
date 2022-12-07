import random

n = int(input())
random1 = [i for i in range(1, n)]
print(n)
for i in range(n):
    for j in range(n):
        if i == n - 1 and j == n - 1:
            print(0, end=" ")
        else:
            print(1, end=" ")
            # print(random.choice(random1), end=" ")
    print()
import numpy as np

n = int(input())
numbers = np.random.choice(range(1, n + 1), n, replace=False)
for i in numbers:
    print(i, end=" ")
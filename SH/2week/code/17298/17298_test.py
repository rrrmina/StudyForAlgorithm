import numpy as np
import os

os.chdir(os.path.dirname(__file__))

n = int(input('Number Input : '))
numbers = np.random.choice(range(1, n + 1), n, replace=False)
f = open('python_test.txt', 'w')
f.write(f'{n}\n')
for i in numbers:
    f.write(f'{i} ')
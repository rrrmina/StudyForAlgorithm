import numpy as np
import os

os.chdir(os.path.dirname(__file__))

n = int(input('Number Input : '))
numbers = np.random.choice(range(1, n + 1), n, replace=False)
numbers2 = np.random.choice(range(1, n + 1), n)
f = open('test_case.txt', 'w')
f.write(f'{n}')
f.write('\n')
for i in numbers:
    f.write(f'{i} ')
f.write('\n')
for i in numbers2:
    f.write(f'{i} ')


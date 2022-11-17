import random
import os
os.chdir(os.path.dirname(__file__))
n = int(input('n_input: '))
numbers = list()
for i in range(n):
    for j in range(n):
        numbers.append(random.choice([-1, 0, 1]))
f = open('python_test.txt', 'w')
f.write(f'{n}\n')
count = 0
for i in numbers:
    if count == n:
        count = 0
        f.write('\n')
    f.write(f'{i} ')
    count += 1
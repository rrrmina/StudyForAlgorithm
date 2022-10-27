from random import randint, sample
from string import ascii_lowercase

N, K = map(int, input('input N, K : ').split())
f = open('C:\Pig30nidaE\SFA\SH\\3week\\3078/random_testcase.txt', 'w')
f.write(f'{N} {K}\n')
for _ in range(N):
    n = randint(1, 10)
    f.write(f'{"".join(sample(ascii_lowercase, n))}\n')
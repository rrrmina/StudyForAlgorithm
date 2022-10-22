f = open('biggest_testcase.txt', 'w')
f.write('1000000\n')
for _ in range(1000000):
    f.write('1 ')
f.write('1000000')
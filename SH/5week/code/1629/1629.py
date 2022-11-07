a, b, c = map(int, input().split())
result = 1
while b > 0:
    if b % 2:
        result *= a
    a *= a
    b //= 2
print(result%c)
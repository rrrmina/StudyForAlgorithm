def pow(base, index, mod):
    r = 1
    while index:
        if index & 1:
            r = (r * base) % mod
        base = (base ** 2) % mod
        index >>= 1
    return r

a, b, c = map(int, input().split())
print(pow(a, b, c))

#진짜 1도 모르겠어서 인터넷의 코드를 참고함.
#https://library-of-k.tistory.com/73
#https://library-of-k.tistory.com/72
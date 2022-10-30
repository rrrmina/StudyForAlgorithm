a_num, b_num = map(int, input().split())
set_a = set(map(int, input().split()))
set_b = set(map(int, input().split()))
print(len(set_a - set_b) + len(set_b - set_a)) # 각각의 차집합의 길이를 더해준다.
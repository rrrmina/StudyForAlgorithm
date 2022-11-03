n, m = map(int, input().split())
n_set, m_set = set(), set()
for _ in range(n): 
    n_set.add(input())
count = 0
for _ in range(m): # set자료형은 중복을 허용하지 않기 때문에 m input에 중복된 값이 들어왔을 때를 고려해야함.
    temp = input()
    if temp in n_set: count += 1 # 만약 입력한 문자열이 집합 S에 있으면 count + 1
    else: m_set.add(temp) # 아니면 집합에 추가
print(len(n_set & m_set) + count)
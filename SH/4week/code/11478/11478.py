s = input()
stringSet = set() # 중복을 허용하지 않기 때문에 set자료형
for i in range(len(s)):
    for j in range(i, len(s)):
        stringSet.add(s[i : j+1]) # slicing 시켜서 set에 추가
print(len(stringSet))

from re import split

def main():
    input_formula = input()
    get_nums = list(split('[-+]', input_formula)) # -+를 기준으로 split한 list
    for i in range(len(get_nums)):
        if '0' in get_nums[i]:
            get_nums[i] = get_nums[i].lstrip('0') # 만약 0이 왼쪽에 있으면 다 지움.
    get_operators = list(i for i in input_formula if i == '-' or i == '+') # -+연산자만 담은 list
    formulaStrings = str()
    for num, op in zip(get_nums, get_operators): # 새로운 string에 두 개의 list를 활용해서 연결
        formulaStrings += num + op
    formulaStrings += get_nums[-1]
    formulaStrings = formulaStrings.split('-') # '-'를 기준으로 나눔.
    formulaWithBrackets = formulaStrings[0]
    for i in range(1, len(formulaStrings)):
        formulaWithBrackets += '-(' + formulaStrings[i] + ')' # -뒤의 +연산자들을 먼저 계산한 후 빼주면 됨.
    print(eval(formulaWithBrackets)) # 계산.

if __name__ == '__main__':
    main()

# arr = input().split('-')
# s = 0
# for i in arr[0].split('+'):
#     s += int(i) ## int('00009') == 9
# for i in arr[1:]:
#     for j in i.split('+'):
#         s -= int(j) ## eval 쓸 필요도 없이 그냥 빼주면됨.
# print(s)
# 출처: https://sungmin-joo.tistory.com/67 [Big-Joo의 공부기록:티스토리]
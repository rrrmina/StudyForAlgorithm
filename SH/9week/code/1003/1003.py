def fibonacci(n, memo)->list:
    global zero_count, one_count
    if n in memo.keys():
        return [memo[n][0], memo[n][1]] # 메모가 되어있으면 해당 메모 리스트 리턴.
    else: # 메모가 없으면
        result1 = fibonacci(n - 1, memo) # 피보나치 실행
        result2 = fibonacci(n - 2, memo)
        memo[n] = [result1[0] + result2[0], result1[1] + result2[1]] # 실행결과 메모
        return memo[n] # 메모 리턴

def main():
    t = int(input())
    memo = dict()
    memo[0] = [1, 0]
    memo[1] = [0, 1]
    for _ in range(t):
        n = int(input())
        result = fibonacci(n, memo) # 피보나치의 결과가 리스트로 저장.
        print(f"{result[0]} {result[1]}")

if __name__ == '__main__':
    main()
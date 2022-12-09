n = int(input())
num_list = [0] + list(map(int, input().split()))
dp = [0] * (n + 1)
for i in range(1,n+1):
    for j in range(i+1):
        if num_list[j] < num_list[i]:
            dp[i] = max(dp[i], dp[j]+1)
print(max(dp))
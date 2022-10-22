from sys import stdin

def main():
    r_line = stdin.readline
    N, M = map(int, r_line().split())
    whoDidnTHear = set()
    whhvtSeen = set()

    for _ in range(N):
        whoDidnTHear.add(r_line().strip()) #듣잡 인풋, set자료형
    for _ in range(M):
        whhvtSeen.add(r_line().strip()) #보잡 인풋, set자료형
    neitherHeardSeen = list(whoDidnTHear & whhvtSeen) #듣잡과 보잡의 교집합 : 듣보잡
    print(len(neitherHeardSeen))
    for i in sorted(neitherHeardSeen): #정렬 후 출력
        print(i)

if __name__ == '__main__':
    main()
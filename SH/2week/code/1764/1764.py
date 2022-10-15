from sys import stdin

def main():
    r_line = stdin.readline
    N, M = map(int, r_line().split())
    whoDidnTHear = set()
    whhvtSeen = set()

    for _ in range(N):
        whoDidnTHear.add(r_line().strip())
    for _ in range(M):
        whhvtSeen.add(r_line().strip())
    neitherHeardSeen = list(whoDidnTHear & whhvtSeen)
    print(len(neitherHeardSeen))
    for i in sorted(neitherHeardSeen):
        print(i)

if __name__ == '__main__':
    main()
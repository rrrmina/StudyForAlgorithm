def main():
    testcaseNum = int(input())
    for _ in range(testcaseNum):
        flag = False
        src, dst = input().split()
        src, dst = sorted(list(src)), sorted(list(dst))
        for i, j in zip(src, dst):
            if i != j:
                print('Impossible')
                flag = True
                break
        if not flag:
            print('Possible')
        
if __name__ == '__main__':
    main()
def main():
    allNumStack = list(range(1, 31))
    for i in range(28):
        tempNum = int(input())
        allNumStack.remove(tempNum)       
    for i in allNumStack:
        print(i)

if __name__ == '__main__':
    main()
def moveHanoi(n, start, end):
    if n == 1:
        print(f"{start} {end}")
        return
    moveHanoi(n - 1, start, 6 - start - end)
    print(start, end)
    moveHanoi(n - 1, 6 - start - end, end)

def main():
    n = int(input())
    print(2 ** n - 1)
    moveHanoi(n, 1, 3)

if __name__ == '__main__':
    main()
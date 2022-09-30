def main():
    from string import ascii_lowercase
    string = list(input())
    alphabet_list = list(ascii_lowercase)
    for i in alphabet_list:
        try:
            print(string.index(i), end = ' ')
        except ValueError:
            print('-1', end = ' ')

if __name__ == '__main__':
    main()
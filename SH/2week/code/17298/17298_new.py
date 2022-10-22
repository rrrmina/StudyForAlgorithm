from sys import stdin

def main():
    r_line = stdin.readline
    N = int(r_line())
    RIGHT_LARGE_NUMBER_STACK = list()
    to_print_stack = list()
    input_list = list(map(int, r_line().split()))
    RIGHT_LARGE_NUMBER_STACK.append(input_list[0])
    for i in range(1, N):
        if input_list[i] > input_list[i - 1]:
            index = len(RIGHT_LARGE_NUMBER_STACK) - 1
            while input_list[i] > RIGHT_LARGE_NUMBER_STACK[index] and RIGHT_LARGE_NUMBER_STACK:
                RIGHT_LARGE_NUMBER_STACK.pop()
                to_print_stack.append(input_list[i])
                index -= 1
        RIGHT_LARGE_NUMBER_STACK.append(input_list[i])
    to_print_stack.append(-1)
    for i in to_print_stack:
        print(i, end=" ")

if __name__ == '__main__':
    main()
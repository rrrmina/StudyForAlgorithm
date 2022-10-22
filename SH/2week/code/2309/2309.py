from itertools import combinations

def main():
    dwarf_list = list()
    for _ in range(9):
        dwarf_list.append(int(input()))
    all_combinations = [sorted(i) for i in list(combinations(dwarf_list, 7)) if sum(i) == 100] #7개의 숫자로 만들 수 있는 모든 조합 리스트.
    for i in all_combinations[0]:
        print(i)

if __name__ == '__main__':
    main()
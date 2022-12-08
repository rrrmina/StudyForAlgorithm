def main():
    from sys import stdin
    input = stdin.readline
    treeSpecies = dict()
    total = 0
    while True:
        temp = input().strip()
        if not temp:
            break
        try:
            treeSpecies[temp] += 1
        except KeyError:
            treeSpecies[temp] = 1
        finally:
            total += 1
    for species in sorted(treeSpecies.keys()):
        print(f"{species} {(treeSpecies[species]/total)*100:.4f}") # !주의! round함수를 쓰면 틀림. ex: round(0.5)==round(-0.5)==0

if __name__ == '__main__':
    main()
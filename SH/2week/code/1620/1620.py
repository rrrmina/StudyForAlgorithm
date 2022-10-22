from sys import stdin

def main():
    r_line = stdin.readline #주의! input()으로 받으면 시간초과뜸.
    N, M = map(int, r_line().split())
    PokemonDict = dict() 
    PokemonDictReversed = dict() # dict의 key참조로 value를 찾는 것은 O(1)임. 이전 선택정렬문제에서 유용하게 썼음. (24053번)
                                 # 만약 따로 Reversed Dict를 선언해주지않고 value를 통해 key를 찾으려면, dict요소를 모두 순회해야하기 때문에 시간복잡도가 O(n)으로 늘어날 수 있어서 따로 선언.
    for i in range(N): #O(n)
        pokemon_input = str(r_line().strip()) #포켓몬 받아서 공백제거, readline은 공백까지 받기 때문.
        PokemonDict[i + 1] = pokemon_input #{key} : {value} --> {인덱스} : {포켓몬}
        PokemonDictReversed[f'{pokemon_input}'] = i + 1 #{key} : {value} --> {포켓몬} : {인덱스}
    
    for _ in range(M): #O(2n)
        to_find = r_line().strip()
        if to_find.isdigit(): #숫자면 해당 그냥 Dict에서 출력
            print(PokemonDict[int(to_find)])
        else: #숫자가 아니면 Reversed Dict에서 출력
            print(PokemonDictReversed[f'{to_find}'])

if __name__ == '__main__':
    main()
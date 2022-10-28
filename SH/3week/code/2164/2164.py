from collections import deque


class Card():
    def __init__(self, N):
        self.deck = deque(int(i) for i in range(N, 0, -1)) # 카드 덱 생성
        self.deck_length = N # 덱에 있는 카드 개수, len함수 쓸필요 없음 (근데 len함수 시간복잡도 어차피 O(1)이긴 함.)

    def discardCard(self):
        self.deck.pop()
        self.deck_length -= 1 #카드 버리면 덱 크기 하나 줄어듬

    def movingTopBottom(self):
        self.deck.rotate(1) # 덱의 맨위에 있는 카드를 밑으로 돌리는 것 -> 주어진 배열을 한 칸씩 오른쪽으로 돌리면 됨.


def main():
    N = int(input())
    card = Card(N)
    while card.deck_length > 1: # 덱의 카드 개수가 1보다 클 동안,
        card.discardCard() # 카드를 버리고,
        card.movingTopBottom() # 맨 위의 카드를 맨 아래로 옮긴다.
    print(card.deck[0]) # 남은 카드를 출력

if __name__ == '__main__':
    main()
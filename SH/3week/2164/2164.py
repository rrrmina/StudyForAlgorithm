from collections import deque


class Card():
    def __init__(self, N):
        self.deck = deque(int(i) for i in range(N, 0, -1))
        self.deck_length = N

    def discardCard(self):
        self.deck.pop()
        self.deck_length -= 1

    def movingTopBottom(self):
        self.deck.rotate(1)


def main():
    N = int(input())
    card = Card(N)
    while card.deck_length > 1:
        card.discardCard()
        card.movingTopBottom()
    print(card.deck[0])

if __name__ == '__main__':
    main()
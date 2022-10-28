# What Is Queue
### Content
- Queue
- 종류
    - Array
    - Circular
    - Linked List
    - Priority

<br/>


## Queue
- 한쪽 끝(front)에서만 삽입이 이루어지고, 다른 한쪽 끝(rear)에서는 삭제 연산만 이뤄지는 유한 순서 리스트
- 선입선출(First In First Out, FIFO), 처음에 들어온 데이터가 먼저 삭제됨
- 주요 동작들
    - enQueue: 큐에 데이터를 넣는다.
    - deQueue: 큐에서 데이터를 빼낸다.
    - isEmpty: 큐가 비어있는지 확인한다.
    - isFull: 큐가 꽉 차 있는지 확인한다.
    - peek: 앞에 있는 원소를 삭제하지 않고 반환한다.

<br/>

## Queue의 종류
### Array Queue(선형큐)
- 1차원 배열을 이용한 큐(큐의 크기가 배열의 구조가 되는 구조)
- front = rear 인 경우 공백상태
- enQueue와 deQueue가 반복되면 앞부분에 비어있는 공간이 있음에도 front와 rear가 뒤로 가 포화상태 혹은 삽입불가 상태가 된다. 
- 고정된 크기를 가지게 되므로 메모리 낭비가 될 수 있다.

<br/>

### Circular Queue(원형큐)
- 메모리 공간을 아끼기 위해 이론적으로 원형적인 큐(배열의 처음과 끝이 연결되어 있다고 가정)를 만들어 사용
- 공백과 포화상태 구분을 위해 front가 있는 자리는 사용하지 않고 빈 자리로 둔다.(front가 있는 자리는 데이터가 비어있다고 생각)
- rear가 마지막 부분에 있으면 mod 연산을 이용하여 앞으로 보냄
- front = rear면 공백상태
- rear 의 다음칸이 front라면 full 상태
- 선형큐와 마찬가지로 비어있는 공간이 있게되므로 메모리 낭비 있음

<br/>

### Linked List Queue(연결 리스트 큐)
- front는 첫 번째 노드, rear는 마지막 노드를 가리킴(각각의 노드는 큐의 원소)
- 초기 혹은 공백상태는 front와 rear가 null
- front와 rear는 주소값을 가짐(포인터)
- 빈 공간이 생기지 않으므로 메모리 낭비 없음
- 구현 난이도 있음

<br/>

### Priority Queue(우선순위 큐)
- 우선순위를 이용하여 우선순위가 높은 순서대로 나가게 된다(FIFO).
- 일반적으로 힙(Heap)을 이용하여 구현

<br/>

## 참고
- [큐란? 한번에 쉽고 간단하게 이해하기](https://donggu1105.tistory.com/163)
- [큐란 무엇인가](https://mungto.tistory.com/169)

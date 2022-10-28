# __Queue__

### _1. 개념과 원리_
큐의 맨 앞에 있는 원소(맨 먼저 큐에 들어온 원소)를 front,  
맨 뒤에(제일 나중에 들어온 원소)를 tail이라고 한다.   
큐에서 삽입<span style="color:grey"><sup>enque</sup></span>할 때에는 삽입할 원소를 알려주어야 하지만,  
큐에서 삭제<span style="color:grey"><sup>deque</sup></span>할 때는 무조건 맨 앞에 있는 원소를 삭제하기 때문에 명시할 필요가 없다.<span style="color:grey"><sup>FIFO : fist-in-first-out</sup></span>

### _2. 추상 자료형(ADT)_
|work|description|
|:---:|:---|
|enqueue(x)|큐의 끝에 원소 x를 삽입한다.|
|dequeue()|큐의 맨 앞에 있는 원소를 알려주고 삭제한다.|
|front()|큐의 맨 앞에 있는 원소를 알려준다.|
|isEmpty()|큐가 비었는지 확인한다.|
|dequeAll()|큐를 깨끗이 청소한다.|

### _3. 시간 복잡도_
|Operation|big-o|
|:---:|:---|
|Search|O(n)|
|Insertion|O(1)|
|Deletion|O(1)|

### _4. 종류_
|Queue|Discription|
|:---:|:---|
|deque|일반적인 큐와 다르게 양쪽 방향에서 삽입, 삭제가 가능한 구조.|
|circular|큐의 맨 끝과 맨 처음을 연결하여 이미 꺼내어 사용한 앞부분의 데이터를 재사용 가능한 구조.|
|priority|데이터의 우선순위에 따라 높은 데이터부터 꺼내지도록 만든 구조.|
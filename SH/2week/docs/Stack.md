# __Stack__

### _1. 개념과 원리_
맨 위에 있는 자료를 들어내 사용하고 새 자료를 맨 위에 쌓는다.   
데이터를 이런 방식으로 쌓고 빼는 자료구조가 스택이다.   
뒤에 들어온 것이 가장 먼저 나가는 구조라는 듯으로 LIFO<span style="color:grey"><sup>Last-In-First-Out</sup></span>란 별칭이 붙었다.   
스택은 맨 위의 원소<span style="color:grey"><sup>스택 탑(stack top)</sup></span>만 접근 가능한 것이 특징이다.

### _2. 추상 자료형(ADT)_
|work|description|
|:---:|:---|
|push(x)|스택의 맨 위에 원소 x를 삽입한다.|
|pop()|스택의 맨 위에 있는 원소를 알려주고 삭제한다.|
|top()|스택의 맨 위에 있는 원소를 알려준다.|
|isEmpty()|스택이 비었는지 확인한다.|
|popAll()|스택을 깨끗이 청소한다.|

### _3. 시간 복잡도_
|Operation|Average|Worst|
|:---:|:---|:---|
|Access|Θ(n)|O(n)|
|Search|Θ(n)|O(n)|
|Insert(push)|Θ(1)|O(1)|
|Delete(pop)|Θ(1)|O(1)|

### _4. Array vs Linked_
* ArrayStack : 데이터로 할당하기 때문에 메모리 소모가 적다.   
단, 최대 개수가 정해져 있어 확장성이 떨어진다.
* LinkedStack :  Node로 연결되어 있기 때문에 확장에 제한이 없다 (LinkedList의 특징).   
단, 각 node마다 메모리를 할당해주어야 한다.
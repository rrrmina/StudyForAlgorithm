# What Is List
### Content
- Linear List
    - Contiguous List
    - Linked List
    - Linked List 종류
- ArrayList
- Vector
- LinkedList

<br/>

## Linear List
- 배열과 비슷하지만 크기가 정해져 있지 않아 원하는 만큼의 값을 담는 것이 가능
- List 자료형의 종류(Java의 List 인터페이스를 구현한 자료형)
    - ArrayList
    - Vector
    - LinkedList

<br/>

### Continguous List(연속 리스트)
- 배열과 같이 연속되는 기억장소에 저장되는 자료구조
- 중간에 데이터를 삽입하기 위해서는 연속된 빈 공간이 필요
- 삽입, 삭제 시 자료의 이동이 필요
- Java의 ArrayList가 해당

<br/>

### Linked List(연결 리스트)
- 자료들을 임의의 기억공간에 기억시키되, 자료의 순서에 따라 노드의 포인터 부분을 이용하여 서로 연결시킨 자료구조
- 연결을 위한 포인터 부분이 필요하기 때문에 기억 공간의 이용 효율이 좋지 않음
- 접근 속도가 느리고, 연결이 끊어지면 다음 노드를 찾기 어려움
- Java의 Linked List가 해당

<br/>

### Linked List 종류
1. Singly Linked List(단순 연결 리스트)   
- 단방향 링크
- 이전 노드에 접근하기 위해서는 첫 번째 노드부터 다시 순회해야 함
2. Circular Linked List(원형 연결 리스트)
- 단방향 링크
- 마지막 노드와 첫 번째 노드가 연결된 원형 구조
- 이전 노드에 접근하기 위해서 계속 한 방향으로만 순회하면 됨
3. Doubly Linked List(이중 연결 리스트)
- 양방향 링크
- 각 노드가 앞 뒤로 연결됨
- 이전 노드에 직접 접근 가능

<br/>

## ArrayList
- List 자료형 중 가장 간단한 형태의 자료형
- 각 데이터 추가/삭제 마다 배열을 새로 만들어 복사
    - 데이터 수정 시 O(n)의 시간복잡도
- 참조의 경우, 사용자가 원하는 인덱스의 데이터를 바로 꺼내올 수 있음
    - O(1)의 시간복잡도
    - __참조에 유리한 자료형__
- 자료의 삽입: add() / 원하는 위치에 삽입: add(위치, 값)
- 자료의 출력: get(위치)
- ArrayList의 개수: size()
- 리스트 안에 해당 항목이 있는지 판별해서 boolean으로 리턴: contains()
- 자료의 삭제: remove(객체), remove(인덱스)
- 이미 존재하는 배열을 Arrays.asList()로 ArrayList 생성 가능
- 리스트 정렬: 리스트.sort(Comparator.naturalOrder())
    - 오름차순 정렬: Comparator.naturalOrder()
    - 내림차순 정렬: Conparator.reverseOrder()

<br/>

## Vector
- ArrayList와 동일한 구조
- 크기 가변적
- 동기화된 메소드로 구성됨
    - 멀티 스레드가 동시에 이 메소드들을 실행할 수 없고, 하나의 스레드가 실행을 완료해야만 다른 스레드들이 실행할 수 있음
    - 여러 스레드가 공유하는 데이터를 다룰 때 사용하는 것이 좋음
    - 하나의 스레드에서만 사용하면 동기화가 필요 없으므로 ArrayList를 사용하는 것이 성능상 이득
- 자료의 삽입: add() / 특정 위치에 삽입: add(위치, 값)
- 자료 삭제: remove(위치) / 전체 삭제: clear()
- 자료 출력: get(위치)
- 특정 값 검색: contains() / 위치도 반환: indexOf()

<br/>

## Linked List
- ArrayList에 비해 데이터의 추가나 삭제가 용이, 탐색 속도가 떨어짐
- __데이터의 추가/삭제가 많은 경우 사용하면 좋음__
- 자료 추가: addFirst(), addLast(), add(), add(위치, 값)
- 자료 삭제: removeFirst(), removeLast(), remove(), remove(위치), clear()
- 리스트의 크기: size()
- 값 출력: get(위치)
- 값 검색: contains(값), indexOf(값)

<br/>

## 참고
- 시나공 정보처리기사 실기
- 점프 투 자바
- [[Java] Vector 사용법 및 예제](https://hbase.tistory.com/127)
- [[자료구조] 연결 리스트의 종류](https://skytitan.tistory.com/45)

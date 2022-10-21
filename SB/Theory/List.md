<aside>
👩🏻‍💻 a. ArrayList 
b. vector 
c. LinkedList (simple / doubly / double-ended / circular)

</aside>

# ArrayList

- Java Collection Framework의 일부
- 크기가 가변적으로 변하는 선형리스트이자 일반적인 배열과 같은 순차리스트
- 크기가 변하지 않는 배열과는 달리 객체들이 추가되어 저장 용량을 초과하면 자동적으로 부족한 크기만큼 용량이 늘어남

```java
ArrayList<Type> list = new ArrayList<Type>();
```

- 객체 타입으로 선언 가능
    - int는 primitive type이기 때문에 사용 X → Integer 로 사용 가능
    - integer : int를 객체화 시킨 wrapper class
- 선언된 타입의 객체만 저장 가능

```java
ArrayList<Integer> list = new ArrayList<Integer>();

//add data
list.add(5);
list.add(null); // add null ok
list.add(3, 10); // index 3 insert 10

//remove data
list.remove(1); // remove index 1
list.clear(); // remove all data

// search data 3
System.out.println(list.contains(3));

// search index 3
System.out.println(list.indexOf(3));
```

- data가 늘어날 수록 성능에 영향을 미치기 때문에 중간에 data를 insert할 경우가 많다면 `LinkedList`를 활용하는 게 좋음

# Vector

- ArrayList와 동일한 내부구조 가짐
- Vector 내부에 값이 추가 되면 자동으로 크기 조절되고, 다음 객체들은 한 자리씩 뒤로 이동
- Vector는 **동기화된 메소드**로 구성
    - 멀티 스레드가 동시에 메소드 실행 불가
    - 하나의 스레드가 실행을 완료해야만 다른 스레드들이 실행 가능

      → 안전하게 객체 추가 삭제 가능

- 스레드가 1개일 때도 동기화해서 ArrayList보다 성능 떨어짐

```java
Vector<Type> v = new Vector<Type>();

//add data
v.add(5);
v.add(null); // add null ok
v.add(3, 10); // index 3 insert 10

//remove data
v.remove(1); // remove index 1
v.removeAllElements(); // remove all data
v.clear(); // remove all data

// search index 3
System.out.println(v.get(3));
```

- 객체 타입으로 선언 가능

# LinkedList

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/670018f8-35a2-4920-afc4-bc90afb01d2b/Untitled.png)

- 각 노드가 데이터와 포인터를 가지고 한 줄로 연결되어 있는 방식의 자료구조
- 노드의 포인터가 이전 노드와 다음 노드와의 연결 담당
- 데이터 추가 삭제 용이
- 인덱스가 없어 특정 요소에 접근하기 위해서는 순차 탐색 필요 (탐색 속도⬇️)

<aside>
👩🏻‍💻 탐색 또는 정렬을 자주하는 경우 ArrayList 사용
데이터의 추가 / 삭제가 잦은 경우 LinkedList 사용

</aside>

```java
LinkedList<Type> list = new LinkedList<Type>();

// add data
list.add(4); // add data
list.addFirst(1); // add data first
list.addLast(2); // add data last

// remove data
list.removeFirst(); // remove data first 
list.removeLast(); // remove data last
list.remove(); // remove data 0
list.remove(2); // remove data index x
list.clear(); // remove data all

// search data 3
System.out.println(list.contains(3));

// search index 3
System.out.println(list.indexOf(3));
```

## Simple

- 단일 연결리스트
- 각 노드에 자료 공간과 한 개의 포인터 공간이 있고, 각 노드의 포인터는 다음 노드를 가리킴

## Doubly

- 이중 연결리스트
- 포인터 공간이 두 개가 있고, 각각의 포인터는 앞의 노드와 뒤의 노드를 가리킴

## Circular

- 일반 연결리스트의 마지막 노드와 첫번째 노드를 연결시켜 원형으로 만든 구조

## Doubly Circular LinkedList

- 이중 연결리스트의 마지막  노드와 첫번째 노드를 연결시켜 원형으로 만든 구조

# Sort (Slow)

- 참고

  ArrayList [https://coding-factory.tistory.com/551](https://coding-factory.tistory.com/551)

  Vector [https://coding-factory.tistory.com/553](https://coding-factory.tistory.com/553)

  LinkedList1 [https://coding-factory.tistory.com/552](https://coding-factory.tistory.com/552)

  LinkedList2 [https://hwan1001.tistory.com/5](https://hwan1001.tistory.com/5)

  
#Linked List

### Linked List 란?
: LinkedList 컬렉션 클래스는 데이터를 효율적으로 추가, 삭제, 변경 등의 동작을 하기 위해 사용
- LinkedList는 ArrayList와는 다르게 불연속적으로 존재, 데이터들은 서로 연결되어 있음
- LinkedList의 각 요소(node)들은 자신과 연결된 이전 요소 또는 다음 요소의 주소 값과 데이터로 구성
- LinkedList에서 데이터 삭제는 삭제하고자 하는 노드의 이전 노드가 삭제하고자 하는 노드의 다음 노드를 참조하도록 변경하는 것으로 삭제 ->  연결된 링크를 끊어 다른 노드에 다시 연결하는 방식
- LinkedList는 배열과 같이 데이터를 이동하기 위해 복사할 필요가 없어 처리 속도가 훨씬 빠름
- LinkedList에서의 데이터 추가는 새로운 노드를 추가하고자 하는 위치의 이전 노드와 다음 노드 사이에 연결하는 것으로 이루어짐

### LinkedList 사용 예제
``` java
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        // LinkedList 생성
        List<String> list = new LinkedList<String>();

        // 데이터 추가
        list.add("Hello");
        list.add("Java");
        list.add("List");

        // 저장된 객체 수 얻기
        int size = list.size();

        // 객체 저장 및 출력
        String hello = list.get(0);
        System.out.println(hello);

        // 저장된 총 객체 수 만큼 조회
        for(int i = 0; i < size; i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        // 객체 삭제
        list.remove(0);

        // for-each문으로도 사용 가능
        for (String str : list) {
            System.out.println(str);
        }
    }
}
``` 

### Doubly Linked List(이중 연결 리스트)
: 각 노드가 선행 노드와 후속 노드에 대한 링크를 가지는 연결 리스트
- 왼쪽 링크(left link)와 오른쪽 링크(right link)가 각각 다른 노드의 오른쪽 링크와 왼쪽 링크를 연결짓고 있으며 특별하게 헤드도 노드로 이루어져 있음
- 헤드 노드 : 데이터를 가지지 않고 오로지 삽입, 삭제 코드를 간단하게 할 목적으로 만들어진 노드

### Circular Linked List(원형 연결 리스트)
: 마지막 노드가 첫 번째 노드를 가리켜서, 연결의 형태가 원을 이루는 구조의 연결 리스트

### Double-Ended Linked List(이중 말단 연결 리스트)
: 헤더에 처음 노드와 마지막 노드에 대한 참조를 함께 저장하여 마지막 노드에 대한 접근도 빠르게 처리 가능한 연결 리스트

### 참고 자료
[[Java] 자바 LinkedList 클래스 개념 정리 및 활용](https://ittrue.tistory.com/m/145) </br>
[[자료구조] 이중 연결리스트 Doubly linked list](https://yjg-lab.tistory.com/122) </br>
[[자료구조] 원형 연결 리스트 (Circular Linked List)](https://velog.io/@mmindoong/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-%EC%9B%90%ED%98%95-%EC%97%B0%EA%B2%B0-%EB%A6%AC%EC%8A%A4%ED%8A%B8-Circular-Linked-List) </br>
[[자료구조*알고리즘] 4.Java 이중 말단 연결 리스트(double ended linked list) 정리](https://hijjang2.tistory.com/349)
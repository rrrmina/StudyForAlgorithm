# What Is Stack
### Content
- Stack
    - 특징
    - Array
    - List
- Java의 Stack 클래스

<br/>

## Stack
- '쌓다', '더미'
- 상자에 물건을 올리듯이 데이터를 쌓는 자료 구조
- 나중에 들어간 것이 먼저 나오는 (Last In First Out, LIFO) 형태
- 가장 최근에 입력된 데이터: top, 스택은 top에서만 삽입, 삭제, 읽기 동작이 발생
- 가장 먼저 입력되어 바닥에 깔린 데이터: bottom
- 자바에서 Stack은 java.urtil.Stack을 import하면 바로 사용 가능
    ![stack](/Img/stack.png)

<br/>

### 특징
- LIFO 구조
- 시스템 해킹에서 버퍼 오버플로우 취약점을 이용한 공격을 할 때 스택 메모리의 영역에서 함
- 인터럽트 처리, 수식의 계산, 서브루틴의 복귀 번지 저장 등에 쓰임
- 그래프의 깊이 우선 탐색(DFS)에 쓰임
- 재귀적(Recursion) 함수를 호출할 때 사용
- Array와 LinkedList로 구현 가능

<br/>

### Array로 Stack 구현
- 배열에 실제 데이터를 저장하기 때문에 데이터를 저장할 배열 하나 필요
- 스택의 최대 크기를 저장할 변수와 스택의 입출력 데이터를 가리키는 top을 관리하기 위한 변수 필요
```
public class ArrayStack {
    private int top;
    private int maxSize;
    private Object[] stackArray;

    // 배열 스택 생성,  스택의 최대 크기로 생성
    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        this.stackArray = new Object[maxSize];
        this.top = -1; // 스택에 데이터가 없다는 의미
    }
    
    // 스택이 비어있는지 체크
    public boolean empty(){
        return (top == -1);
    }
    
    // 스택이 꽉찼는지 체크
    public boolean full(){
        return (top == maxSize-1);
    }
    
    // 스택에 item 입력
    public void push(Object item){
        
        if(full()) throw new ArrayIndexOutOfBoundsException((top+1)+">=" + maxSize);
        
        stackArray[++top] = item;
    }
    
    // 스택의 가장 위의 데이터 반환
    public Object peek(){
        
        if(empty()) throw new ArrayIndexOutOfBoundsException(top);
        
        return stackArray[top];
    }
    
    // 스택의 가장 위의 데이터 제거
    public Object pop(){
        
        Object item = peek();
        
        top--;
        
        return item;
    }
}
```

<br/>

### LinkedList로 Stack 구현
- 배열의 단점(처음 생성한 크기를 바꿀 수 없다)을 해결하기 위해 연결 리스트를 이용하여 구현
- 실제 저장될 데이터와 다음 데이터의 참조를 가리키는 참조자를 추가한 Node 클래스 필요
    - 노드 클래스는 단순 연결 리스트와 같음
- top 노드를 가리키는 top 변수를 하나 선언(삽입, 삭제 노드)
```

public class ListStack {
    
    private Node top;
    
    // 노드 class 단순연결리스트와 같다.
    private class Node{
        
        private Object data;
        private Node nextNode;
        
        Node(Object data){
            this.data = data;
            this.nextNode = null;
        }
    }
    
    // 생성자, stack이 비어있으므로 top은 null이다.
    public ListStack(){
        this.top = null;
    }
    
    // 스택이 비어있는지 확인
    public boolean empty(){
        return (top == null);
    }
    
    // item 을 스택의 top에 넣는다.
    public void push(Object item){
        
        Node newNode = new Node(item);
        newNode.nextNode = top; // 삽입되기 이전의 top노드를 nextNode로 참조
        top = newNode;
        
    }
    
    // top 노드의 데이터를 반환한다.
    public Object peek(){
        if(empty()) throw new ArrayIndexOutOfBoundsException();
        return top.data;
    }
    
    // top 노드를 스택에서 제거한다.
    public Object pop(){
        
        Object item = peek();
        top = top.nextNode;
        return item;
    }
}
```

<br/>

## Java의 Stack 클래스
- Stack 선언
    ```
    import java.util.Stack;
    // int형 스택 선언
    Stack<Integer> stack = new Stack(); 
    ```
- Stack에 값 추가
    ```
    // stack에 값 1 추가
    stack.push(1);
    // stack에 값 2 추가
    stack.push(2);
    ```
- Stack에서 값 삭제
    ```
    // stack에서 맨 위에 있는 값 제거
    stack.pop();
    // stack의 전체 값 제거(초기화)
    stack.clear();
    ```
- Stack의 가장 상단의 값 출력
    ```
    // stack의 가장 상단의 값 출력
    stack.peek();
    ```
- Stack의 기타 메서드
    ```
    // stack의 크기 출력
    stack.size();
    // stack이 비어있는지 check(비어있다면 true)
    stack.empty();
    // stack에 1이 있는지 check(있으면 true)
    stack.contains(1);
    ```

<br/>

## 참고
- [자바 Stack 클래스 사용법 & 예제 총정리](https://coding-factory.tistory.com/m/601)
- [Java 스택(Stack) 정리(배열, 연결리스트)](https://xzio.tistory.com/m/298)

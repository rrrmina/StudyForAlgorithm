# What Is Tree
### Content
- Tree
- BFS
- DFS
- Binary Search Tree
- Segment Tree

<br/>

## Tree
- 노드들이 나무 가지처럼 연결된 비선형 계층적 자료구조
- 무방향 그래프 구조
- 노드가 n개인 트리는 항상 n-1개의 간선을 가짐
- 트리 내에 또 다른 트리가 있는 재귀적 자료구조
- 처리
    - 데이터와 연결 상태를 저장할 클래스 공간(=노드) 생성(data, left, right)
    - 각각의 노드들에 값 저장
    - 노드 간 연결 상태 정의

### 구성 요소
- 노드(Node) : 트리를 구성하고 있는 기본 요소, 값과 하위 노드에 대한 포인터를 가짐
- 간선(Edge) : 노드와 노드 간의 연결선
- 루트 노드(Root Node) : 부모가 없는 최상위 노드
- 부모 노드(Parent Node) : 자식 노드를 가진 노드
- 자식 노드(Child Node) : 부모 노드의 하위 노드
- 형제 노드(Sibling Node) : 같은 부모를 가지는 노드
- 외부 노드, 단말 노드, 리프 노드 : 자식 노드가 없는 노드
- 내부 노드, 비 단말 노드, 가지 노드 : 자식 노드 하나 이상 가진 노드
- 깊이(depth) : 루트에서 어떤 노드까지의 간선 수
- 높이(height) : 어떤 노드에서 리프 노드까지 가장 긴 경로의 간선() 수
- 레벨(Level) : 트리에서 각각의 층을 나타내는 단어(루트 노드: 0)

## BFS 너비 우선 탐색
가장 낮은 레벨에서 시작해서 왼쪽->오른쪽 방향으로 검색하고 검색이 끝나면 다음 레벨로 내려가는 방식의 검색 구조

## DFS 깊이 우선탐색
리프까지 내려가면서 검색하는 것을 우선순위로 하는 탐색 방법

### 전위 순회(pre-order)
- 루트 노드를 먼저 순회한 이후 '왼쪽 하위 -> 오른쪽 하위' 순으로 순회하는 방법

### 중위 순회(in-order)
- 왼쪽 가장 하위 노드를 먼저 순회한 이후 '바로 상위노드 -> 오른쪽 하위' 순으로 순회하는 방법

### 후위 순회(post-order)
- 왼쪽 가장 하위 노드를 먼저 순회한 이후 '오른쪽 하위노드 -> 바로 상위 노드' 순으로 순회하는 방법

## 이진탐색트리(Binary Search Tree)
- 모든 원소의 키는 유일한 키를 가진다.
- 왼쪽 서브 트리 키들은 루트 키보다 작다.
- 오른쪽 서브 트리 키들은 루트 키보다 크다.
- 왼쪽과 오른쪽 서브 트리도 이진 탐색 트리이다.

### 구현
```
public class BinarySearchTree {
    public class Node {
        private int data;
        private Node left;
        private Node right;
        /* 생성자 */
        public Node(int data){
            this.setData(data);
            setLeft(null);
            setRight(null);
        }
        /* 각종 getter / setter */
        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public Node getLeft() {
            return left;
        }
        public void setLeft(Node left) {
            this.left = left;
        }
        public Node getRight() {
            return right;
        }
        public void setRight(Node right) {
            this.right = right;
        }
    }
    public Node root;
    BinarySearchTree(){
        root = null;
    }
    /*탐색 연산*/
    public boolean find(int key){
        Node currentNode = root;
        while(currentNode != null){
            // 현재 노드와 찾는 값이 같으면
            if(currentNode.getData() == key){
                return true;
            }else if(currentNode.getData() > key){ // 찾는 값이 현재 노드보다 작으면
                currentNode = currentNode.getLeft();
            }else {// 찾는 값이 현재 노드보다 크면
                currentNode = currentNode.getRight();
            }
        }
        return false;
    }
    /*삽입 연산*/
    public void insert(int data) {
        Node newNode = new Node(data); // 왼쪽, 오른쪽 자식 노드가 null 이며 data 의 값이 저장된 새 노드 생성
        if(root == null){// 루트 노드가 없을때, 즉 트리가 비어있는 상태일 때,
            root = newNode;
            return;
        }
        Node currentNode = root;
        Node parentNode = null;
        while(true) {
            parentNode = currentNode;
            if(data < currentNode.getData()) { // 해당 노드보다 클 떄.
                currentNode = currentNode.getLeft();
                if(currentNode == null) {
                    parentNode.setLeft(newNode);
                    return ;
                }
            }else { // 해당 노드보다 작을 때.
                currentNode = currentNode.getRight();
                if(currentNode == null){
                    parentNode.setRight(newNode);
                    return ;
                }
            }
        }
    }

    /*삭제 연산*/
    public boolean delete(int data){
        Node parentNode = root;
        Node currentNode = root;
        boolean isLeftChild = false;

        while(currentNode.getData() != data) {
            parentNode = currentNode;
            if(currentNode.getData() > data) {
                isLeftChild = true;
                currentNode = currentNode.getLeft();
            }else {
                isLeftChild = false;
                currentNode = currentNode.getRight();
            }
            if(currentNode == null){
                return false;
            }
        }


        if(currentNode.getLeft() == null && currentNode.getRight() == null) { // 1. 자식 노드가 없는 경우
            if(currentNode == root) {
                root = null; // 해당 노드가 root node일 경우
            }
            if(isLeftChild) {
                parentNode.setLeft(null); // 삭제할 노드가 부모 노드의 왼쪽 자식일 경우
            }
            else {
                parentNode.setRight(null); // 삭제할 노드가 부모 노드의 오른쪽 자식일 경우
            }
        } else if(currentNode.getRight() == null){      // 2-1. 자식 노드가 하나인 경우(오른쪽 자식이 없을 때)
            parentNode.setLeft(currentNode.getLeft());
        } else if(currentNode.getLeft() == null) {      // 2-2. 자식 노드가 하나인 경우(왼쪽 자식이 없을 떄)
            parentNode.setRight(currentNode.getRight());
        } else {                                        // 3. 자식이 둘인 경우
                Node minimum = getMinumun(currentNode);
                if(currentNode == root) {
                    root = minimum;
                }else if (isLeftChild){
                    parentNode.setLeft(minimum);
                }else {
                    parentNode.setLeft(currentNode.getLeft());
                }
                minimum.setLeft(currentNode.getLeft());
        }
        return false;
    }

    Node getMinumun(Node deleteNode) {
        Node minimum = null;
        Node minimumParent = null;
        Node currentNode = deleteNode.getRight();
        while(currentNode != null) {
            minimumParent = minimum;
            minimum = minimumParent;
            currentNode = currentNode.getLeft();
        }
        if(minimum != deleteNode.getRight()){
            minimumParent.setLeft(minimum.getRight());
            minimum.setRight(deleteNode.getRight());
        }
        return minimum;
    }
}
```

## 세그먼트 트리(Segment Tree)
- 특정 구간 내 데이터에 대한 연산을 빠르게 구할 수 있는 트리
    - 특정 구간 합, 최소값, 최대값, 평균값 등
- 시간복잡도
    - 연산 : O(logN)
    - 데이터 변경 : O(logN)
- 이진 트리 구조



## 참고
(트리 자료 구조)[https://wonit.tistory.com/199]
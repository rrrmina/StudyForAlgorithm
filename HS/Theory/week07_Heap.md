# What Is Heap
### Content
- Heap
- Heap Sort

## Heap
- 완전 이진 트리의 일종
- __여러 개의 값들 중에서 최댓값이나 최솟값을 빠르게 찾아내도록 만들어진 자료구조__
- 힙은 일종의 반정렬 상태(느슨한 정렬 상태)를 유지한다.
    - 큰 값이 상위 레벨에 있고 작은 값이 하위 레벨에 있다는 정도
- 힙 트리에서는 중복된 값을 허용한다.

### Heap의 종류
- 최대 힙(max heap)
    - 부모 노드의 키 값이 자식 노드의 키 값보다 크거나 같은 완전 이진 트리
- 최소 힙(min heap)
    - 부모 노드의 키 값이 자식 노드의 키 값보다 작거나 같은 완전 이진 트리

### Heap의 구현
- 힙을 저장하는 표준적인 자료구조는 배열이다.
- 구현을 쉽게 하기 위햐여 배열의 첫 번째 인덱스인 0은 사용되지 않는다.
- 특정 위치의 노드 번호는 새로운 노드가 추가되어도 변하지 않는다.
- 힙에서의 부모 노드와 자식 노드의 관계
    - 왼쪽 자식의 인덱스 = 부모의 인덱스 * 2
    - 오른쪽 자식의 인덱스 = 부모의 인덱스 * 2 + 1
    - 부모의 인덱스 = 자식의 인덱스 / 2

### Heap의 삽입
- 힙에 새로운 요소가 들어오면, 일단 새로운 노드를 힙의 마지막 노드에 이어서 삽입한다.
- 새로운 노드를 부모 노드들과 교환해서 힙의 성질을 만족시킨다.
```
void insert_max_heap(int x){
    maxHeap[++heapSize] = x; // 힙 크기를 하나 증가하고 마지막 노드에 x를 넣는다.

    for (int i=heapSize; i>1; i/=2) {
        if (maxHeap[i/2] < maxHeap[i]) {
            swap(i/2, i);
        } else {
            break;
        }
    }
}
```

### Heap의 삭제
- 최대 힙에서 최댓값은 루트 노드이므로 루트 노드가 삭제된다.
- 삭제된 루트 노드에는 힙의 마지막 노드를 가져온다.
- 힙을 재구성한다.
```
int delete_max_heap(){
    if (heapSize == 0) // 배열이 빈 경우
    return 0;

    int item = maxHeap[1]; // 루트 노드의 값을 저장한다.
    maxHeap[1] = maxHeap[heapSize]; // 마지막 노드의 값을 루트 노드에 둔다.
    maxHeap[heapSize--] = 0; // 힙 크기를 하나 줄이고 마지막 노드를 0으로 초기화한다.

    for (int i=1; i*2<=heapSize;) {
    // 마지막 노드가 왼쪽 노드와 오른쪽 노드보다 크면 반복문을 나간다.
        if (maxHeap[i] > maxHeap[i*2] && maxHeap[i] > maxHeap[i*2+1]) {
            break;
        }
        // 왼쪽 노드가 더 큰 경우, 왼쪽 노드와 마지막 노드를 swap
        else if (maxHeap[i*2] > maxHeap[i*2+1]) {
            swap(i, i*2);
            i = i*2;
        }
        // 오른쪽 노드가 더 큰 경우, 오른쪽 노드와 마지막 노드를 swap
        else {
            swap(i, i*2+1);
            i = i*2+1;
        }
    }
    return item;
}
```

## Heap Sort
- 시간 복잡도
    - O(nlogn)
    - 힙 트리의 전체 높이가 거의 logn(완전 이진 트리)이므로 하나의 요소를 힙에 삽입하거나 삭제할 때 힙을 재정비하는 시간이 logn만큼 소요된다.
    - 요소의 개수가 n개 이므로 전체적으로 O(nlogn)의 시간이 걸린다.
- 전체 자료를 정렬하는 것이 아니라 가장 큰 값 몇 개만 필요할 때 가장 유용하다.


## 참고
- [[자료구조] 힙(heap)이란](https://gmlwjd9405.github.io/2018/05/10/data-structure-heap.html)
- [[알고리즘] 힙 정렬(heap sort)이란](https://gmlwjd9405.github.io/2018/05/10/algorithm-heap-sort.html)
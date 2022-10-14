선택정렬, 삽입정렬, 버블정렬

## Bubble Sort

- 붙어있는 두 개의 원소끼리 비교하여 큰 수를 찾아 뒤로 옮기는 작업 반복

```java
bubbleSort (A[], n) {

for last <- n downto 2

for i <- 1 to last - 1

if (A[i] > A[i + 1]) 

then A[i] <-> A[i + 1];

}
```

- 시간 복잡도
    - T(n) = (n - 1) + (n - 2) + ... + 2 + 1 = O($n^2$)

## Selection Sort

- 최대 원소를 찾아서 맨 오른쪽 원소와 교환하고 맨 오른쪽 원소를 제외하고 이를 하나의 원소만 남을 때까지 반복함

```java
selectionSort (A[], n) {

for last <- n downto 2 {//for루프는 n - 1번 반복한다.

A[1 ~ last] 중 가장 큰 수  a[k]를 찾음; //가장 큰 수를 찾기 위한 비교횟수 : n-1, n-2, ..., 2. 1번 순서로 줄어든다.

A[k]와 A[last]의 값을 서로 교환; //작업시간이 상수 시간으로 소요된다.}

}
```

- 시간 복잡도
    - T(n) = (n - 1) + (n - 2) + ... + 2 + 1 = $\frac {n (n - 1)}{2} $ = O($n^2$)

## Insertion Sort

- 두 번째 원소부터 시작해서 그 전까지 원소를 비교하여 정렬
- 최악의 경우 시간 복잡도가 Selection sort와 Bubble sort와 비슷하지만 평균적인 경우 대략 절반의 시간만 필요로 하여 앞의 정렬들보다 효율적임

```java
insertionSort (A[], n) {

for i <- 2 to n

A[1 ~ i]의 맞는 자리에 A[i]를 삽입;

}
```

- 시간 복잡도
    - for 루프는 n - 1번 반복
    - A[i] 삽입의 최악의 경우 i - 1번 반복
    - 최악의 경우 T(n) = (n - 1) + (n - 2) + ... + 2 + 1 = O($n^2$)
- 참고
  Slow Sort [https://codingtrainee.tistory.com/43](https://codingtrainee.tistory.com/43)
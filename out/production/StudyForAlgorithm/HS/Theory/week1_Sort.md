# What Is Sort
### Content
- Selection Sort
- Insertion Sort
- Bubble Sort

<br/>

## Selection Sort(선택 정렬)
- 현재 위치에 들어갈 값을 찾아 정렬
- 현재 위치에 저장될 값의 크기가 작냐, 크냐에 따라 최소선택정렬(오름차순)과 최대선택정렬(내림차순)로 구분
- 기본 로직
    - 정렬되지 않은 인덱스의 맨 앞에서부터 배열값 중 가장 작은 값을 찾음 (정렬이 되면, 그 뒤부터 작은 값을 찾음)
    - 가장 작은 값을 찾으면, 현재 인덱스의 값과 바꿈
    - 반복
- 배열이 어떻든 전체 비교를 진행하므로 시간 복잡도는 O(n^2)

<br/>

## Insertion Sort(삽입 정렬)
- 현재 위치에서 그 이하의 배열들을 비교하여 자신이 들어갈 위치를 찾아 그 위치에 삽입하는 배열 알고리즘
- 기본 로직
    - 두 번째 인덱스부터 시작
    - 현재 인덱스는 별도의 변수에 저장하고 비교 인덱스를 현재 인덱스 -1로 잡음
    - 별도로 저장해 둔 삽입을 위한 변수와 비교 인덱스의 배열 값을 비교
    - 삽입 변수의 값이 더 작으면, 현재 인덱스로 비교 인덱스의 값을 저장하고 비교 인덱스를 -1하여 비교 반복
    - 삽입 변수가 더 크면, 비교 인덱스+1에 삽입 변수 저장
- 최악의 경우(역으로 정렬되어 있을 경우): O(n^2)
- best의 경우(정렬이 되어있는 경우): O(n)

<br/>

## Bubble Sort(버블 정렬)
- 매번 연속된 두개 인덱스를 비교하여 미리 정한 기준의 값을 뒤로 넘겨 정렬하는 방법
- 기본 로직
    - 두 번째 인덱스부터 시작
    - 현재 인덱스 값과 바로 이전의 인덱스 값을 비교
    - 이전 인덱스가 더 크면 현재 인덱스와 바꿈
    - 현재 인덱스가 더 크면 넘어감
    - 전체 배열의 크기만큼 순환 반복
- 배열이 어떻든 전체 비교를 하므로 O(n^2)의 시간복잡도를 가짐

<br/>

## 참고
[기본 정렬 알고리즘](https://hsp1116.tistory.com/33)

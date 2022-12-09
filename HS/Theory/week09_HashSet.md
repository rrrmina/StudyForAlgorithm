# What Is HashSet
### Content
- HashSet
- 사용법

<br/>

## HashSet
- Set 인터페이스에서 지원하는 구현 클래스
- 순서 보장 x
- null 허용
- __중복 허용__

<br/>

## HashSet 사용법
### 변수 생성
```
HashSet<Integer> set = new HashSet<>();
```

<br/>

### 값 추가
```
set.add(1);
```

<br/>

### 값 삭제
```
set.remove(value); // value 값만 삭제
set.clear(); // 전부 삭제
```

<br/>

### 크기 구하기
```
set.size;
```

<br/>

### 데이터 출력하기
하나의 객체를 가져오고 싶을 경우 Iterator 사용
```
Iterator iter = set.iterator();
while(iter.hasNext()) {
    System.out.print(iter.next()+" ");
}
```

<br/>

### 데이터 검색하기
값이 존재하면 true, 없으면 false
```
set.contains(value);
```

<br/>

## 참고
[[JAVA] HashSet이란? & 사용법 정리]](https://crazykim2.tistory.com/474)
# What Is HashMap
### Content
- HashMap

<br/>

## HashMap
- Map 인터페이스에 속해 있는 컬렉션
- Map 인터페이스의 기본 기능들을 전부 구현할 수 있음
- 데이터들은 모두 (키, 값)의 1:1 구조로 되어있는 Entry로 되어있다.
- 같은 키의 값을 삽입하려고 하면 해당 키의 값이 변경됨
- 키는 고유, 값은 고유하지 않음
- 키는 중복 안됨, 값은 중복 가능
- null값도 저장 가능

<br/>

## 사용 방법
- 선언하기
```
// Integer, Integer 타입 설정
HashMap<Integer, Integer> hm = new HashMap<>();
```
- 값 추가
```
hm.put(key, value);
```
- 값 삭제
```
// 해당하는 key를 삭제
hm.remove(key);
// 모든 키 값을 삭제
hm.clear();
```
- 크기 구하기
```
// 키의 개수 구하기
hm.size();
```
- 값 출력하기
    - getKey(), getValue() 메서드로 HashMap의 키 값과 value 값을 가져올 수 있다.
```
for(Map.Entry<String, String> e : hm.entrySet())
			System.out.println("Key : " + e.getKey() + ", Value : " + e.getValue());
```



<br/>

## 참고
[HashMap의 개념 및 사용법 정리](https://crazykim2.tistory.com/587)
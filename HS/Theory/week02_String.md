# What Is String
### Content
- String
- Methods
- Formatting

<br/>

## String
- 문자열: 문장을 뜻함
- 자바에서 문자열을 나타내는 자료형
- new 키워드는 객체를 만들 때 사용
    - but, 문자열을 표현할 때 리터럴 방식(String a = "a")을 사용하는 것을 권장
    - 가독성이 좋고 컴파일 시 최적화에 도움을 주기 때문

<br/>

## Methods
### eqauls
- 두 개의 문자열이 동일한지 비교하여 결과값 리턴
- == 연산자는 두 개의 자료형이 동일한 객체인지 판별할 때 사용하는 연산자
- 다른 객체이지만 값이 같은 경우 true 리턴

<br/>

### indexOf
- 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴

<br/>

### contains
- 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴

<br/>

### charAt
- 문자열에서 특정 위치의 문자(char)을 리턴

<br/>

### replaceAll
- 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용

<br/>

### subString
- 문자열 중 특정 부분을 뽑아낼 경우에 사용
- subString(시작위치, 끝위치) <- 끝 위치는 포함 안됨

<br/>

### toUppercase
- 문자열을 모두 대문자로 변경할 때 사용
- 모두 소문자로 변경할 때는 toLowerCase 사용

<br/>

### split
- 문자열을 특정 구분자로 분리하는 메소드
- 문자열 배열로 리턴

<br/>

## Formatting
- 문자열 안의 특정한 값을 바꿔야 할 경우가 있을 때 사용
- 문자열 안에 어떤 값을 삽입하는 방법

### 방법
1. 숫자 바로 대입
- String.format 메서드 사용
- ex. String.format("I eat %d apples.", 3); // I eat 3 apples 출력
    - %d : 문자열 포맷 코드

2. 문자열 바로 대입
- %s 사용

3. 숫자 값을 나타내는 변수로 대입
- int number = 3;
- String.format("I eat %d apples.", number); 

4. 2개 이상의 값 넣기
- 파라미터로 여러 개를 전달

### 문자열 포맷 코드
- %s : 문자열(String)
- %c : 문자 1개(character)
- %d : 정수(Integer)
- %f : 부동소수(floating-point)
- %o : 8진수
- %x : 16진수
- %%  : Literal % (문자 % 자체) // 어떤 형태의 값이든 변환해 넣을 수 있다

<br/>

System.out.printf는 포매팅된 문자열을 출력한다.


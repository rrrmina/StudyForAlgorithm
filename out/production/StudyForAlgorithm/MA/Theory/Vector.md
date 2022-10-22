# Vector

### Vector란?
- ArrayList와 동일한 내부구조, Collection 프레임워크의 일부, java.util 패키지에 소속
- ArrayList와 마찬가지로 Vecto r내부에 값이 추가되면 자동으로 크기가 조절되며 그다음 객체들은 한 자리씩 뒤로 이동
- Arraylist와 달리 Vector는 동기화된 메소드로 구성되어 있어 멀티 스레드가 동시에 메소드들을 실행할 수 없고, 
하나의 스레드가 실행을 완료해야만 다른 스레드들이 실행할 수 있음 </br>
-> 멀티 스레드 환경에서 안전하게 객체를 추가하고 삭제 가능
-> 항상 동기화(장점이자 단점) 스레드가 1개일때도 동기화를 하기 때문에 ArrayList보다 성능이 떨어짐 

### 참고자료
[[Java] 자바 Vector 사용법 & 예제 총정리](https://coding-factory.tistory.com/553)
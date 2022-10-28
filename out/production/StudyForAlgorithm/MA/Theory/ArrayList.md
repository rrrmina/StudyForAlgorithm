# ArrayList

### ArrayList 란?
: List 인터페이스를 구현한 클래스로 컬렉션 프레임워크에서 가장 많이 사용
- 기능적으로는 Vector와 동일하지만, 기존의 Vector를 개선한 것으로 주로 ArrayList를 사용

- ArrayList에 객체를 추가하면 객체가 인덱스로 관리된다는 점에서 배열과 유사 </br>
 -> 그러나 배열은 생성될 때 크기가 고정되며, 크기를 변경할 수 없음 </br>
 -> 하지만 ArrayList는 저장 용량을 초과하여 객체들이 추가되면, 자동으로 저장용량이 늘어남
- List 자료구조의 특성을 이어받아 데이터가 연속적으로 존재하여 순서를 유지

### ArrayList 생성
``` java
List<타입 매개변수> 객체이름 = new ArrayList<타입 매개변수>(초기 저장 용량);
``` 

### ArrayList 사용 예제
``` java
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
public static void main(String[] args) {
List<String> list = new ArrayList<String>();

        // 데이터 추가
        list.add("Hello");
        list.add("Java");
        list.add("List");

        // 저장된 객체 수
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
[공식문서](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
)

#### 참고 자료
[[Java] 자바 ArrayList 클래스 개념 정리 및 활용](https://ittrue.tistory.com/m/144)
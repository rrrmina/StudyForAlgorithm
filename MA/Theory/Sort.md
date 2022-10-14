# Sort

### 정렬(Sort)란?
: 2개 이상의 자료를 특정 기준에 의해 작은 값부터 큰 값 혹은 그 반대 순서로 재배열하는 것. (오름차순 정렬 / 내림차순 정렬)

### 버블정렬(bubble sort) 
: 인접한 두 개의 원소를 비교해서 자리를 교환하는 방식. 한 단계가 끝나면, 최대/최소 원소가 마지막 자리 위치
- 아주 단순한 대신 정렬이 되어 있어도 계속 인접한 두 개의 원소를 비교하므로 최선, 평균, 최악의 경우 모두 시간복잡도는 O(n^2) 
- 교환(swap) 연산이 많이 발생
- 중복된 값이 있을 때, 정렬 과정을 거쳐도 그 순서가 유지되는 안정정렬(stable sort)
``` java
public class Bubble_Sort {
    public static void bubble_sort(int[] a) {
    bubble_sort(a, a.length);
    }
    private static void bubble_sort(int[] a, int size) {
        for(int i = 1; i < size; i++) {
            for(int j = 0; j < size - i; j++) {
                if(a[j] > a [j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
```
swap 여부를 판단
``` java
public class Bubble_Sort {
	public static void bubble_sort(int[] a) {
		bubble_sort(a, a.length);
	}
	
	private static void bubble_sort(int[] a, int size) {
			for(int i = 1; i < size; i++) {
			boolean swapped = false;	
			for(int j = 0; j < size - i; j++) {
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
					swapped = true;
				}
			} 
			//swap 여부를 판단 ->  O(N)
			if(swapped == false) {
				break;
			}
		}
	}
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
```
### 선택정렬(selection sort)
1. 주어진 배열에서 최솟값을 찾음
2. 그 최솟값을 맨 앞에 위치한 것과 바꿈(swap)
3. 맨 앞의 것을 제외하고, 나머지 것들을 대상으로 다시 위 1 ~ 2 과정을 반복
- 선택정렬은 버블소트보다는 swap 횟수가 적지만 시간복잡도는 O(n^2) 
- 정렬 과정에서 같은 숫자의 순서가 바뀔 수 있는 불안정정렬(unstable sort)
- 데이터를 비교하면서 찾기 때문에 비교 정렬이며 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요로 하지 않기 때문에 제자리 정렬(in-place sort). 정확히는 데이터를 서로 교환하는 과정(swap)에서 임시 변수를 필요로 하나, 이는 충분히 무시할 만큼 적은 양이기 때문에 제자리 정렬로 보는 것.
``` java
public class Selection_Sort {
	public static void selection_sort(int[] a) {
		selection_sort(a, a.length);
	}
	
	private static void selection_sort(int[] a, int size) {
		for(int i = 0; i < size - 1; i++) {
			int min_index = i;	
            for(int j = i + 1; j < size; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}
        swap(a, min_index, i);
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
```
### 삽입정렬(insertion sort) 
: 선택한 요소의 `앞부분`을 보면서 들어갈 자리를 찾아가는 정렬방법
- 2번째 인덱스부터 시작해서 그 앞과 자신을 비교하고, 내가 더 크면 더 이상 비교하지 않고 다음 인덱스로 
- 만약 내가 더 작다면 그 앞에 있던 원소를 한 칸 뒤로 밀고, 자신은 그보다 한칸 더 앞에 있던 원소와 비교를 진행
- 앞보다 내가 더 커서 더 이상 비교를 진행하지 않아도 되면, 비어 있는 칸에 자신을 위치
- 삽입정렬은 모두 정렬되어 있는 최선의 경우에는, 단 한 번씩만 비교를 하기 때문에 시간복잡도가 O(n) -> 즉 어느 정도 정렬이 된 배열일수록 삽입정렬의 효율이 높아짐
- 삽입 정렬은 데이터를 비교하면서 찾기 때문에 비교 정'이며 정렬의 대상이 되는 데이터 외에 추가적인 공간을 필요로 하지 않기 때문에 제자리 정렬(in-place sort). 정확히는 데이터를 서로 교환하는 과정(swap)에서 임시 변수를 필요로 하나, 이는 충분히 무시할 만큼 적은 양이기 때문에 제자리 정렬로 보는 것. 이는 선택정렬과도 같은 부분
- 중복된 값이 있을 때, 정렬 과정을 거쳐도 그 순서가 유지되는 안정정렬(stable sort)
``` java
  public class Insertion_Sort {
  public static void insertion_sort(int[] a) {
  insertion_sort(a, a.length);
  }

       private static void insertion_sort(int[] a, int size) {
           for(int i = 1; i < size; i++) {
               int target = a[i];
               int j = i - 1;

               while(j >= 0 && target < a[j]) {
                   a[j + 1] = a[j];
                   j--;
               }
               a[j + 1] = target;
           }
       }
  }
``` 
#### 참고 자료
[알고리즘 - 소팅(Sorting)과 종류 : 버블정렬, 선택정렬, 삽입정렬](https://chanhuiseok.github.io/posts/algo-5/)
[자바 [JAVA] - 거품 정렬 (Bubble Sort)](https://st-lab.tistory.com/195)
[자바 [JAVA] - 선택 정렬 (Selection Sort)](https://st-lab.tistory.com/168?category=892973)
[자바 [JAVA] - 삽입 정렬 (Insertion Sort)](https://st-lab.tistory.com/179?category=892973)
# __HashTable__

## _-Dict_
key:value의 구조로 이루어져있는 자료형을 의미한다. 파이썬의 경우 Dict자료형이 있다.  
* 순차적으로 데이터를 저장하지 않음.
* Key를 통해 Value를 가져옴.
* Key는 중복불가, Value는 가능.
* 수정가능함.

## _-시간 복잡도_
|Operation|example|Big-O|
|:---|:---|:---|
Index|d[k]|O(1)
Store|d[k]=v|O(1)
Length|len(d)|O(1)
Delete|del d[k]|O(1)
get/setdefault|d.method|O(1)
Pop|d.pop(k)|O(1)
Pop item|d.popitem()|O(1)
Clear|d.clear()|O(1)
View|d.kers()|O(1)
Construction|dict(...)|O(len(...))
Iteration|for k in d:|O(N)
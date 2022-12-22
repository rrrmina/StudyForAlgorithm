# What Is Backtracking
### Content
- Backtracking
- DFS vs. Backtracking

<br/>

## Backtracking
해를 찾는 도중 해가 아니어서 막히면, 되돌아가서 다시 해를 찾아가는 기법    
최적화 문제와 결정 문제를 푸는 방법    
__모든 가능한 경우의 수 중에서 특정한 조건을 만족하는 경우만 살펴보는 것__    
해가 될 만한지 판단한 후 유망하지 않다고 결정되면 그 노드의 이전(부모)으로 돌어가 다음 자식 노드로 돌아간다.

<br/>

## DFS vs.Backtracking
### DFS
가능한 모든 경로(후보)를 탐색한다.    
불필요할 것 같은 경로를 사전에 차단하거나 하는 등의 행동이 없으므로 경우의 수를 줄이지 못한다.    
따라서 N! 가지의 경우의 수를 가진 문제는 DFS로 처리가 불가능할 것이다.

<br/>

### Backtracking
해를 찾아가는 도중, 지금의 경로가 해가 될 것 같지 않으면 그 경로를 더이상 가지 않고 되돌아간다.    
코딩에서는 반복문의 횟수까지 줄일 수 있으므로 효율적이다.    
가지치기를 얼마나 잘하느냐에 따라 효율성이 결정된다.    

<br/>

## 참고
[알고리즘 - 백트래킹(Backtracking)의 정의 및 예시문제](https://chanhuiseok.github.io/posts/algo-23/#:~:text=%EB%B0%B1%ED%8A%B8%EB%9E%98%ED%82%B9(backtracking)%EC%9D%B4%EB%9E%80%3F,%EB%A5%BC%20%ED%91%B8%EB%8A%94%20%EB%B0%A9%EB%B2%95%EC%9D%B4%20%EB%90%A9%EB%8B%88%EB%8B%A4.)
Sort
=============   
#selection sort   
for last <- n-1 downto 1   
    A[0...last]중 가장 큰 수 A[k]를 찾는다.   
    A[k] <-> A[last] <==A[k]와 A[last]의 값을 교환한다.   
   
#bubble sort   
for last <- n-1 downto 1   
    for i <- 0 to last-1   
        if(A[i] > A[i+1])   
            A[i]<->A[i+1] <==원소를 교환한다   
        
#insertion sort   
for i <- 1 to n-1   
    A[0...i]의 적합한 자리에 A[i]를 삽입한다.   

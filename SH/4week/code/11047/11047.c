#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main() {
    int n;
    int k;
    scanf("%d %d", &n, &k);
    int coin_list[10];
    for (int i = 0;i < n;i++) {
        scanf("%d", &coin_list[i]);
    }
    int max_index = n - 1;
    int count = 0;
    while (k != 0) { // K가 0이 아닌동안
        if (coin_list[max_index] > k) // 동전 가치가 k보다 크면 인덱스를 하나 낮춤.
            max_index--;
        else {
            k -= coin_list[max_index]; // k에서 해당 리스트에 있는 동전의 가치만큼 뺌.
            count++; //카운트 증가.
        }
    }
    printf("%d", count);
    return 0;
}

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
    while (k != 0) {
        if (coin_list[max_index] > k)
            max_index--;
        else {
            k -= coin_list[max_index];
            count++;
        }
    }
    printf("%d", count);
    return 0;
}

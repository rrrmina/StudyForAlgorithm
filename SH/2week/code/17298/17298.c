#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main(){
    int N;
    scanf("%d", &N);

    int *NumStack = (int *)malloc(sizeof(int) * N);
    for (int i = 0;i < N;i++) {
        scanf("%d", &NumStack[i]);
        getchar();
    }
    int flag;
    for (int i = 0;i < N;i++) {
        flag = 0;
        for (int j = i + 1;j < N;j++) {
            if (NumStack[j] > NumStack[i]) {
                printf("%d ", NumStack[j]);
                flag = 1;
                break;
            }
        }
        if (!flag)
            printf("-1 ");
    }
    free(NumStack);
    return 0;
}
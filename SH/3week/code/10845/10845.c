#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
//DefineInteger
#define push_index 0
#define pop_index 1
#define size_index 2
#define empty_index 3
#define front_index 4
#define back_index 5
#define SAME 0
#define QueueArraySize QueueIndex + 1
#define QueueArrayFrontNum QueueArray[0]
#define QueueArrayTailNum QueueArray[QueueIndex]
//DefineFunc
#define isQueueArrayEmpty QueueIndex == -1
#define PrintEmptyStatus printf("-1\n")


int CommandCountNum = 0;
const static char* CommandArray[6] = {"push", "pop", "size", "empty", "front", "back"};
int QueueArray[10000] = { 0, };
int QueueIndex = -1;

void push() {
    int ToPushNum = 0;
    QueueIndex++;
    scanf("%d", &ToPushNum);
    QueueArray[QueueIndex] = ToPushNum;
}

void pop() {
    if (isQueueArrayEmpty) 
        PrintEmptyStatus;
    else {
        printf("%d\n", QueueArray[0]);
        for (int i = 0;i < QueueIndex;i++) {
            QueueArray[i] = QueueArray[i + 1];
        }
        QueueArray[QueueIndex] = 0;
        QueueIndex--;
    }
}

void size() {
    printf("%d\n", QueueArraySize);
}

void empty() {
    if (isQueueArrayEmpty)
        printf("1\n");
    else
        printf("0\n");
}

void front() {
    if (isQueueArrayEmpty)
        PrintEmptyStatus;
    else
        printf("%d\n", QueueArrayFrontNum);
}

void back() {
    if (isQueueArrayEmpty)
        PrintEmptyStatus;
    else
        printf("%d\n", QueueArrayTailNum);
}

void DistinguishCommand(char *cmd_parm) {
    if (strcmp(cmd_parm, CommandArray[push_index]) == SAME)
        push();
    else if (strcmp(cmd_parm, CommandArray[pop_index]) == SAME)
        pop();
    else if (strcmp(cmd_parm, CommandArray[size_index]) == SAME)
        size();
    else if (strcmp(cmd_parm, CommandArray[empty_index]) == SAME)
        empty();
    else if (strcmp(cmd_parm, CommandArray[front_index]) == SAME)
        front();
    else
        back();
}

void CommandInput() {
    for (int i = 0;i < CommandCountNum;i++) {
        char Command[10] = { 0, };
        scanf("%s", Command);
        DistinguishCommand(Command);
        getchar();
    }
}

void CommandCountNumInput() {
    scanf("%d", &CommandCountNum);
}

int main() {
    CommandCountNumInput();
    CommandInput();

    return 0;
}
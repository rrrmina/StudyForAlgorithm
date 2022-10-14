#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define push_index 0
#define pop_index 1
#define size_index 2
#define empty_index 3
#define top_index 4
#define isEmptyStackTruePrint printf("1\n")
#define isEmptyStackFalsePrint printf("0\n")
#define PopNoInteger printf("-1\n")
#define TopNoInteger printf("-1\n")
#define isEmptyStackTrue stack_index == -1
#define ResultPrint PrintResultArray[PrintResultIndex] = stack_array[stack_index]
#define PlusPrintResultIndex PrintResultIndex += 1

int CommandNum = 0;
const static char* CommandArray[5] = {"push", "pop", "size", "empty", "top"};
int stack_array[10000] = { 0, };
int stack_index = -1;
int PrintResultArray[10000] = { 0, };
int PrintResultIndex = 0;


void top(){
    if (isEmptyStackTrue) {
        // TopNoInteger;
        PrintResultArray[PrintResultIndex] = -1;
        PlusPrintResultIndex;
    }
    else {
        // printf("%d\n", stack_array[stack_index]);
        ResultPrint;
        PlusPrintResultIndex;
    }
}

void empty(){
    if (isEmptyStackTrue) {
        // isEmptyStackTruePrint;
        PrintResultArray[PrintResultIndex] = 1;
        PlusPrintResultIndex;
    }
    else {
        // isEmptyStackFalsePrint;
        PrintResultArray[PrintResultIndex] = 0;
        PlusPrintResultIndex;
    }
}

void size(){
    // printf("%d\n", stack_index + 1);
    PrintResultArray[PrintResultIndex] = stack_index + 1;
    PlusPrintResultIndex;
}

void pop(){
    if (isEmptyStackTrue) {
        // PopNoInteger;
        PrintResultArray[PrintResultIndex] = -1;
        PlusPrintResultIndex;
    }
    else {
        // printf("%d\n", stack_array[stack_index]);
        ResultPrint;
        PlusPrintResultIndex;
        stack_array[stack_index] = 0;
        stack_index -= 1;
    }
}

void push() {
    int PushNum = 0;
    scanf("%d", &PushNum);
    stack_index += 1;
    stack_array[stack_index] = PushNum;
    // ResultPrint;
    // PlusPrintResultIndex;
}


void DistinguishCommnad(char *cmd) {
    if (strcmp(cmd, CommandArray[push_index]) == 0) {
        push();
    }
    else if (strcmp(cmd, CommandArray[pop_index]) == 0) {
        pop();
    }
    else if (strcmp(cmd, CommandArray[size_index]) == 0) {
        size();
    }
    else if (strcmp(cmd, CommandArray[empty_index]) == 0) {
        empty();
    }
    else {
        top();
    }
}

void CommandInputByNum() {
    for (int i = 0;i<CommandNum;i++) {
        char Command[10] = { 0, };
        scanf("%s", Command);
        DistinguishCommnad(Command);
        getchar();
    }
}

void CommandNumInput() {
    scanf("%d", &CommandNum);
}

void PrintAllResultNum() {
    int i = 0;
    while (i < PrintResultIndex) {
        printf("%d\n", PrintResultArray[i]);
        i++;
    }
}

int main() { 
    CommandNumInput();
    CommandInputByNum();
    PrintAllResultNum();
    return 0;
}
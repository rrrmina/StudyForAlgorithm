def main():
    N = int(input())
    string_list = list()

    for _ in range(N):
        string_list.append(input())
    string_list = list(set(string_list)) # 중복제거
    string_list.sort(key=len) #길이순으로 정렬

    start_index = 0
    finish_index = 0
    for i in range(len(string_list) - 1):
        if len(string_list[i]) != len(string_list[i + 1]): #글자 길이수가 달라질 때:
            finish_index = i + 1
            string_list[start_index:finish_index] = sorted(string_list[start_index:finish_index]) #start ~ finish까지 슬라이싱, 해당 슬라이싱한 부분 아스키순 정렬
            start_index = finish_index #start_index 초기화
    finish_index = len(string_list)
    string_list[start_index:finish_index] = sorted(string_list[start_index:finish_index]).copy() # for문 돌고나서 마지막 부분은 바뀌지않아서 추가함, test_case #4 / #5 참조

    for i in string_list:
        print(i)
if __name__ == '__main__':
    main()

# * Note
# sortAlphabeticallyList.append(temp_list.copy()) #append(temp_list) --> 처음 그냥 선언시키면 포인터 형식인 것을 기억할 것... 복사할거면 .copy()로 넣어야지, 안그러면 해당 리스트
#                                                                        내장함수 사용시 메모리 주소로 읽어와서 같이 초기화 되버림
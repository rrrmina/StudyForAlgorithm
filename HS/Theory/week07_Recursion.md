# What Is Recursion
### Content
- Recursion

## Recursion
어떤 사건이 자기 자신을 포함하고 다시 자기 자신을 사용하여 정의될 때 재귀적(recursive)라 한다.

### 재귀의 사용 예
- 팩토리얼 구하기    
음이 아닌 정수 n의 팩토리얼(n!)은 재귀적으로 정의할 수 있다.
    1. 0! = 1
    2. n > 0이면 n! = n X (n-1)!
```
class Factorial { 
    static int factorial(int n) {
        if(n > 0)
            return n * factorial(n-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();
        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
```

- 유클리드 호제법
두 정수의 최대공약수를 재귀적으로 구하는 방법    
x = az와 y = bz를 만족하는 정수 a, b와 최대의 정수 z가 존재할 때 z를 gcd(x,y)라고 할 수 있다.    
즉, 최대공약수는 y가 0이면 x이고, y가 0이 아니면 gcd(y, x % y)로 구한다.   
```
class EuclidGDC { 
    static int gcd(int x, int y) {
        if(y == 0)
            return x;
        else
            return gcd(y, x % y)
    }
    public static void main(string[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int x = sc.nextInt();
        System.out.print("정수를 입력하세요: ");
        int y = sc.nextInt();
        System.out.println("최대공약수는 " + gcd(x,y) + "입니다.");
    }
}
```
 

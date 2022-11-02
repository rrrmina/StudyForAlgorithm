package MA.Practice.week04;
// 서로 다른 부분 문자열의 개수 https://www.acmicpc.net/problem/11478
import java.util.HashSet;
import java.util.Scanner;

public class P11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> list = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            for(int j=i; j<str.length(); j++){
                String s = str.substring(i,j+1);
                list.add(s);
            }
        }
        System.out.println(list.size());
    }
}

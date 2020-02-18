import java.util.Scanner;
public class 수학최대공약수 {
	public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a, b);
        int l = a * b / g;
        System.out.println(g);
        System.out.println(l);
	    sc.close();

	}

}
/*
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

입력
24 18

출력 
6
72

시간복잡도 : O(log n)



24 : 1,2,3,4,6,8,12,24
18 : 1,2,3,6,9,18

24와 18의 최대공약수 : 1,2,3,6

최대 : 6


 유클리드 호제법
 GCD(a,b) -> GCD(b, a%b)
 
	a			b
	24			16
	16			8
	8			0 (Stop)


최소 공배수
24 : 24 48 72
18 : 18 36 54 72

구하는 법  24*18 / 6(최대공약수) = 72

*/
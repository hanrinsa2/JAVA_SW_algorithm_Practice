
import java.util.Scanner;

public class 수학나머지연산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b)%c);
        System.out.println((a+b)%c); // =(A%C + B%C)%C
        System.out.println((a*b)%c);
        System.out.println((a*b)%c); // =(A%C × B%C)%C
        sc.close();
	}

}

//음수의 경우 (6-5)%3 = 1%3 = 1
//(6%3-5%3)%3 = (0-2)%3 = -2%3 =?? 
//(6%3-5%3 + 3)%3 = (0-2 + 3)%3 = 1%3 =1


/*
(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.


첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.


입력
5 8 4

출력	
1
1
0
0

*/
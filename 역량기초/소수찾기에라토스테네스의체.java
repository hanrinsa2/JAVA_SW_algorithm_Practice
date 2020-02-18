import java.util.Scanner;
public class 소수찾기에라토스테네스의체 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n부터의 소수
        int m = sc.nextInt();//m까지의 소수
        boolean[] check = new boolean[m+1];
        check[0] = check[1] = true;//지워짐 : true      지워지지않음 : false
        for (int i=2; i*i <= m; i++) { // 100까지의 소수를 구하라하면 10까지만 구해도 전부 구해짐 
            if (check[i] == true) {
                continue;
            }
            for (int j=i+i; j<=m; j+=i) { // 2의 배수들을 지우기위해 2를 제외한 2X2 2X3 ... 를 true로 만듬
                check[j] = true;
            }
        }
        for (int i=n; i<=m; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }
    }
}

/*
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

입력
3 16

출력
3
5
7
11
13

 */

/*
1부터 N까지 범위안에 들어가는 모든 소수를 구하려면 에라토스테네스의 체를 사용한다.
2부터 N까지 모든 수를 써놓는다.
아직 지워지지 않은 수 중에서 가장 작은 수를 찾는다.
그 수는 소수이다.
이제 그 수의 배수를 모두 지운다.

*/
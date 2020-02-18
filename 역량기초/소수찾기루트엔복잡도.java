import java.util.Scanner;
public class 소수찾기루트엔복잡도 {

	public static boolean is_prime(int x) {
        if (x <= 1) {
            return false;
        } else if (x == 2) {
            return true;
        }
        for (int i=2; i*i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n-- > 0) {
            if (is_prime(sc.nextInt())) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }

}

/*
소수 : 약수가 1과 자기자신 밖에 없는 수

N이 소수가 되려면 2보다 크거나 같고 루트N보다 작거나 같은 자연수로 나누어 떨어지면 안됨.
이유 : N이 소수가 아니라면 N=aXb로 나타낼 수 있다.(a<=b)
 	 두 수 a와 b의 차이가 가장 작은 경우는 루트N이다. 따라서 루트N까지만 검사해보면 됨
 	 24 : 1,2,3,4 ~~ 6,8,12,24 

 */

/*
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 주어진 수들 중 소수의 개수를 출력한다.
 * 
 * 입력
 * 4
 * 1 3 5 7
 * 
 * 출력
 * 3
 */

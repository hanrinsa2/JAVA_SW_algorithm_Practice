import java.util.Scanner;
public class 수학GCD합 {

	public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            long ans = 0;
            for (int i=0; i<n-1; i++) {
                for (int j=i+1; j<n; j++) {
                    ans += gcd(a[i], a[j]);
                }
            }
            System.out.println(ans);
        }
    }

}
/*

양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.

첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다. 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1000000을 넘지 않는다.

각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.


입력
3
4 10 20 30 40
3 7 5 12
3 125 15 25

출력
70
3
35

*/

import java.util.Scanner;
public class ����GCD�� {

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

���� ���� n���� �־����� ��, ������ ��� ���� GCD�� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

ù° �ٿ� �׽�Ʈ ���̽��� ���� t (1 �� t �� 100)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�. �� �׽�Ʈ ���̽��� ���� ���� n (1 < n �� 100)�� �־�����, �������� n���� ���� �־�����. �Է����� �־����� ���� 1000000�� ���� �ʴ´�.

�� �׽�Ʈ ���̽����� ������ ��� ���� GCD�� ���� ����Ѵ�.


�Է�
3
4 10 20 30 40
3 7 5 12
3 125 15 25

���
70
3
35

*/

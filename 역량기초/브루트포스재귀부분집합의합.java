import java.util.Scanner;
public class ���Ʈ������ͺκ��������� {
	public static int go(int[] a, int m, int i, int sum) {
        if (i == a.length) {
            if (sum == m) {
                return 1;
            } else {
                return 0;
            }
        }
        return go(a, m, i+1, sum+a[i]) + go(a, m, i+1, sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = go(a, m, 0, 0);
        if (m == 0) {
            ans -= 1;
        }
        System.out.println(ans);
    }
}

/*

����
N���� ������ �̷���� ������ ���� ��, ũ�Ⱑ ����� �κм��� �߿��� �� ������ ���Ҹ� �� ���� ���� S�� �Ǵ� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ������ ��Ÿ���� N�� ���� S�� �־�����. (1 �� N �� 20, |S| �� 1,000,000) ��° �ٿ� N���� ������ �� ĭ�� ���̿� �ΰ� �־�����. �־����� ������ ������ 100,000�� ���� �ʴ´�.

���
ù° �ٿ� ���� S�� �Ǵ� �κм����� ������ ����Ѵ�.

�Է�
5 0
-7 -3 -2 5 8
���
1

*/
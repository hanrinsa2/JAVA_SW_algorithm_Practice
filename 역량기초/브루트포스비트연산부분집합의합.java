import java.util.Scanner;
public class ���Ʈ������Ʈ����κ��������� {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i=1; i<(1<<n); i++) {
            int sum = 0;
            for (int k=0; k<n; k++) {
                if ((i&(1<<k)) != 0) {
                    sum += a[k];
                }
            }
            if (sum == s) {
                ans += 1;
            }
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
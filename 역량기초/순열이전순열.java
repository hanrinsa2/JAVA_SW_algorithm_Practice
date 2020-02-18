import java.util.Scanner;
public class ������������ {
	public static boolean prev_permutation(int[] a) {
        int i = a.length-1;
        while (i > 0 && a[i-1] <= a[i]) {
            i -= 1;
        }

        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] >= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        if (prev_permutation(a)) {
            for (int i=0; i<n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("-1");
        }
    }
}


/*

����
1���� N������ ���� �̷���� ������ �ִ�. �̶�, ���������� �ٷ� ������ ���� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ������ ���� �ռ��� ������ ������������ �̷���� �����̰�, ���� �������� ���� ������ ������������ �̷���� �����̴�.

N = 3�� ��쿡 ���������� ������ �����ϸ� ������ ����.

1, 2, 3
1, 3, 2
2, 1, 3
2, 3, 1
3, 1, 2
3, 2, 1
�Է�
ù° �ٿ� N(1 �� N �� 10,000)�� �־�����. ��° �ٿ� ������ �־�����.

���
ù° �ٿ� �Է����� �־��� ������ ������ ���� ������ ����Ѵ�. ����, ���������� ���� ó���� ���� ������ ��쿡�� -1�� ����Ѵ�.

�Է�
4
1 2 3 4
���
-1

�Է�
5
5 4 3 2 1
���
5 4 3 1 2

*/
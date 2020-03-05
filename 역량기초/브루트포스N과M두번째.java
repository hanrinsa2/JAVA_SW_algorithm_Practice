import java.util.Scanner;
public class ���Ʈ����N��M�ι�° {
	static int[] a = new int[10];
    static void go(int index, int selected, int n, int m) {
        if (selected == m) {
            for (int i=0; i<m; i++) {
                System.out.print(a[i]);
                if (i != m-1) System.out.print(' ');
            }
            System.out.println();
            return;
        }
        if (index > n) return;
        a[selected] = index;
        go(index+1, selected+1, n, m);
        a[selected] = 0;
        go(index+1, selected, n, m);
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        go(1, 0, n, m);
    }
}


/*

����
�ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����
�� ������ ���������̾�� �Ѵ�.
�Է�
ù° �ٿ� �ڿ��� N�� M�� �־�����. (1 �� M �� N �� 8)

���
�� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�. �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ� ����ؾ� �Ѵ�.

������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.

���� �Է� 1 
3 1
���� ��� 1 
1
2
3

���� �Է� 2 
4 2
���� ��� 2 
1 2
1 3
1 4
2 3
2 4
3 4

���� �Է� 3 
4 4
���� ��� 3 
1 2 3 4

*/
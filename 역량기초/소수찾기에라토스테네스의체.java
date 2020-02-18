import java.util.Scanner;
public class �Ҽ�ã�⿡���佺�׳׽���ü {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//n������ �Ҽ�
        int m = sc.nextInt();//m������ �Ҽ�
        boolean[] check = new boolean[m+1];
        check[0] = check[1] = true;//������ : true      ������������ : false
        for (int i=2; i*i <= m; i++) { // 100������ �Ҽ��� ���϶��ϸ� 10������ ���ص� ���� ������ 
            if (check[i] == true) {
                continue;
            }
            for (int j=i+i; j<=m; j+=i) { // 2�� ������� ��������� 2�� ������ 2X2 2X3 ... �� true�� ����
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
M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000)
�� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.

�Է�
3 16

���
3
5
7
11
13

 */

/*
1���� N���� �����ȿ� ���� ��� �Ҽ��� ���Ϸ��� �����佺�׳׽��� ü�� ����Ѵ�.
2���� N���� ��� ���� ����´�.
���� �������� ���� �� �߿��� ���� ���� ���� ã�´�.
�� ���� �Ҽ��̴�.
���� �� ���� ����� ��� �����.

*/
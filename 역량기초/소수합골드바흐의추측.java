import java.util.ArrayList;
import java.util.Scanner;
public class �Ҽ��հ����������� {
	public static final int MAX = 1000000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[MAX+1];
        ArrayList<Integer> prime = new ArrayList<Integer>();
        check[0] = check[1] = true;
        for (int i=2; i*i <= MAX; i++) {
            if (check[i] == true) {
                continue;
            }
            prime.add(i);
            for (int j=i+i; j<=MAX; j+=i) {
                check[j] = true;
            }
        }
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            for (int i=1; i<prime.size(); i++) {//������ ���� �Ҽ����� ������ �־ ��
                int p = prime.get(i);
                if (check[n - p] == false) { //�Է���¦��-�� �Ҽ��� �� ������ �� �˻��Ѵ�.
                    System.out.println(n + " = " + p + " + " + (n-p));
                    break;//�߰ߵǸ� �׻��·� ��ž
                }
            }
        }
    }
}
/*
1742��, ������ �Ƹ��߾� ���а� ũ����Ƽ�� ������� �����ϸ�Ʈ ���Ϸ����� ������ ���� ������ �����ϴ� ������ ���´�.

4���� ū ��� ¦���� �� Ȧ�� �Ҽ��� ������ ��Ÿ�� �� �ִ�.
���� ��� 8�� 3 + 5�� ��Ÿ�� �� �ְ�, 3�� 5�� ��� Ȧ���� �Ҽ��̴�. ��, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 �̴�.

�� ������ ������ �ذ���� ���� �����̴�.

�鸸 ������ ��� ¦���� ���ؼ�, �� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է��� �ϳ� �Ǵ� �� �̻��� �׽�Ʈ ���̽��� �̷���� �ִ�. �׽�Ʈ ���̽��� ������ 100,000���� ���� �ʴ´�.

�� �׽�Ʈ ���̽��� ¦�� ���� n �ϳ��� �̷���� �ִ�. (6 �� n �� 1000000)

�Է��� ������ �ٿ��� 0�� �ϳ� �־�����.

�� �׽�Ʈ ���̽��� ���ؼ�, n = a + b ���·� ����Ѵ�. �̶�, a�� b�� Ȧ�� �Ҽ��̴�. ���ڿ� �����ڴ� ���� �ϳ��� ���еǾ��� �ִ�. ����, n�� ���� �� �ִ� ����� ���� �������, b-a�� ���� ū ���� ����Ѵ�. ��, �� Ȧ�� �Ҽ��� ������ n�� ��Ÿ�� �� ���� ��쿡�� "Goldbach's conjecture is wrong."�� ����Ѵ�.

�Է�
8
20
42
0

���
8 = 3 + 5
20 = 3 + 17
42 = 5 + 37

*/
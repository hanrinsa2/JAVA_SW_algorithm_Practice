import java.util.Scanner;
public class �Ҽ�ã���Ʈ�����⵵ {

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
�Ҽ� : ����� 1�� �ڱ��ڽ� �ۿ� ���� ��

N�� �Ҽ��� �Ƿ��� 2���� ũ�ų� ���� ��ƮN���� �۰ų� ���� �ڿ����� ������ �������� �ȵ�.
���� : N�� �Ҽ��� �ƴ϶�� N=aXb�� ��Ÿ�� �� �ִ�.(a<=b)
 	 �� �� a�� b�� ���̰� ���� ���� ���� ��ƮN�̴�. ���� ��ƮN������ �˻��غ��� ��
 	 24 : 1,2,3,4 ~~ 6,8,12,24 

 */

/*
 * �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
 * �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
 * 
 * �Է�
 * 4
 * 1 3 5 7
 * 
 * ���
 * 3
 */

import java.util.Arrays;
import java.util.Scanner;
public class ���Ʈ������;�ȣ����� {
	public static boolean check(String password) {
        int ja = 0;
        int mo = 0;
        for (char x : password.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo += 1;
            } else {
                ja += 1;
            }
        }
        return ja >= 2 && mo >= 1;
    }
    public static void go(int n, String[] alpha, String password, int i) {
        if (password.length() == n) {
            if (check(password)) {
                System.out.println(password);
            }
            return;
        }
        if (i >= alpha.length) return;
        go(n, alpha, password+alpha[i], i+1);
        go(n, alpha, password, i+1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String[] alpha = new String[m];
        for (int i=0; i<m; i++) {
            alpha[i] = sc.next();
        }
        
        Arrays.sort(alpha);
        
        go(n, alpha, "", 0);
    }
}
/*

����
�ٷ� ���� �ֹ��� ������ �� ���踦 �ָӴϿ� ���� ä �����ϰ� ����� �� ������ Ȳ���� ��Ȳ�� ������ ��������, 702ȣ�� ���ο� ���� �ý����� ��ġ�ϱ�� �Ͽ���. �� ���� �ý����� ���谡 �ƴ� ��ȣ�� �����ϰ� �Ǿ� �ִ� �ý����̴�.

��ȣ�� ���� �ٸ� L���� ���ĺ� �ҹ��ڵ�� �����Ǹ� �ּ� �� ���� ������ �ּ� �� ���� �������� �����Ǿ� �ִٰ� �˷��� �ִ�. ���� ���ĵ� ���ڿ��� ��ȣ�ϴ� �������� �������� �̷�� ���� ��ȣ�� �̷�� ���ĺ��� ��ȣ���� �����ϴ� ������ �迭�Ǿ��� ���̶�� �����ȴ�. ��, abc�� ���ɼ��� �ִ� ��ȣ������ bac�� �׷��� �ʴ�.

�� ���� �ý��ۿ��� �������� ��ȣ�� ������� ���� ������ ������ C������ �ִٰ� �Ѵ�. �� ���ĺ��� �Լ��� �ν�, ���� ������ �������� �濡 ħ���ϱ� ���� ��ȣ�� ������ ������ �Ѵ�. C���� ���ڵ��� ��� �־����� ��, ���ɼ� �ִ� ��ȣ���� ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �� ���� L, C�� �־�����. (3 �� L �� C �� 15) ���� �ٿ��� C���� ���ڵ��� �������� ���еǾ� �־�����. �־����� ���ڵ��� ���ĺ� �ҹ����̸�, �ߺ��Ǵ� ���� ����.

���
�� �ٿ� �ϳ���, ���������� ���ɼ� �ִ� ��ȣ�� ��� ����Ѵ�.


�Է�
4 6
a t c i s w

���
acis
acit
aciw
acst
acsw
actw
aist
aisw
aitw
astw
cist
cisw
citw
istw

*/
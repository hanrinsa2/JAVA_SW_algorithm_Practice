import java.util.Scanner;
public class �����ּҰ���� {

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
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int g = gcd(a, b);
	            int l = a * b / g;
	            System.out.println(l);
	        }
	        sc.close();
	    }

}
/*

�� �ڿ��� A�� B�� ���ؼ�, A�� ����̸鼭 B�� ����� �ڿ����� A�� B�� �������� �Ѵ�. �̷� ����� �߿��� ���� ���� ���� �ּҰ������� �Ѵ�. ���� ���, 6�� 15�� ������� 30, 60, 90���� ������, �ּ� ������� 30�̴�.

�� �ڿ��� A�� B�� �־����� ��, A�� B�� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. ��° �ٺ��� T���� �ٿ� ���ļ� A�� B�� �־�����. (1 �� A, B �� 45,000)

ù° �ٺ��� T���� �ٿ� A�� B�� �ּҰ������ �Է¹��� ������� �� �ٿ� �ϳ��� ����Ѵ�.

�Է�
3
1 45000
6 10
13 17

���
45000
30
221

*/
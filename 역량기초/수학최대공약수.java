import java.util.Scanner;
public class �����ִ����� {
	public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a, b);
        int l = a * b / g;
        System.out.println(g);
        System.out.println(l);
	    sc.close();

	}

}
/*
�� ���� �ڿ����� �Է¹޾� �ִ� ������� �ּ� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
ù° �ٿ��� �� ���� �ڿ����� �־�����. �� ���� 10,000������ �ڿ����̸� ���̿� �� ĭ�� ������ �־�����.
ù° �ٿ��� �Է����� �־��� �� ���� �ִ�������,��° �ٿ��� �Է����� �־��� �� ���� �ּ� ������� ����Ѵ�.

�Է�
24 18

��� 
6
72

�ð����⵵ : O(log n)



24 : 1,2,3,4,6,8,12,24
18 : 1,2,3,6,9,18

24�� 18�� �ִ����� : 1,2,3,6

�ִ� : 6


 ��Ŭ���� ȣ����
 GCD(a,b) -> GCD(b, a%b)
 
	a			b
	24			16
	16			8
	8			0 (Stop)


�ּ� �����
24 : 24 48 72
18 : 18 36 54 72

���ϴ� ��  24*18 / 6(�ִ�����) = 72

*/

import java.util.Scanner;

public class ���г��������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a+b)%c);
        System.out.println((a+b)%c); // =(A%C + B%C)%C
        System.out.println((a*b)%c);
        System.out.println((a*b)%c); // =(A%C �� B%C)%C
        sc.close();
	}

}

//������ ��� (6-5)%3 = 1%3 = 1
//(6%3-5%3)%3 = (0-2)%3 = -2%3 =?? 
//(6%3-5%3 + 3)%3 = (0-2 + 3)%3 = 1%3 =1


/*
(A+B)%C�� (A%C + B%C)%C �� ������?

(A��B)%C�� (A%C �� B%C)%C �� ������?

�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.


ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)

ù° �ٿ� (A+B)%C, ��° �ٿ� (A%C + B%C)%C, ��° �ٿ� (A��B)%C, ��° �ٿ� (A%C �� B%C)%C�� ����Ѵ�.


�Է�
5 8 4

���	
1
1
0
0

*/
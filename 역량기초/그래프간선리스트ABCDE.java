import java.util.ArrayList;
import java.util.Scanner;
class Edge {
    int from, to;
    Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}
public class �׷�����������ƮABCDE {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] a = new boolean[n][n];
        ArrayList<Integer>[] g = (ArrayList<Integer>[]) new ArrayList[n];
        ArrayList<Edge> edges = new ArrayList<Edge>();
        for (int i=0; i<n; i++) {
            g[i] = new ArrayList<Integer>();
        }
        for (int i=0; i<m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            edges.add(new Edge(from, to));
            edges.add(new Edge(to, from));
            a[from][to] = a[to][from] = true;
            g[from].add(to);
            g[to].add(from);
        }
        m *= 2;
        for  (int i=0; i<m; i++) {
            for (int j=0; j<m; j++) {
                int A = edges.get(i).from;
                int B = edges.get(i).to;
                int C = edges.get(j).from;
                int D = edges.get(j).to;
                if (A == B || A == C || A == D || B == C || B == D || C == D) {
                    continue;
                }
                if (!a[B][C]) continue;
                for (int E : g[D]) {
                    if (A == E || B == E || C == E || D == E) {
                        continue;
                    }
                    System.out.println(1);
                    System.exit(0);
                }
            }
        }
        System.out.println(0);
    }

}

/*
 * 
 
����
BOJ �˰��� ķ������ �� N���� �����ϰ� �ִ�. ������� 0������ N-1������ ��ȣ�� �Ű��� �ְ�, �Ϻ� ������� ģ���̴�.

������ ������ ���� ģ�� ���踦 ���� ��� A, B, C, D, E�� �����ϴ��� ���غ����� �Ѵ�.

A�� B�� ģ����.
B�� C�� ģ����.
C�� D�� ģ����.
D�� E�� ģ����.
���� ���� ģ�� ���谡 �����ϴ��� ���ϴ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ����� �� N (5 �� N �� 2000)�� ģ�� ������ �� M (1 �� M �� 2000)�� �־�����.

��° �ٺ��� M���� �ٿ��� ���� a�� b�� �־�����, a�� b�� ģ����� ���̴�. (0 �� a, b �� N-1, a �� b) ���� ģ�� ���谡 �� �� �̻� �־����� ���� ����.

���
������ ���ǿ� �´� A, B, C, D, E�� �����ϸ� 1�� ������ 0�� ����Ѵ�.

���� �Է� 1 
5 4
0 1
1 2
2 3
3 4
���� ��� 1 
1
���� �Է� 2 
5 5
0 1
1 2
2 3
3 0
1 4
���� ��� 2 
1
���� �Է� 3 
6 5
0 1
0 2
0 3
0 4
0 5
���� ��� 3 
0
���� �Է� 4 
8 8
1 7
3 7
4 7
3 4
4 6
3 5
0 4
2 7
���� ��� 4 
1
*/



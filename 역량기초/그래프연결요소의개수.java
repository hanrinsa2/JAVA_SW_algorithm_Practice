import java.util.ArrayList;
import java.util.Scanner;
public class �׷����������ǰ��� {
	public static void dfs(ArrayList<Integer>[] a, boolean[] c, int x) {
        if (c[x]) {
            return;
        }
        c[x] = true;
        for (int y : a[x]) {
            if (c[y] == false) {
                dfs(a, c, y);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        for (int i=0; i<m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v);
            a[v].add(u);
        }
        boolean[] check = new boolean[n+1];
        int ans = 0;
        for (int i=1; i<=n; i++) {
            if (check[i] == false) {
                dfs(a, check, i);
                ans += 1;
            }
        }
        System.out.println(ans);
                

    }
}

/*


����
���� ���� �׷����� �־����� ��, ���� ��� (Connected Component)�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� ������ ���� N�� ������ ���� M�� �־�����. (1 �� N �� 1,000, 0 �� M �� N��(N-1)/2) ��° �ٺ��� M���� �ٿ� ������ �� ���� u�� v�� �־�����. (1 �� u, v �� N, u �� v) ���� ������ �� ���� �־�����.

���
ù° �ٿ� ���� ����� ������ ����Ѵ�.

���� �Է� 1 
6 5
1 2
2 5
5 1
3 4
4 6
���� ��� 1 
2
���� �Է� 2 
6 8
1 2
2 5
5 1
3 4
4 6
5 4
2 4
2 3

*/
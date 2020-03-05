import java.util.ArrayList;
import java.util.Scanner;
class Edge {
    int from, to;
    Edge(int from, int to) {
        this.from = from;
        this.to = to;
    }
}
public class 그래프간선리스트ABCDE {
	
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
 
문제
BOJ 알고리즘 캠프에는 총 N명이 참가하고 있다. 사람들은 0번부터 N-1번으로 번호가 매겨져 있고, 일부 사람들은 친구이다.

오늘은 다음과 같은 친구 관계를 가진 사람 A, B, C, D, E가 존재하는지 구해보려고 한다.

A는 B와 친구다.
B는 C와 친구다.
C는 D와 친구다.
D는 E와 친구다.
위와 같은 친구 관계가 존재하는지 안하는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 사람의 수 N (5 ≤ N ≤ 2000)과 친구 관계의 수 M (1 ≤ M ≤ 2000)이 주어진다.

둘째 줄부터 M개의 줄에는 정수 a와 b가 주어지며, a와 b가 친구라는 뜻이다. (0 ≤ a, b ≤ N-1, a ≠ b) 같은 친구 관계가 두 번 이상 주어지는 경우는 없다.

출력
문제의 조건에 맞는 A, B, C, D, E가 존재하면 1을 없으면 0을 출력한다.

예제 입력 1 
5 4
0 1
1 2
2 3
3 4
예제 출력 1 
1
예제 입력 2 
5 5
0 1
1 2
2 3
3 0
1 4
예제 출력 2 
1
예제 입력 3 
6 5
0 1
0 2
0 3
0 4
0 5
예제 출력 3 
0
예제 입력 4 
8 8
1 7
3 7
4 7
3 4
4 6
3 5
0 4
2 7
예제 출력 4 
1
*/



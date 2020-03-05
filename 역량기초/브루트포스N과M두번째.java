import java.util.Scanner;
public class 브루트포스N과M두번째 {
	static int[] a = new int[10];
    static void go(int index, int selected, int n, int m) {
        if (selected == m) {
            for (int i=0; i<m; i++) {
                System.out.print(a[i]);
                if (i != m-1) System.out.print(' ');
            }
            System.out.println();
            return;
        }
        if (index > n) return;
        a[selected] = index;
        go(index+1, selected+1, n, m);
        a[selected] = 0;
        go(index+1, selected, n, m);
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        go(1, 0, n, m);
    }
}


/*

문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
고른 수열은 오름차순이어야 한다.
입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

예제 입력 1 
3 1
예제 출력 1 
1
2
3

예제 입력 2 
4 2
예제 출력 2 
1 2
1 3
1 4
2 3
2 4
3 4

예제 입력 3 
4 4
예제 출력 3 
1 2 3 4

*/
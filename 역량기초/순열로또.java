import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class 순열로또 {
	static boolean next_permutgetion(int[] a) {
        int i = a.length-1;
        while (i > 0 && a[i-1] >= a[i]) {
            i -= 1;
        }

        if (i <= 0) {
            return false;
        }

        int j = a.length-1;
        while (a[j] <= a[i-1]) {
            j -= 1;
        }

        int temp = a[i-1];
        a[i-1] = a[j];
        a[j] = temp;

        j = a.length-1;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i += 1;
            j -= 1;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[] a = new int[n];
            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            int[] d = new int[n];
            for (int i=0; i<n; i++) {
                if (i < n-6) d[i] = 0;  // a[] : 1 2 3 4 5 6 7 8 을
                else d[i] = 1;          // d[] : 0 0 1 1 1 1 1 1 으로 만듦
            }
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            do {
                ArrayList<Integer> cur = new ArrayList<>();
                for (int i=0; i<n; i++) {
                    if (d[i] == 1) {
                        cur.add(a[i]);
                    }
                }
                ans.add(cur);
            } while (next_permutgetion(d));
            Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
                public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2) {
                    int n = l1.size();
                    int m = l2.size();
                    int i = 0;
                    while (i < n && i < m) {
                        int t1 = l1.get(i);
                        int t2 = l2.get(i);
                        if (t1 < t2) return -1;
                        else if (t1 > t2) return 1;
                        i += 1;
                    }
                    if (i == n && i != m) return -1;
                    else if (i != n && i == m) return 1;
                    return 0;
                }
            });
            for (ArrayList<Integer> v : ans) {
                for (int x : v) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

/*
 * 

문제
독일 로또는 {1, 2, ..., 49}에서 수 6개를 고른다.

로또 번호를 선택하는데 사용되는 가장 유명한 전략은 49가지 수 중 k(k>6)개의 수를 골라 집합 S를 만든 다음 그 수만 가지고 번호를 선택하는 것이다.

예를 들어, k=8, S={1,2,3,5,8,13,21,34}인 경우 이 집합 S에서 수를 고를 수 있는 경우의 수는 총 28가지이다. ([1,2,3,5,8,13], [1,2,3,5,8,21], [1,2,3,5,8,34], [1,2,3,5,13,21], ..., [3,5,8,13,21,34])

집합 S와 k가 주어졌을 때, 수를 고르는 모든 방법을 구하는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있다. 첫 번째 수는 k (6 < k < 13)이고, 다음 k개 수는 집합 S에 포함되는 수이다. S의 원소는 오름차순으로 주어진다.

입력의 마지막 줄에는 0이 하나 주어진다. 

출력
각 테스트 케이스마다 수를 고르는 모든 방법을 출력한다. 이때, 사전 순으로 출력한다.

각 테스트 케이스 사이에는 빈 줄을 하나 출력한다.



입력
7 1 2 3 4 5 6 7
8 1 2 3 5 8 13 21 34
0

출력
1 2 3 4 5 6
1 2 3 4 5 7
1 2 3 4 6 7
1 2 3 5 6 7
1 2 4 5 6 7
1 3 4 5 6 7
2 3 4 5 6 7

1 2 3 5 8 13
1 2 3 5 8 21
1 2 3 5 8 34
1 2 3 5 13 21
1 2 3 5 13 34
1 2 3 5 21 34
1 2 3 8 13 21
1 2 3 8 13 34
1 2 3 8 21 34
1 2 3 13 21 34
1 2 5 8 13 21
1 2 5 8 13 34
1 2 5 8 21 34
1 2 5 13 21 34
1 2 8 13 21 34
1 3 5 8 13 21
1 3 5 8 13 34
1 3 5 8 21 34
1 3 5 13 21 34
1 3 8 13 21 34
1 5 8 13 21 34
2 3 5 8 13 21
2 3 5 8 13 34
2 3 5 8 21 34
2 3 5 13 21 34
2 3 8 13 21 34
2 5 8 13 21 34
3 5 8 13 21 34

*/


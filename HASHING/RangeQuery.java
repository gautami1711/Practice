package HASHING;

import java.util.Arrays;
import java.util.Scanner;

public class RangeQuery {

    /*Question Desc- given a number of elements n and some queries as rage.
     For each query the left and right index is given where we have to increase the a[index] by 1. We have to return the final array after all the queries.
      n=5
      q1= 1,4  (queries are in the range of 0 to n-1)
      q2=2,3

      a[]=0,0,0,0,0
      o/p-0,1,2,2,1*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n + 5];
        Arrays.fill(a, 0);
        while (q > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            a[l] += 1;
            a[r + 1] += -1;
            q--;
        }
        for (int i = 1; i <= n; i++) {
            a[i] = a[i] + a[i - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

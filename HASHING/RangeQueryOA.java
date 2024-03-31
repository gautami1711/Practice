package HASHING;

import java.util.Scanner;

public class RangeQueryOA {
    public static void main(String[] args) {

       /* Ques Desc-  Given an array of size N; in 1 operation you can change any a[i] to A[i]+x; you can do these operations only 1 time on each index. Also x should lie in [-k,k]; after doing all these operations;pick up the largest possible set of equal numbers.

                N=3
                [5,8,10] and k=2
->[5(5+0),8(8+0),8(10-2)]---------> so the answer is 2
        Constraints-
                1<=n<=100000
        1<=k<=100000
        100000<=a[i]>=k+1*/
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long[] a = new long[(int)(n + 1)];

        long k = scanner.nextLong();

        long i = 1;
        while (i <= n) {
            a[(int)i] = scanner.nextLong();
            i++;
        }

        long[] b = new long[200005];
        i = 1;
        while (i <= n) {
            long l = a[(int)i] - k;
            long r = a[(int)i] + k;
            b[(int)l] = b[(int)l] + 1;
            b[(int)(r + 1)] = b[(int)(r + 1)] - 1;
            i = i + 1;
        }

        long answer = 1;
        i = 1;
        while (i <= 200000) {
            b[(int)i] = b[(int)(i - 1)] + b[(int)i];
            answer = Math.max(b[(int)i], answer);
            i = i + 1;
        }

        System.out.println(answer);
    }
}

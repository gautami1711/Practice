package HASHING;

import java.util.HashMap;
import java.util.Scanner;

public class MicrosoftOa {
    public static long sol(long v) {
        long sum = 0;
        while (v != 0) {
            sum = sum + v % 10;
            v = v / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] b = new long[n + 1];

        int i = 1;
        while (i <= n) {
            b[i] = scanner.nextLong();
            i++;
        }

        HashMap<Long, Long> kk = new HashMap<>();
        i = 1;
        long answer = -1;

        while (i <= n) {
            if (kk.containsKey(sol(b[i]))) {
                long pp = b[i] + kk.get(sol(b[i]));
                answer = Math.max(answer, pp);
                kk.put(sol(b[i]), Math.max(kk.get(sol(b[i])), b[i]));
            } else {
                kk.put(sol(b[i]), b[i]);
            }
            i++;
        }

        System.out.println(answer);
    }
}


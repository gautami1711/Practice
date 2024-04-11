package HASHING;

import java.util.Scanner;

public class HackerrankQuestionOptimized {

    //optimized solution using range query trick to add a[l]+1 and a[r+1]-1

    public
    static int convert(String s) {
        int u1 = s.charAt(0) - '0';
        int u5 = s.charAt(1) - '0';

        int v = (u1 * 10 + u5) * 60;

        u1 = s.charAt(3) - '0';
        u5 = s.charAt(4) - '0';

        v = v + (u1 * 10 + u5);

        return v;
    }

    static void ck(int min) {
        int hr = min / 60;
        int m = min % 60;

        if (hr <= 9) {
            System.out.print("0");
            System.out.print(hr);
        } else {
            System.out.print(hr);
        }
        System.out.print(":");

        if (m <= 9) {
            System.out.print("0");
            System.out.print(m);
        } else {
            System.out.print(m);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] y = new int[1441];

        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            String b = scanner.next();
            String v1 = scanner.next();
            String v5 = scanner.next();

            int t1 = convert(v1);
            int t5 = convert(v5);

            y[t1]++;
            y[t5 + 1]--;
        }

        int i = 1;
        while (i < 1440) {
            y[i] = y[i] + y[i - 1];
            i++;
        }

        int currCnt = 0;
        int flag = 0;

        for (int j = 0; j < 1440; j++) {
            if (y[j] == 0) {
                currCnt++;

                if (currCnt == k) {
                    ck(j - k + 1); // convert this minute to (hh:mm)
                    flag = 1;
                    break;
                }
            } else {
                currCnt = 0;
            }
        }

        if (flag == 0) {
            System.out.println("-1");
        }
    }
}

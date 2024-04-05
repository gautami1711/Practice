package TwoPointers;

import java.util.Scanner;

class LongestSubarrayInSortedArrayWithMaxDiffK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        int i = 0; // Change to 0-based index
        int j = 0; // Change to 0-based index
        int maxLen = 0;
        int diff = 0;

        while (i < n && j < n) {
            diff = b[j] - b[i];

            if (i == j) {
                if (diff > k) {
                    i++;
                    j++;

                    if (i < n) {
                        diff = b[j] - b[i];
                    }
                } else {
                    int currLen = 1;
                    maxLen = Math.max(currLen, maxLen);
                    j++;

                    if (j < n) {
                        diff = b[j] - b[i];
                    }
                }
            } else {
                if (diff > k) {
                    i++;
                    j--;

                    if (i > j) {
                        j = i;
                    }

                    diff = b[j] - b[i];
                } else {
                    int currLen = Math.abs(i - j) + 1;
                    j++;

                    if (j < n) {
                        diff = b[j] - b[i];
                    }

                    maxLen = Math.max(currLen, maxLen);
                }
            }
        }

        System.out.println(maxLen);
        scanner.close();
    }
}

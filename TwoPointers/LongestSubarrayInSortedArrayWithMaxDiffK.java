package TwoPointers;

import java.util.Scanner;

class LongestSubarrayInSortedArrayWithMaxDiffK {

    public static int atMostDiff(int[] arr, int n, int k) {

        int left = 0;
        int right = 0;
        int maxLen = 0;
        while (right < n) {
            if (Math.abs(arr[right] - arr[left]) <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                left++;
                if (left > right)
                    right = left;
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        int[] arr = {8, 9, 11,12,18,20, 22, 28, 35, 36,38, 35, 358, 359, 360};
        int n = arr.length;
        int k = 35;
        System.out.println(atMostDiff(arr, n, k));
    }
}

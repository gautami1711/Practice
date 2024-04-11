package HASHING;

import java.util.HashMap;

public class CountOfSubarrayWithLongestLengthWithSumK {
    public static void main(String[] args) {
        int[] a = {10, 5, 2, 7, 1, 9, 8, 7};
        int k = 15;
        int i = 0, j = 0;
        int prefixSum = 0;
        int count = 0;
        int currLongestLength = Integer.MIN_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (j < a.length) {
            prefixSum += a[j];
            if (prefixSum == k) {
                int len = j - i + 1;
                if (len == currLongestLength) {
                    count++;
                } else if (len > currLongestLength) {
                    count = 1;
                    currLongestLength = len;
                }
            } else if (map.containsKey(Math.abs(prefixSum - k))) {
                int len = j - map.get(Math.abs(prefixSum - k));
                if (len == currLongestLength) {
                    count++;
                } else if (len > currLongestLength) {
                    count = 1;
                    currLongestLength = len;
                }
            }
            map.put(prefixSum, j);

            j++;
        }
        System.out.println(count);
    }
}

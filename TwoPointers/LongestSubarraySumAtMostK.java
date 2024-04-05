package TwoPointers;

public class LongestSubarraySumAtMostK {

    public static int atMostSum(int[] arr, int n, int k) {

        int sum = 0;

        int cnt = 0;

        int maxcnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {

                cnt = 0;
                continue;
            }

            if ((sum + arr[i]) <= k) {

                cnt++;
                sum += arr[i];
            } else {
                cnt++;
                sum += arr[i];

                while (sum > k) {
                    sum -= arr[i - cnt + 1];
                    cnt--;
                }
            }
            maxcnt = Math.max(cnt, maxcnt);
        }
        return maxcnt;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 5 };
        int n = arr.length;
        int k = 8;

        System.out.println(atMostSum(arr, n, k));
    }
}
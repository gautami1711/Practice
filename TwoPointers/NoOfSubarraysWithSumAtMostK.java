package TwoPointers;

public class NoOfSubarraysWithSumAtMostK {

    public static int atMostSum(int[] arr, int n, int k) {
        int sum = 0;
        int cnt = 0;
        int subarrayCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > k) {
                cnt = 0;
                continue;
            }
            if ((sum + arr[i]) <= k) {
                cnt++;
                sum += arr[i];
                subarrayCount += cnt;
            } else {
                cnt++;
                sum += arr[i];
                while (sum > k) {
                    sum -= arr[i - cnt + 1];
                    cnt--;
                }
                subarrayCount += cnt;
            }
        }
        return subarrayCount;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6};
        int n = arr.length;
        int k = 10;
        System.out.println(atMostSum(arr, n, k));
    }
}

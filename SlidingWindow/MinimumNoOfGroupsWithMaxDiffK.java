package SlidingWindow;

import java.util.Arrays;

public class MinimumNoOfGroupsWithMaxDiffK {

    public static  int MinimumNoOfGroupsWithMaxDiffK(int []arr,int n,int k){
//        Arrays.sort(arr);
//        int i=0;
//        int j=0;
//        int diff=0;
//        int cnt=0;
//        while(j<n){
//             diff=arr[j]-arr[i];
//            if(diff<=k){
//                if(j==n-1){
//                    cnt++;
//                    break;
//                }
//                j++;
//            }else{
//                i=j;
//                cnt++;
//            }
//        }
//        return cnt;

        int i = 0;
        int j = 0;
        int cnt = 0;
        while (j < n) {
            if (arr[j] - arr[i] <= k) {
                j++;
            } else {
                cnt++;
                i = j; // Move the window to the next element
            }
        }
        return cnt + 1;
    }
    public static void main(String[] args) {
        int []arr={1,5,4,6,8,9,2};
        System.out.println(MinimumNoOfGroupsWithMaxDiffK(arr,7,3));

    }
}

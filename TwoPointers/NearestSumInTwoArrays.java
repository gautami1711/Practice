package TwoPointers;

public class NearestSumInTwoArrays {
    public static void main(String[] args) {
        int n=4;
        int []a={0,1,4,5,7};
        int []b={0,10,20,30,40};
        int x=32;

        int p1=1,p2=n;
        int maxSumTillNow=0;
        int firstNo=0,secondNumber=0;
        while (p1<=n&&p2>=1){
            if(a[p1]+b[p2]<=x){
                int sum=a[p1]+b[p2];
                if(sum>maxSumTillNow){
                    maxSumTillNow=sum;
                    firstNo=a[p1];
                    secondNumber=b[p2];
                }
                p1++;
            }else {
                p2--;
            }
        }
        System.out.println(maxSumTillNow);



    }
}

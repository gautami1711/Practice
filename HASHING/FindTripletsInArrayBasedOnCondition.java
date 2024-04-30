package HASHING;

public class FindTripletsInArrayBasedOnCondition {
    public static void main(String[] args) {
        int []a={1,2,1,5,5};
        int []prefix=new int[a.length];
        prefix[0]=0;

        int []suffix=new int[a.length];
        suffix[a.length-1]=0;

        int j=1;
        while (j<a.length){
            int cnt=0;
            int i=0;
            while (i<j-1){
                if(a[i]>a[j])cnt++;
                i++;
            }
            prefix[j]=cnt;
            j++;
        }

         j=a.length-1;
        while (j>=0){
            int cnt=0;
            int k=j+1;
            while (k<a.length){
                if(a[j]<a[k])cnt++;
                k++;
            }
            suffix[j]=cnt;
            j--;
        }

        j=0;
        int cnt=0;
        while (j<a.length){
            cnt+=prefix[j]*suffix[j];
            j++;
        }
        System.out.println(cnt);



    }
}

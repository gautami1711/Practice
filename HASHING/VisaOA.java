package HASHING;

import java.util.Arrays;
import java.util.Scanner;

public class VisaOA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=3;
       int a[][]=new int [3][2];
       for(int i=0;i<n;i++){
           int n1=sc.nextInt();
           int n2=sc.nextInt();
           a[i][0]=n1;
           a[i][1]=n2;
       }
       int []pt={7,1,5,10,9,14};
       int []hash=new int[100001];
        Arrays.fill(hash,0);
        for(int i=0;i<n;i++){
            int l=a[i][0];
            int r=a[i][1];
            hash[l]+=1;
            hash[r+1]=hash[r+1]-1;
        }

        for(int i=1;i<100001;i++){
            hash[i]=hash[i]+hash[i-1];
        }

        for(int i=0;i<pt.length;i++){
            int point=pt[i];
            System.out.println(hash[point]);
        }


    }
}

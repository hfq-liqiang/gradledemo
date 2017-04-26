package com.ustb.alg;

/**
 * Created by HFQ-Arison on 2017/3/28.
 */
public class DivideTest {
    public static int devide(int n,int m){
        if(n<1 || m<1){
            return 0;
        }
        if(n==1&&m==1){
            return 1;
        }
        if(n<m){
            return devide(n,n);
        }
        if(n==m){
            return 1+devide(n,n-1);
        }
        return devide(n,m-1)+devide(n-m,m);
    }
    public static void main(String[] args) {
        int num=devide(8,8);
        System.out.println(num);
    }
}

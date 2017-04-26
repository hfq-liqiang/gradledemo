package com.ustb.alg;

/**
 * Created by HFQ-Arison on 2017/4/26.
 */
public class SelectSortTest {

    public static void printAry(int[] args){
        for(int i:args){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void selectSort(int[] ary){
        int i=0,j=0;
        int len=ary.length;
        for(i=0;i<len;i++){
            for( j=i;j<len;j++){
                if(ary[i]>ary[j]){
                    int tmp=ary[i];
                    ary[i]=ary[j];
                    ary[j]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] ary={1,31,21,17,8,30,4,1,9,20,60,99,1,100};
        //   int[] ary={32,21};
        printAry(ary);
        System.out.println("----------------------");
        selectSort(ary);
        printAry(ary);
        selectSort(ary);
    }
}

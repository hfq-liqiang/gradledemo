package com.ustb.alg;

/**
 * Created by HFQ-Arison on 2017/3/22.
 */
public class QuickSTest {
    public static void quickSort(int[] ary,int low,int high){
        if(low>high){
            return ;
        }else{
            int key=ary[low];
            int pivot=partition(ary,low,high);
            ary[pivot]=key;
            quickSort(ary,low,pivot-1);
            quickSort(ary,pivot+1,high);
        }
    }

    public static int partition(int[] ary,int low,int high){
        int key=ary[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<j && ary[j]>=key){
                --j;
            }
            if(i<j){
                ary[i]=ary[j];
            }

            while(i<j && ary[i]<key){
                i++;
            }
            if(i<j){
                ary[j]=ary[i];
            }
        }

        return i;
    }

    public static void printAry(int[] args){
        for(int i:args){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] ary={1,31,21,17,8,30,4,1,9,20,60,99,1,100};
        //   int[] ary={32,21};
        quickSort(ary,0,ary.length-1);
        printAry(ary);
    }
}

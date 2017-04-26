package com.ustb.alg;

/**
 * Created by HFQ-Arison on 2017/3/22.
 */
public class MergeSortTest {
    public static void mergeSort(int[] ary,int low,int high){
        if(low>=high-1){
            return ;
        }else{
            int mid=(low+high)/2;
            mergeSort(ary,low,mid);
            mergeSort(ary,mid,high);
            merge(ary,low,mid,high);
        }
    }

    public static void merge(int[] ary,int low,int mid,int high){
        //TODO
        int[] newary=new int [high-low];
        int i=low;int j=mid;
        int count=0;
        while(i<mid && j<high){
            if(ary[i]<=ary[j]){
                newary[count++]=ary[i];
                i++;
            }else{
                newary[count++]=ary[j];
                j++;
            }
        }

        while(i<mid){
            newary[count++]=ary[i++];
        }

        while(j<high){
            newary[count++]=ary[j++];
        }

      //  for(int m=low;m<high;m++){
        for(int m=0;m<count;m++){
            ary[low+m]=newary[m];
        }

    }
    public static void printAry(int[] args){
        for(int i:args){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] ary={3,21,17,8,30,4,9,20,60,99,1,100};
     //   int[] ary={32,21};
        mergeSort(ary,0,ary.length);
        printAry(ary);
    }
}

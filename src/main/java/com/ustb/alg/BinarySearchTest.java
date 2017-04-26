package com.ustb.alg;

/**
 * Created by HFQ-Arison on 2017/3/22.
 * just for test github --> by arison
 */
public class BinarySearchTest {
    public static int binarySearch(int[] ary,int low,int high ,int key) {
        if(low>high){
            return -1;
        }
        int mid=(low+high)/2;
        int result=-1;
        if(ary[mid]==key){
            return mid;
        }else if(ary[mid]>key){
            result= binarySearch(ary,low,mid-1,key);
        }else{
            result= binarySearch(ary,mid+1,high,key);
        }
        return result;
    }


    public static int binarySearch2(int[] ary,int low,int high ,int key) {
        while(low<=high) {
            int mid = (low + high) / 2;
            if (ary[mid] == key) {
                return mid;
            } else if (ary[mid] > key) {
                high=mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
           int[] ary={3,4,6,9,11,25,70,91,93};
           int index=binarySearch(ary,0,ary.length,3);
            System.out.println(index);
    }
}

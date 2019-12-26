package com.swq.NiuKe;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    static int[] num ;

    public static void main(String[] args) {
        num = new int[]{5,3,1,9,8,2,4,7};
        quicksort(0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
    private static void quicksort(int l ,int r)
    {
        if(l < r)
        {
            int tmp = partion(l,r);
            quicksort(l,tmp-1);
            quicksort(tmp+1,r);
        }
    }

    static Random random = new Random();
    private static int select(int p , int r , int k)
    {
        if(p == r)return num[p];
        int i = partion(p,r);
        int j = i-p+1;
        if(k <= j )return select(p,i,k);
        else return  select(i+1,r,k-j);
    }
    private static int partion(int p , int r)
    {


//         int rand = random.nextInt(r-p+1)+p;
//         int tmp = num[rand];
//         num[rand] =num[p];
       //  num[p] = tmp;
         int target = num[p];
         while(p < r)
         {
             while(p < r && num[r] > target)
             {
                 r--;
             }
             if(p < r)
             {
                 num[p] = num[r];
                 p++;
             }

             while(p < r &&num[p] < target)
             {
                 p++;
             }
             if(p < r)
             {
                 num[r] = num[p];
                 r--;
             }
         }
         num[r] = target;
        System.out.println(r);
        System.out.println(Arrays.toString(num));
         return r;

    }
}

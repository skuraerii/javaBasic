package com.neuedu.$6_13;

import java.util.ArrayList;
import java.util.List;

public class random {
    public static void main(String[] args) {
        int[] arr=new int[10];
        List<Integer> list=new ArrayList<>(10);

        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(1+Math.random()*100);
            if (arr[i]>=10){
                list.add(i,arr[i]);
            }
        }


        for (Integer i:list
        ) {
            System.out.println(i);
        }
    }
}

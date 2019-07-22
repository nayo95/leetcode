package com.yuyangzhang.demo;

import java.util.Arrays;
import java.util.Map;

import static java.lang.Math.abs;

public class dominator {
    public static void main(String[] args) {
     int[] ints = new int[] {3,4,3,2,-1,3,3,3};
     int result = judge(ints);
     if (result == -1)
         System.out.println("no dominator");
     else
         System.out.println("donimator: " + ints[result]);
    }

    public static int judge(int[] ints) {
        Arrays.sort(ints);
        int count = 0;
        for(int i = 0; i < ints.length - 1; i ++ ) {
            if (ints[i] == ints[i+1]) {
                count ++;
                if((double)count / ints.length > 0.5)
                    return i;
            } else {
                count = 1;
            }
        }
        return -1;
    }


}

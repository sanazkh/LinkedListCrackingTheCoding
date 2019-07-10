package com.sjsu.sanaz;

import java.util.ArrayList;
import java.util.List;

public class Q9General {

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k){
        if(k==0 || nums1.length == 0 || nums2.length == 0){
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> res;
        int kIndex = 0;
        int i = 0;
        int j = 0;
        while (kIndex < k){
            if(i < nums1.length && j < nums2.length){
                 res = new ArrayList<>();
                 res.add(nums1[i]);
                 res.add(nums2[j]);
                 result.add(res);
                 if(nums1[i] < nums2[j+1] && j < nums2.length - 1){
                         j++;
                 }else if(nums1[i+1] >= nums1[j] && i < nums1.length - 1){
                         i++;
                 }
            }
            kIndex++;
        }
        return result;
    }
}

package com.lucky.july;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 *
 * 两数之和
 *
 * @Author Guo Huaijian
 * @Date 2020/7/20 13:52
 */
public class TwoSum {
    public int[] twoSum(int @NotNull [] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;

        // 两遍哈希表
        /**
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement) };
                }
            }
            throw new IllegalArgumentException("No two sum solution");
        }
         */

        // 一遍哈希表
        /**
         public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
         int complement = target - nums[i];
         if (map.containsKey(complement)) {
         return new int[] { map.get(complement), i };
         }
         map.put(nums[i], i);
         }
         throw new IllegalArgumentException("No two sum solution");
         }
         */

    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        TwoSum sum = new TwoSum();
        System.out.println(Arrays.toString(sum.twoSum(nums, 6)));
    }
}

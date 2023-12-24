package leetcode;

import java.util.HashSet;

public class Problem217 {
      public static boolean containsDuplicate(int[] nums, int index) {
            if (index == nums.length) {
                  return false;
            }
            for (int i = 0; i < index; i++) {
                  if (nums[i] == nums[index]) {
                        return true;

                  }
            }

            for (int i = index + 1; i < nums.length; i++) {
                  if (nums[i] == nums[index]) {
                        return true;
                  }
            }
            return containsDuplicate(nums, index + 1);
      }
            public static boolean containsDuplicate2(int[] nums) {
            HashSet<Integer> set = new HashSet<> ();
            for(int i = 0;i <nums.length;i++){
                  if(!set.contains(nums[i])){
                  set.add(nums[i]);
                  }else{
                  return true;
                  }
            }
            return false;      
      }
      public static void main(String[] args) {
            int[] nums = { 1,1,1,3,3,4,3,2,4,2 };
            System.out.println(containsDuplicate(nums, 0));
                
      }
}

import java.io.*;
import java.util.*;

class Solution {

    static List<Integer> ans = new ArrayList<>();
    static boolean flag = false;

    public int[] twoSum(int[] nums, int target) {
        ans.clear(); // 리스트 초기화
        flag = false; // flag 초기화
        backtracking(0,nums, target);
        return new int[]{ans.get(0),ans.get(1)};
    }

    public static void backtracking(int start, int[] nums, int target){
       
        if(ans.size() == 2){
            if(nums[ans.get(0)]+nums[ans.get(1)] == target){
                flag = true;
            }

            return;
        }

        for(int i= start; i<nums.length; i++){
            ans.add(i);
            backtracking(i+1, nums, target);
            if(flag){
                return;
            }
            ans.remove(ans.size() - 1);
            
        }
    }

}
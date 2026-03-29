import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        // nums 로 만들 수 있는 부분집합 모두 반환

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        backtrack(0, result, ans, nums);

        return result;
    }

    private void backtrack(int start, List<List<Integer>> result, List<Integer> ans, int[] nums){

        result.add(new ArrayList<>(ans));

        for(int i=start; i<nums.length; i++){

            ans.add(nums[i]);
            backtrack(i+1, result, ans, nums);
            ans.remove(ans.size()-1);
        }
        
    }
}
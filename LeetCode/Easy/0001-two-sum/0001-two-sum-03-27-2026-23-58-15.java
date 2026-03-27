import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      return backtracking(nums, target, 0, new ArrayList<Integer>());

    }

   
    private int[] backtracking(int[] nums, int target, int start, List<Integer> answer){

        if(answer.size()==2){
            
            // 두 정수의 합이 target 이랑 같은지 비교
            if(nums[answer.get(0)] + nums[answer.get(1)] == target){
                return new int[]{answer.get(0), answer.get(1)};
            }

            // 아니라면 null 반환
            return null;
        }

        for(int i = start; i< nums.length; i++){

            answer.add(i);
            int[] result = backtracking(nums, target, i+1, answer);

            if(result !=null){
                return result;
            }

            answer.remove(answer.size()-1);
        }

        return null;
    }
}



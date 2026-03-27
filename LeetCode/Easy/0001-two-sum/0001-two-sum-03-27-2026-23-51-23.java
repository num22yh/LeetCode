import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      List<Integer> answer = new ArrayList<>();
      answer = backtrack(0,nums,target,answer);

      if (answer == null) return new int[0];

      return answer.stream().mapToInt(Integer::intValue).toArray();

    }

    private List<Integer> backtrack( int start,
                            int[] nums,
                            int target,
                            List<Integer> answer ){

                                 if(answer.size() == 2){

                if(nums[answer.get(0)] + nums[answer.get(1)] == target){
                    return answer;
                }

                return null;
             }

        for (int i = start; i < nums.length ; i++){

            answer.add(i); // answer[0]
            List<Integer> result = backtrack(i+1, nums, target, answer); // answer[0,1]

            if(result!= null){
                return result;
            }

            answer.remove(answer.size()-1);

        }

        return null;

    }
}



class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        return backtracking(0, nums , ans, target);
        
    }


    private int[] backtracking(int start, int[] nums, List<Integer> ans, int target){

        if(ans.size() == 2){

            if(nums[ans.get(0)] + nums[ans.get(1)] == target ){
                return new int[]{ans.get(0), ans.get(1)};
            }

            return null;
        }

        for(int i=start; i<nums.length ; i++){

            ans.add(i);
            int[] result = backtracking(i+1, nums, ans, target);

            if(result!=null){
                return result;
            }

            // result == null

            ans.remove(ans.size()-1);

        }

        return null;

    }
}
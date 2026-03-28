class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();

        backtracking(new ArrayList<>(), nums, visited , result );
        return result;
    }

    private void backtracking(List<Integer> answer, int[] nums , boolean[] visited , List<List<Integer>> result){

        if(answer.size() == nums.length){

            result.add(new ArrayList<>(answer));
            
            return;
        }

        for(int i=0; i<nums.length; i++){

            if(!visited[i]){
                
                visited[i] = true;
                answer.add(nums[i]);
                backtracking(answer, nums, visited, result);
                answer.remove(answer.size()-1);
                visited[i] = false;

            }
        
        }


    }
}
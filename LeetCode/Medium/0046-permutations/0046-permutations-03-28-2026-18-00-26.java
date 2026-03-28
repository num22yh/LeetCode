import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtracking(nums, ans, visited, result);
        
        return result;
        
    }

    private void backtracking( int[] nums,  List<Integer> ans , boolean[] visited , List<List<Integer>> result ){

        if(ans.size() == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i = 0; i<nums.length; i++){
            
            if(visited[i]==false){
                visited[i] = true;
                ans.add(nums[i]);

                backtracking(nums, ans, visited, result);

                ans.remove(ans.size()-1);
                visited[i]=false;
            }
           
            
        }

    }
}
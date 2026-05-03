import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        
        int answer = 0;
    
        for (int i = 0;  i < elements.length; i++ ) {
            sumSet.add(elements[i]);
            dfs(elements, 0, i, 0, sumSet);
        }
        return sumSet.size();
    }
    
    private void dfs(int[] elements, int level, int cur, int sum, Set<Integer> sumSet ){
        
        if(level == elements.length){
            return;
        }
        
        int next = (cur+1)%elements.length;
        
        sum = sum + elements[next];
        sumSet.add(sum);
        
        dfs(elements, level+1, next, sum, sumSet);
        
        return;
    }
}
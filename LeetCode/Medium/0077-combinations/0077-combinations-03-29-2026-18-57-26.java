class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        // 1-n 중 k개 선택해서 조합

        List<List<Integer>> result = new ArrayList<>();
        backtracking(1, result, new ArrayList<>(), n, k);

        return result;

    }

    private void backtracking(int start, List<List<Integer>> result, List<Integer> answer, int n, int k){
        
        if(answer.size() == k){
            result.add(new ArrayList<>(answer));
            return;
        }

        for (int i=start; i<=n; i++){
            answer.add(i);
            backtracking(i+1, result, answer, n, k);
            answer.remove(answer.size()-1);
        }

        return;
    }
}
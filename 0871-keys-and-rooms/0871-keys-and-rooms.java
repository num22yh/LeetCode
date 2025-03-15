class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, visited, 0);

        for(boolean r : visited){
            if(!r){
                return false;
            }
        }

        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] visited, int start){

        visited[start] = true;
        
        for(int i=0; i<rooms.get(start).size(); i++){
            int next = rooms.get(start).get(i);

            if(!visited[next]){
                visited[next] = true;
                dfs(rooms, visited, next);
            }
        }
    }
}
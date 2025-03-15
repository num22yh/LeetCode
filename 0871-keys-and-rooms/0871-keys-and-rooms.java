import java.io.*;
import java.util.*;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
            
        bfs(rooms, visited, 0);

        for(boolean r : visited){
            if(r == false){
                return false;
            }
        }

        return true;
    }

    public void bfs(List<List<Integer>> rooms, boolean[] visited, int start){
        LinkedList<Integer> queue = new LinkedList<>();

        queue.offer(start);
        visited[start] = true;
        
        while(!queue.isEmpty()){      
            int cur = queue.poll();
            
            for(int i=0; i<rooms.get(cur).size(); i++){
                int next = rooms.get(cur).get(i);
                if(!visited[next]){
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}
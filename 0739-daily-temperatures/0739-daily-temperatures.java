import java.util.*;
import java.io.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        int[] answer = new int[temperatures.length];

        for(int i=0; i<temperatures.length ; i++){
            int[] cur = new int[2]; // [일자, 온도]
            cur[0] = i; //일자
            cur[1] = temperatures[i]; // 온도

            while(true){
                if(stack.isEmpty()){
                    stack.push(cur);
                    break;
                }else{
                    int[] target = stack.peek();
                    int target_day = target[0];
                    int target_temp = target[1];

                    if(target_temp < cur[1]){
                        answer[target_day] = cur[0] - target_day;
                        stack.pop();
                    }else{
                        stack.push(cur);
                        break;
                    }
                }
            }
            
        }

        return answer;
    }
}
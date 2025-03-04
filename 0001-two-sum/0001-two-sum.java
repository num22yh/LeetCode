import java.io.*;
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums 에서 조합해볼 수 있는 모든 2 가지 숫자 탐색 (O(N^2), 최대 10^8)
        // 조합한 두 숫자의 합 == target 이면 그 수의 인덱스 반환

        int[] result = new int[2];

        for(int i=0; i <nums.length-1; i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }
}
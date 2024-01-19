public class Solution {
    public int minSizeSubarray(int[] nums, int target) {
        int sum = 0;
        int n = nums.length;
        int start = 0;
        int cycles = 0;
        int min = Integer.MAX_VALUE;
        for( int end = 0; start < n ; end++){
            if(end == n){
                cycles++;
                end = 0;
            }
            if(sum < target){
                sum += nums[end];
            }
            if(sum == target){
                min = Math.min(min, n * cycles + end - start + 1 );
            }
            while(sum >= target){
                sum -= nums[start];
                if(sum == target){
                    start++;
                    min = Math.min(min, n * cycles + end - start + 1 );
                }else start++;

                if(start == n){
                    break;
                }
            }
            if(sum == target){
                min = Math.min(min, n * cycles + end - start + 1);
            }

        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
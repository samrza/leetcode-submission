import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        //if ( nums.length == 1 ) return nums;

        for ( int read =0; read < nums.length ; read++){
            nums[read] = nums[read] * nums[read];

        }

        Arrays.sort(nums);

        return nums;
        
    }
}
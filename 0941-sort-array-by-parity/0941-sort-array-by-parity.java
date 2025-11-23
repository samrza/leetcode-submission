import java.util.ArrayList;
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] output = new int[nums.length]; 
        int right = nums.length-1;
        int left = 0;

        for ( int read = 0; read <= nums.length-1; read++ ){
            if ( nums[read]%2 == 0){
                output[left] = nums[read];
                left++;
            } else {
                output[right] = nums[read];
                right--;
            }
        }

        return output;



        
    }
}


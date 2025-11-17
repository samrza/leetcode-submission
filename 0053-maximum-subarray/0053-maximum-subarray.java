class Solution {
    public int maxSubArray(int[] nums) {

        if ( nums.length == 1) return nums[0];

        int maxSum = nums[0];
        int currentSum = nums[0];


        for ( int i =1; i < nums.length; i++){

            currentSum = currentSum + nums[i];

            if (nums[i] > currentSum) {
                currentSum = nums[i];
            }


            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            
            

        }

        return maxSum;

        
    }
}
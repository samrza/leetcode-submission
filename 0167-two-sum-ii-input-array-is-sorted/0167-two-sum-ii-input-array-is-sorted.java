class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        ArrayList <Integer> output = new ArrayList<>();


        

        while( left< right){
            int sum = numbers[left] + numbers[right];

            if ( sum == target){

                output.add(left+1);
                output.add(right+1);


                int[] result = new int[output.size()];

                for(int i = 0 ; i < output.size(); i++){
                    result[i] = output.get(i);
                }

                return result;
            }

            if ( sum < target){
                left++;
            } else{
                right--;
            }
        }

        return new int[0];
        
    }
}
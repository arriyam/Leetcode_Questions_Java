class Solution {
    public int maxSubArray(int[] nums) {
        int max_value=Integer.MIN_VALUE,value1=0;
        for (int i=0;i<nums.length;i++){
            value1=value1+nums[i];
            if (value1<nums[i]){
                value1=nums[i];
            }
            if (max_value<value1){
                max_value=value1;
            }
        }
        return max_value;
    }
}

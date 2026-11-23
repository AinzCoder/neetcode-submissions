class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxLen =0;
        int k = nums.length;

        for(int i=0;i<k;i++){
            if(nums[i]==1){
                count++;
                maxLen = Math.max(maxLen, count);
            }
            else{
                count =0;
            }
        }
        return maxLen;
    }
}
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int capacity = n * 2;
        int[] ans = new int[capacity];

        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
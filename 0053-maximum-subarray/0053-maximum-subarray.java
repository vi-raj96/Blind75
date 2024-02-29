class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum=nums[i]+sum;
            mx=Math.max(sum,mx);
            if(sum<0)
            {
                sum=0;
            }
        }
        return mx;
    }
}
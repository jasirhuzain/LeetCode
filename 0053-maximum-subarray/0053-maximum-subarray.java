class Solution {
    public int maxSubArray(int[] nums) {
    int max=0;
    int sum= nums[0];
    for(int i=0;i<nums.length;i++){
        max+=nums[i];
        sum=Math.max(max,sum);
        if(max<0)max=0;
      } 
      return sum;
    }   
}
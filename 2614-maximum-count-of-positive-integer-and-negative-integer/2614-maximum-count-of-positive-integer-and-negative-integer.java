class Solution {
    public int maximumCount(int[] nums) {
      int ncount =0;
      int pcount=0;
       
      for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            pcount++;
        }else if(nums[i]<0){
            ncount++;
        }
        
      }
      return Math.max(pcount,ncount);
    }
}
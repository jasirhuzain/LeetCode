class Solution {
    public int missingNumber(int[] nums) {
      int n = nums.length;
      int actualsum=0;
      int expectedsum =(n*(n+1)) /2;
      for(int i = 0; i<n; i++){
        actualsum +=nums[i];
         }
     int missingvalue = expectedsum-actualsum;
     return missingvalue;

    }
}
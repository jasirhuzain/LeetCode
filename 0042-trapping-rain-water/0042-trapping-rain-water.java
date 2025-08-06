class Solution {
    public int trap(int[] height) {
    int n = height.length; 
    int [] rightMax = new int[n];
    int [] leftMax = new int[n];
    int [] waterTrapped = new int[n];
   
         rightMax[n-1]=height[n-1]; 
         leftMax[0] = height[0];
        for(int j =n-2;j>=0;j--){
            rightMax[j]= Math.max(rightMax[j+1],height[j]);
        }
        for(int j =1;j<n;j++){
            leftMax[j] = Math.max(leftMax[j-1],height[j]);
        }
        int totalWater =0;
        for(int i =0;i<n;i++){
        waterTrapped[i] = Math.min(leftMax[i],rightMax[i]) - height[i];
        totalWater+=waterTrapped[i];
        }
    return totalWater;
    }
}
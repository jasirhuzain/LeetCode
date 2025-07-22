class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i =0;i<n;i++){
            int left = 0, right = n-1;
            while(left<=right){

                int leftval = image[i][left];
                int rightval = image[i][right];

                
                image[i][left] = 1-rightval;
                image[i][right] = 1-leftval;
                  left++;
            right--;
            }
          
        }
        return image;
    }
}
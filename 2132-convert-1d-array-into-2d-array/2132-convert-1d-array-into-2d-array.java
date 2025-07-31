class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int c =0;
        int s = original.length;
        int [][] arr = new int[m][n];
        if(s==m*n){
            for(int i =0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=original[c];
                    c++;
                }
            }
            return arr;
        }
        
        return new int [][]{};
    }
}
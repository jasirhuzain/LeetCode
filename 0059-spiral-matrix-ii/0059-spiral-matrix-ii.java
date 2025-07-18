class Solution {
    public int[][] generateMatrix(int n) {
        int [][] arr = new int [n][n];
        int rB = 0;
        int rE = arr.length - 1;
        int cB = 0;
        int cE = arr.length -1;
        int value = 1;

        while(rB<=rE && cB<=cE){
            for(int j = cB; j<=cE; j++){
            arr[rB][j] = value++;
            }
            rB++;
            for(int j =rB;j<=rE;j++){
                arr[j][cE] = value++;
            }
            cE--;
            if(rB<=rE){
            for(int j =cE;j>=cB;j--){
                arr[rE][j] = value++;
            }
            }
            rE--;
            if(cB<=cE){
            for(int j =rE;j>=rB;j--){
                arr[j][cB] = value++;
            }
            }
            cB++;
        }
        return arr;
    }
}
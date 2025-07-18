class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> res = new ArrayList <>();

        if(matrix.length == 0)
        return res;

        int rB = 0;
        int rE = matrix.length - 1;
        int cB = 0;
        int cE = matrix[0].length -1;

        while(rB<=rE && cB<=cE){
            for(int j = cB; j<=cE; j++){
                res.add(matrix[rB][j]);
            }
            rB++;
            for(int j =rB;j<=rE;j++){
                res.add(matrix[j][cE]);
            }
            cE--;
            if(rB<=rE){
            for(int j =cE;j>=cB;j--){
                res.add(matrix[rE][j]);
            }
            }
            rE--;
            if(cB<=cE){
            for(int j =rE;j>=rB;j--){
                res.add(matrix[j][cB]);
            }
            }
            cB++;
        }
        return res;

    }
}
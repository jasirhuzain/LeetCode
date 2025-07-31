class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        
        int[] arr = new int[total];
        int count = 0;
        
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[count++] = grid[i][j];
            }
        }
        
       
        int[] rotated = new int[total];
        for (int i = 0; i < total; i++) {
            rotated[(i + k) % total] = arr[i];
        }
        
     
        List<List<Integer>> result = new ArrayList<>();
        count = 0;
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(rotated[count++]);
            }
            result.add(row);
        }
        
        return result;
    }
}

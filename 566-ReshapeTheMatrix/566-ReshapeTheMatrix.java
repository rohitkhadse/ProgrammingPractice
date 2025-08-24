// Last updated: 8/24/2025, 12:32:24 PM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        
        int[][] resultArr = new int[r][c];
        
        if(mat.length==0 || r*c != mat.length * mat[0].length)
            return mat;
        
        int count = 0;
        
        for(int m=0; m<mat.length; m++)
        {
            for(int n=0; n<mat[0].length; n++)
            {
                resultArr[count/c][count%c] = mat[m][n];
                count++;
            }
        }
        
        return resultArr;
    }
}
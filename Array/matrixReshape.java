class Solution
{
    public int[][] matrixReshape(int[][] mat, int r, int c)
    {
        int size = mat.length * mat[0].length;
        
        if(size != (r * c))
            return mat;
        
        int[] origArr = new int[size];
        
        int k = 0;
        for(int i = 0 ; i < mat.length ; i++)
            for(int j = 0 ; j < mat[0].length ; j++, k++)
                origArr[k] = mat[i][j];
        
        int[][] newMat = new int[r][c];
        k = 0;
        
        for(int i = 0 ; i < r ; i++)
            for(int j = 0 ; j < c ; j++, k++)
                newMat[i][j] = origArr[k];
        
        return newMat;
    }
}

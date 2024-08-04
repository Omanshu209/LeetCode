class Solution
{
    public int[][] imageSmoother(int[][] img)
    {
        int[][] newImg = new int[img.length][img[0].length];
        
        for(int i = 0 ; i < img.length ; i++)
        {
            for(int j = 0 ; j < img[0].length ; j++)
            {
                int sum = 0, count = 0;
                
                for(int k = (i - 1) ; k <= (i + 1) ; k++)
                {
                	for(int l = (j - 1) ; l <= (j + 1) ; l++)
                  {   
                		if(k >= 0 && l >= 0 && k < img.length && l < img[0].length)
                		{
                			sum += img[k][l];
                			count++;
                		}
                	}
                }
                
                newImg[i][j] = (int) Math.floor(sum / count);
            }
        }
        
        return newImg;
    }
}

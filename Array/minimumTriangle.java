class Solution
{
    private static int minimum(List<List<Integer>> triangle, int min, int i, int j, int sum)
    {
        if(triangle.size() - 1 == i)
            return Math.min(sum + triangle.get(i).get(j), min);

        else if(sum >= min)
            return sum;

        int left = minimum(triangle, min, i + 1, j, sum + triangle.get(i).get(j));
        int right = minimum(triangle, min, i + 1, j + 1, sum + triangle.get(i).get(j));

        return Math.min(left, right);
    }

    public int minimumTotal(List<List<Integer>> triangle)
    {
        return minimum(triangle, Integer.MAX_VALUE, 0, 0, 0);
    }
}

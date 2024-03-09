class Solution
{
    public int getCommon(int[] nums1, int[] nums2)
    {
        int min = -1, start, end, mid;

        for(int i : nums1)
        {
            start = 0;
            end = nums2.length - 1;

            while(start <= end)
            {
                mid = (start + end) / 2;

                if(nums2[mid] == i && (min == -1 || min > i))
                    min = i;
                else if(nums2[mid] < i)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return min;
    }
}

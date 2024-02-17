class Solution
{
    public static int findMergedElement(int[] nums1, int[] nums2, int pos)
    {
        int index1 = 0, index2 = 0, num = 0;

        for(int i = 0 ; i < pos ; i++)
        {
            if(index1 == nums1.length)
            {
                num = nums2[index2];
                index2++;
            }

            else if(index2 == nums2.length)
            {
                num = nums1[index1];
                index1++;
            }

            else
            {
                num = Math.min(nums1[index1], nums2[index2]);

                if(nums1[index1] <= nums2[index2])
                    index1++;

                else
                    index2++;
            }
        }

        return num;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int totalElements = nums1.length + nums2.length;

        if(totalElements % 2 != 0)
            return findMergedElement(nums1, nums2, (int) Math.ceil(totalElements / 2.0));
        
        return (findMergedElement(nums1, nums2, totalElements / 2) + findMergedElement(nums1, nums2, totalElements / 2 + 1)) / 2.0;
    }
}

class Solution
{
    public char nextGreatestLetter(char[] letters, char target)
    {
        int left = 0, right = letters.length - 1, mid;

        while(left <= right)
        {
            mid = (left + right) / 2;

            if(letters[mid] > target && (mid == 0 || letters[mid - 1] <= target))
                return letters[mid];
            else if(letters[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return letters[0];
    }
}

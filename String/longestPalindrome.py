class Solution:

    def longestPalindrome(self, s: str) -> str:
        longest: str = ""

        for i, _ in enumerate(s):
            for j in range(i + 1, len(s) + 1):
                substr = s[i : j]
                if substr == substr[:: -1] and len(substr) > len(longest):
                    longest = substr
        
        return longest

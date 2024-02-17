class Solution:

    def lengthOfLongestSubstring(self, s: str) -> int:
        longest = ""
        temp = ""

        def update_longest(temp: str, longest: str):
            if len(temp) > len(longest):
                longest = temp
            return "", longest
        
        for i in range(len(s)):
            if len(longest) >= len(s[i:]):
                break
            
            for _, char in enumerate(s[i:]):
                if char not in temp:
                    temp += char
                else:
                    temp, longest = update_longest(temp, longest)
            temp, longest = update_longest(temp, longest)
        
        return len(longest)
